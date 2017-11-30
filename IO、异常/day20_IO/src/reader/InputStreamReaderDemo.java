package reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * InputStreamReader(InputStream in) 
 * 		����һ��ʹ��Ĭ���ַ����� InputStreamReader
 * InputStreamReader(InputStream in, Charset cs) 
 * 		����ʹ�ø����ַ����� InputStreamReader��
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
