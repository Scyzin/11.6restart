package iodata;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/*
 * PrintWriter(Writer out, boolean autoFlush) 创建带自动刷新的printwriter
 * 如果为 true，则 println、printf 或 format 方法将刷新输出缓冲区
 * println不仅自动刷新，还换行了
 * 
 * print println 可以操作任意类型的数据
 * 
 * println等价于
 * 		bw.write() bw.newLine()  bw.flush()
 * 
 * 用打印流进行文件复制
 * 		printWriter  底层有高效实现
 * 
 */
public class PrintWriterDemo {
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("ByteArrayStreamDemo.java"));
		PrintWriter pw = new PrintWriter(new FileWriter("pw.txt"),true);
		
		String line =null;
		while((line =br.readLine()) != null) {
			pw.println(line);
		}
		br.close();
		pw.close();

	}
}
