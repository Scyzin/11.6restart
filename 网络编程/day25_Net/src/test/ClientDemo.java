package test;
/* TCPЭ�鷢�����ݣ�
* A:�������Ͷ�Socket����
* B:�������ݣ��������ݴ��
* C:����Socket����ķ��ͷ����������ݰ�
* D:�ͷ���Դ
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args)throws IOException {
		Socket s = new Socket("49.123.70.11", 6566);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

		String line = null;
		while ((line = br.readLine()) != null) {
			if ("886".equals(line)) {//����¼��Ҫ�Զ���������
				//��ȡ�ļ�����Ҫ�Զ���������
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		
	}
		s.close();
}
}
