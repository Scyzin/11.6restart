package udp;

import java.net.InetAddress;
import java.net.UnknownHostException;
/*
 * һ����û�й��췽����
 * 		��Աȫ�Ǿ�̬��
 * 		�������ģʽ
 * 		�����о�̬�������ظ���Ķ���
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
