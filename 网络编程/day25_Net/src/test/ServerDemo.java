package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
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
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(6566);
		Socket s = ss.accept();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
		
		String line = null;
		while((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		s.close();
	}
}
