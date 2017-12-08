package tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
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
public class ClientDemo1 {
	public static void main(String[] args) throws IOException {

		// Socket(InetAddress address, int port)
		// Socket(String host, int port)
		Socket s = new Socket("49.123.70.11", 6566);
		
		//��װ�������������¼������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//����ͨ�����outputstream������ͨ���ڵ�����װһ��
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

		String line = null;
		while ((line = br.readLine()) != null) {
			if ("886".equals(line)) {//����¼��Ҫ�Զ���������
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		// ��ȡ�������д����
		// public OutputStream getOutputStream()
		/*
		 * OutputStream os = s.getOutputStream(); 
		 * os.write("hello,tcp,������".getBytes());
		 */

		// �ͷ���Դ
		s.close();
	}
}
