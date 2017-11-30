package test需要多看;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*
 * outputstream reader / writer 可以指定编码集
 * inputstreamreader  21毫秒
 * 
 */
public class IO1 {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"));
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("b.txt"));
		
		//方式1
		int ch = 0;
		while((ch=isr.read()) !=-1){
			osw.write((char)ch);
		}
		/*
		char[] a = new char[1024];
		int len = 0;
		while((len =isr.read(a))!= -1) {
			osw.write(a,0,len);
			osw.flush();
		}*/
		isr.close();
		osw.close();
		long end = System.currentTimeMillis();
		System.out.println("持续时间：" + (end - start ) +"毫秒");
	}
}
