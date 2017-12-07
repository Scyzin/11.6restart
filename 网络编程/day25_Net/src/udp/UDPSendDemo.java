package udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * UDP协议发送数据：
 * A:创建发送端Socket对象
 * B:创建数据，并把数据打包
 * C:调用Socket对象的发送方法发送数据包
 * D:释放资源
 * 
 * 电脑上的端口可能被占用了。
 * 
 * 我的IP地址：49.123.70.11
 */
public class UDPSendDemo {
	public static void main(String[] args) throws IOException {
		// 创建发送socket对象
		DatagramSocket ds = new DatagramSocket();

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
			int port = 10086;

			DatagramPacket dp = new DatagramPacket(bys, bys.length, 
					address, port);
			// 调用Socket对象的发送方法发送数据包
			ds.send(dp);
		}
		// 释放资源
		ds.close();

	}
}
