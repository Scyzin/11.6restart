package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * UDP协议接收数据：
 * A:创建接收端Socket对象
 * B:创建一个数据包(接收容器)
 * C:调用Socket对象的接收方法接收数据
 * D:解析数据包，并显示在控制台
 * E:释放资源
 * 
 * 键盘录入
 */
public class UDPReceiveDemo {
	public static void main(String[] args) throws IOException {

		DatagramSocket ds = new DatagramSocket(10086);

		while (true) {
			byte[] bys = new byte[1024];
			DatagramPacket dp = new DatagramPacket(bys, bys.length);

			// 调用Socket对象的接收方法接收数据
			ds.receive(dp);// 阻塞式

			// 解析数据包，并显示在控制台
			// 获取对方的ip
			String ip = dp.getAddress().getHostAddress();

			String s = new String(dp.getData(), 0, dp.getLength());
			System.out.println(ip + "传递的数据是:" + s);

			// ds.close(); 接受端不应该关掉。
		}
	}
}
