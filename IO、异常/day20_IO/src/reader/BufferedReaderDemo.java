package reader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ���ַ��������ж�ȡ�ı�����������ַ����Ӷ�ʵ���ַ���������еĸ�Ч��ȡ�� 
 * 
 * BufferedReader(Reader in)   ����һ��ʹ��Ĭ�ϴ�С���뻺�����Ļ����ַ���������
 * BufferedReader(Reader in, int sz)  ����һ��ʹ��ָ����С���뻺�����Ļ����ַ���������
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
