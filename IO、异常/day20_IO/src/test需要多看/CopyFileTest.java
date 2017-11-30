package test需要多看;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 复制文本文件
 * 		可以用字符流写
 * 
 */
public class CopyFileTest {
	public static void main(String[] args)throws IOException {
		String srcString = "c:\\a.txt";
		String destString = "d:\\b.txt";
		
		long start = System.currentTimeMillis();
		method4(srcString,destString);
		
		long end = System.currentTimeMillis();
		System.out.println("耗时" + (end - start) + "毫秒");
		
	}
	//高效字符流特殊功能
	private static void method4(String srcString, String destString)throws IOException {
		BufferedReader a = new BufferedReader(new FileReader(srcString));
		BufferedWriter b = new BufferedWriter(new FileWriter(destString));	
		//4ms
		String line = null;
		while((line = a.readLine())!= null) {
			b.write(line);
			b.flush();
		}
		a.close();
		b.close();
	}
	//高效字符流
	private static void method3(String srcString, String destString) throws IOException {
		BufferedReader a = new BufferedReader(new FileReader(srcString));
		BufferedWriter b = new BufferedWriter(new FileWriter(destString));
		
		//53ms
		int t = 0;
		while((t = a.read())!= -1) {
			b.write((char)t);
			b.flush();
		}
		//3ms
		/*char[]c = new char[1024];
		int len= 0;
		while((len = a.read(c))!=-1) {
			b.write(c,0,len);
			b.flush();
		}*/
		a.close();
		b.close();
		
	}
	//基本字符流
	private static void method2(String srcString, String destString)throws IOException {
		FileReader a = new FileReader(srcString);
		FileWriter b = new FileWriter(destString);
		
		//65ms
		/*int t = 0;
		while((t = a.read())!= -1) {
			b.write((char)t);
			b.flush();
		}*/
		//4ms
		char[]c = new char[1024];
		int len= 0;
		while((len = a.read(c))!=-1) {
			b.write(c,0,len);
		}
		a.close();
		b.close();
	}

	//最原始字符流
	private static void method1(String srcString, String destString)throws IOException {
			InputStreamReader a = new InputStreamReader(new FileInputStream(srcString));
			OutputStreamWriter b = new OutputStreamWriter(new FileOutputStream(destString));
			//52ms
			int t = 0;
			while((t = a.read())!=-1) {
				b.write((char)t);
				b.flush();
			}
			//3ms
			/*char[]c = new char[1024];
			int len= 0;
			while((len = a.read(c))!=-1) {
				b.write(c,0,len);
			}*/
			a.close();
			b.close();
		
	}
}
