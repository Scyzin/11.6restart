package udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * UDPЭ�鷢�����ݣ�
 * A:�������Ͷ�Socket����
 * B:�������ݣ��������ݴ��
 * C:����Socket����ķ��ͷ����������ݰ�
 * D:�ͷ���Դ
 * 
 * �����ϵĶ˿ڿ��ܱ�ռ���ˡ�
 * 
 * �ҵ�IP��ַ��49.123.70.11
 */
public class UDPSendDemo {
	public static void main(String[] args) throws IOException {
		// ��������socket����
		DatagramSocket ds = new DatagramSocket();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while ((line = br.readLine()) != null) {
			if ("886".equals(line)) {
				break;
			}
			byte[] bys = line.getBytes();
			// ip��ַ����
			InetAddress address = InetAddress.getByName("DELLWWW-1JBIBES");
			// �˿�
			int port = 10086;

			DatagramPacket dp = new DatagramPacket(bys, bys.length, 
					address, port);
			// ����Socket����ķ��ͷ����������ݰ�
			ds.send(dp);
		}
		// �ͷ���Դ
		ds.close();

	}
}
