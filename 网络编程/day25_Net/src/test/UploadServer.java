package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {
	public static void main(String[] args) throws IOException {
		// �����������˵�Socket����
		ServerSocket ss = new ServerSocket(11111);

		// �����ͻ�������
		Socket s = ss.accept();// ����
		
		/*BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
		// ��װͼƬ�ļ�
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("mn.jpg"));*/
		/*byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
			bos.flush();
		}

		// ��һ������
		OutputStream os = s.getOutputStream();
		os.write("ͼƬ�ϴ��ɹ�".getBytes());*/

		// ��װͨ���ڵ���
		BufferedReader br = new BufferedReader(new InputStreamReader(
				s.getInputStream()));
		// ��װ�ı��ļ�
		BufferedWriter bw = new BufferedWriter(new FileWriter("Copy.java"));

		String line = null;
		while ((line = br.readLine()) != null) { // ����
		// if("over".equals(line)){
		// break;
		// }
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		// ��������
		BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(
				s.getOutputStream()));
		bwServer.write("�ļ��ϴ��ɹ�");
		bwServer.newLine();
		bwServer.flush();

		// �ͷ���Դ
		bw.close();
		s.close();
	}
}
