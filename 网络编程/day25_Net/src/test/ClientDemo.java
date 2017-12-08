package test;
/* TCP协议发送数据：
* A:创建发送端Socket对象
* B:创建数据，并把数据打包
* C:调用Socket对象的发送方法发送数据包
* D:释放资源
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
			if ("886".equals(line)) {//键盘录入要自定义结束标记
				//读取文件不需要自定义结束标记
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		
	}
		s.close();
}
}
