package reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 
 * public int read()	一次读一个字节
 * public int read(char[] cbuf)		一次读一个数组
 */
public class InputStreamReaderDemo2 {
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"));

		char[] a =new char[1024];
		int len = 0;
		while ((len = isr.read(a)) != -1) {
			System.out.print(new String(a,0,len));
		}
		isr.close();
		
		/*int by = 0;
		while ((by = isr.read()) != -1) {
			System.out.print((char) by);
		}
		isr.close();*/
		
	}
}
