package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * UDPЭ��������ݣ�
 * A:�������ն�Socket����
 * B:����һ�����ݰ�(��������)
 * C:����Socket����Ľ��շ�����������
 * D:�������ݰ�������ʾ�ڿ���̨
 * E:�ͷ���Դ
 * 
 * ����¼��
 */
public class UDPReceiveDemo {
	public static void main(String[] args) throws IOException {

		DatagramSocket ds = new DatagramSocket(10086);

		while (true) {
			byte[] bys = new byte[1024];
			DatagramPacket dp = new DatagramPacket(bys, bys.length);

			// ����Socket����Ľ��շ�����������
			ds.receive(dp);// ����ʽ

			// �������ݰ�������ʾ�ڿ���̨
			// ��ȡ�Է���ip
			String ip = dp.getAddress().getHostAddress();

			String s = new String(dp.getData(), 0, dp.getLength());
			System.out.println(ip + "���ݵ�������:" + s);

			// ds.close(); ���ܶ˲�Ӧ�ùص���
		}
	}
}
