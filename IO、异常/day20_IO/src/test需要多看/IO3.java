package test��Ҫ�࿴;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * bufferedread / writer  4����
 * 
 */

public class IO3 {
	public static void main(String[] args)throws IOException {
		long start = System.currentTimeMillis();
		BufferedReader ir = new BufferedReader(new FileReader("a.txt")) ;
		BufferedWriter ow = new BufferedWriter(new FileWriter("b.txt")) ;
		
		//��ʽ1
		int ch = 0;
		while((ch=ir.read()) !=-1){
			ow.write((char)ch);
		}
		/*
		char[] a = new char[1024];
		int len = 0;
		while((len =isr.read(a))!= -1) {
			osw.write(a,0,len);
			osw.flush();
		}*/
		ir.close();
		ow.close();
		long end = System.currentTimeMillis();
		System.out.println("����ʱ�䣺" + (end - start ) +"����");
	}
}
