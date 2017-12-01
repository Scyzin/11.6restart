package iodata;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 *  标准输入输出流
 * System类中的两个成员变量：
 *		public static final InputStream in “标准”输入流。
 * 		public static final PrintStream out “标准”输出流。
 * 	
 * 		InputStream is =System.in
 * 		OutputStream os = System.out	
 * 
 * 		本质是IO流操作，把数据输出到控制台。
 *		System.out.println("helloworld");
 *		等价于下面的：
 *				PrintStream ps = System.out;
 *				ps.println("helloworld");
 *	
 *	System.out.print();不存在的。
 *
 *	System.in 标准输入流，从键盘录入数据
 *			1. main方法中args接收参数
 *			2.Scanner(JDK5)
 *					Scanner sc = new Scanner(System.in);
 *					String s = sc.nextLine();
 * 
 */
public class SystemOutDemo {
	public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("请输入一个字符串：");
			String line = br.readLine();
			System.out.println("你输入的字符串是:" + line);
			
			System.out.println("请输入一个整数：" );
			line = br.readLine();
			int i = Integer.parseInt(line);
			System.out.println("你输入的整数是：" + i);
			
			// // PrintStream ps = System.out;
			// // OutputStream os = ps;
			// OutputStream os = System.out; // 多态
			// OutputStreamWriter osw = new OutputStreamWriter(os);
			// BufferedWriter bw = new BufferedWriter(osw);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
						System.out));
			bw.write("hello");
			bw.newLine();
			// bw.flush();
			bw.write("world");
			bw.newLine();
			// bw.flush();
			bw.write("java");
			bw.newLine();
			bw.flush();
			bw.close();
			
	}
}
