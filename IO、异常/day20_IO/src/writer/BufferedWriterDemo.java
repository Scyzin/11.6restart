package writer;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * ���ı�д���ַ����������������ַ����Ӷ��ṩ�����ַ���������ַ����ĸ�Чд�롣 
 * BufferedWriter(Writer out)  ����һ��ʹ��Ĭ�ϴ�С����������Ļ����ַ��������
 * BufferedWriter(Writer out, int sz)  ����һ��ʹ�ø�����С������������»����ַ��������
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
