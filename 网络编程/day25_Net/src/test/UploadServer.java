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
		// 创建服务器端的Socket对象
		ServerSocket ss = new ServerSocket(11111);

		// 监听客户端连接
		Socket s = ss.accept();// 阻塞
		
		/*BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
		// 封装图片文件
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("mn.jpg"));*/
		/*byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
			bos.flush();
		}

		// 给一个反馈
		OutputStream os = s.getOutputStream();
		os.write("图片上传成功".getBytes());*/

		// 封装通道内的流
		BufferedReader br = new BufferedReader(new InputStreamReader(
				s.getInputStream()));
		// 封装文本文件
		BufferedWriter bw = new BufferedWriter(new FileWriter("Copy.java"));

		String line = null;
		while ((line = br.readLine()) != null) { // 阻塞
		// if("over".equals(line)){
		// break;
		// }
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		// 给出反馈
		BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(
				s.getOutputStream()));
		bwServer.write("文件上传成功");
		bwServer.newLine();
		bwServer.flush();

		// 释放资源
		bw.close();
		s.close();
	}
}
