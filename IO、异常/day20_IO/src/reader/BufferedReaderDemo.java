package reader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取。 
 * 
 * BufferedReader(Reader in)   创建一个使用默认大小输入缓冲区的缓冲字符输入流。
 * BufferedReader(Reader in, int sz)  创建一个使用指定大小输入缓冲区的缓冲字符输入流。
 * 
 */
public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		//BufferedReader a = new BufferedReader(new InputStreamReader(new FileInputStream("b.txt")));
		BufferedReader a = new BufferedReader(new FileReader("b.txt"));
		
		int by = 0;
		while((by=a.read())!=-1) {
			System.out.print((char)by);
		}
		
//		char[] b = new char[1024];
//		int len = 0;
//		while((len = a.read(b))!=-1){
//			System.out.println(new String(b,0,len));
//		}
		
	}
}
