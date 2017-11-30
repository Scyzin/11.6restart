package writer;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * 将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入。 
 * BufferedWriter(Writer out)  创建一个使用默认大小输出缓冲区的缓冲字符输出流。
 * BufferedWriter(Writer out, int sz)  创建一个使用给定大小输出缓冲区的新缓冲字符输出流。
 */
public class BufferedWriterDemo {
	public static void main(String[] args)throws IOException {
		//BufferedWriter a = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("a.txt")));
		BufferedWriter a = new BufferedWriter(new FileWriter("a.txt"));
		
		a.write("hello");
		a.write("world");
		a.write("java");
		
		a.flush();
		
		a.close();
		
	}
	
}
