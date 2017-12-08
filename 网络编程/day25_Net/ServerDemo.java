package tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;


/*
 * TCPЭ��������ݣ�
 * A:�������ն˵�Socket����
 * B:�����ͻ������ӡ�����һ����Ӧ��Socket����
 * C:��ȡ����������ȡ������ʾ�ڿ���̨
 * D:�ͷ���Դ\
 * 
 * ������Ҫ�ȿ�
 */
public class ServerDemo {
	public static void main(String[] args)throws IOException {
		//�������ն˵��׽���
		ServerSocket ss = new ServerSocket(6566);
		//�����ͻ��ˣ�����socket
		Socket s = ss.accept();//���������ʽ�ġ�
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String line = null;
			while((line = br.readLine())!=null) {
					System.out.println(line);
				}
		
		//��ȡ��������������
		
		/*
		 InputStream is = s.getInputStream();
		byte[]bys = new byte[1024];
		String str = new String(bys,0,is.read(bys));
		
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip + "-----" + str);*/
		
		s.close();
		//ss���ùرա�
		
	}
}
