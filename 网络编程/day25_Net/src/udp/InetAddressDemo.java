package udp;

import java.net.InetAddress;
import java.net.UnknownHostException;
/*
 * 一个类没有构造方法：
 * 		成员全是静态的
 * 		单例设计模式
 * 		类中有静态方法返回该类的对象
 * 
 */
public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		
		//InetAddress address = InetAddress.getByName("192.168.1.1");
		InetAddress address = InetAddress.getByName("DELLWWW-1JBIBES");
		
		String name = address.getHostAddress();
		String ip = address.getHostName();
		
		System.out.println(name +" " +ip);
	}
}
