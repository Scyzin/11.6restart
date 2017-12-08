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
 * TCP协议接收数据：
 * A:创建接收端的Socket对象
 * B:监听客户端连接。返回一个对应的Socket对象
 * C:获取输入流，读取数据显示在控制台
 * D:释放资源\
 * 
 * 服务器要先开
 */
public class ServerDemo {
	public static void main(String[] args)throws IOException {
		//创建接收端的套接字
		ServerSocket ss = new ServerSocket(6566);
		//监听客户端，返回socket
		Socket s = ss.accept();//这个是阻塞式的。
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String line = null;
			while((line = br.readLine())!=null) {
					System.out.println(line);
				}
		
		//获取输入流，读数据
		
		/*
		 InputStream is = s.getInputStream();
		byte[]bys = new byte[1024];
		String str = new String(bys,0,is.read(bys));
		
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip + "-----" + str);*/
		
		s.close();
		//ss不用关闭。
		
	}
}
