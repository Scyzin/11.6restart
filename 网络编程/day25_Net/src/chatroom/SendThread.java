package chatroom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendThread implements Runnable {

	private DatagramSocket ds;

	public SendThread(DatagramSocket ds) {
		this.ds = ds;
	}

	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = null;
			while ((line = br.readLine()) != null) {
				if ("886".equals(line)) {
					break;
				}
				byte[] bys = line.getBytes();
				// ip地址对象
				InetAddress address = InetAddress.getByName("DELLWWW-1JBIBES");
				// 端口
				int port = 6545;

				DatagramPacket dp = new DatagramPacket(bys, bys.length, address, port);
				// 调用Socket对象的发送方法发送数据包
				ds.send(dp);
			}
			// 释放资源
			ds.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
