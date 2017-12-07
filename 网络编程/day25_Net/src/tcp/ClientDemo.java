package tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/*
 * TCPЭ�鷢�����ݣ�
 * A:�������Ͷ�Socket����
 * B:�������ݣ��������ݴ��
 * C:����Socket����ķ��ͷ����������ݰ�
 * D:�ͷ���Դ
 * 
 * ���ӱ��ܾ���TCPЭ��һ��Ҫ�ȿ���������
 * java.net.ConnectException: Connection refused: connect
 * �ҵ�IP��ַ��
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		
		// Socket(InetAddress address, int port)
		// Socket(String host, int port)
		Socket s = new Socket("49.123.70.11", 8888);
		
		// ��ȡ�������д����
		// public OutputStream getOutputStream()
		OutputStream os = s.getOutputStream();
		os.write("hello,tcp,������".getBytes());

		// �ͷ���Դ
		s.close();
	}
}
