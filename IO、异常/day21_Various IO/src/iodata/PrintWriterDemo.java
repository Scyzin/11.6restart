package iodata;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/*
 * PrintWriter(Writer out, boolean autoFlush) �������Զ�ˢ�µ�printwriter
 * ���Ϊ true���� println��printf �� format ������ˢ�����������
 * println�����Զ�ˢ�£���������
 * 
 * print println ���Բ����������͵�����
 * 
 * println�ȼ���
 * 		bw.write() bw.newLine()  bw.flush()
 * 
 * �ô�ӡ�������ļ�����
 * 		printWriter  �ײ��и�Чʵ��
 * 
 */
public class PrintWriterDemo {
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("ByteArrayStreamDemo.java"));
		PrintWriter pw = new PrintWriter(new FileWriter("pw.txt"),true);
		
		String line =null;
		while((line =br.readLine()) != null) {
			pw.println(line);
		}
		br.close();
		pw.close();

	}
}
