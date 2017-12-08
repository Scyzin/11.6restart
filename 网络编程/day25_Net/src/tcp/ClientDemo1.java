package tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 * TCP协议发送数据：
 * A:创建发送端Socket对象
 * B:创建数据，并把数据打包
 * C:调用Socket对象的发送方法发送数据包
 * D:释放资源
 * 
 * 连接被拒绝。TCP协议一定要先看服务器。
 * java.net.ConnectException: Connection refused: connect
 * 我的IP地址：
 */
public class ClientDemo1 {
	public static void main(String[] args) throws IOException {

		// Socket(InetAddress address, int port)
		// Socket(String host, int port)
		Socket s = new Socket("49.123.70.11", 6566);
		
		//包装定义的流，键盘录入数据
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//发是通道类的outputstream流，把通道内的流包装一下
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

		String line = null;
		while ((line = br.readLine()) != null) {
			if ("886".equals(line)) {//键盘录入要自定义结束标记
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		// 获取输出流，写数据
		// public OutputStream getOutputStream()
		/*
		 * OutputStream os = s.getOutputStream(); 
		 * os.write("hello,tcp,我来了".getBytes());
		 */

		// 释放资源
		s.close();
	}
}
