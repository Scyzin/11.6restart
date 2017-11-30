package reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * InputStreamReader(InputStream in) 
 * 		创建一个使用默认字符集的 InputStreamReader
 * InputStreamReader(InputStream in, Charset cs) 
 * 		创建使用给定字符集的 InputStreamReader。
 * 
 */
public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"));
		
		int by = 0  ;
		while((by = isr.read())!= -1) {
			System.out.print((char)by);
		}
		isr.close();
		
	}
}
