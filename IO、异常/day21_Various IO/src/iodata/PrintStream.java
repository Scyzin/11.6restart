package iodata;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*
 * ��ӡ��
 * �ֽ�����ӡ��	PrintStream
 * �ַ���ӡ��	PrintWriter
 * 
 * ��ӡ�����ص㣺
 * 		A:ֻ��д���ݵģ�û�ж�ȡ���ݡ�ֻ�ܲ���Ŀ�ĵأ����ܲ�������Դ��
 * 		B:���Բ����������͵����ݡ�
 * 		C:����������Զ�ˢ�£��ܹ��Զ�ˢ�¡�
 * 		D:�����ǿ���ֱ�Ӳ����ı��ļ��ġ�
 * 			��Щ�������ǿ���ֱ�Ӳ����ı��ļ�����?
 * 			FileInputStream
 * 			FileOutputStream
 * 			FileReader
 * 			FileWriter
 * 			PrintStream
 * 			PrintWriter
 * 			��API,��������Ĺ��췽�������ͬʱ��File���ͺ�String���͵Ĳ�����
 * 			һ����˵���ǿ���ֱ�Ӳ����ļ��ġ�
 * 
 * 			����
 * 				�������������ܹ�ֱ�Ӷ�д�ļ���
 * 				�߼������ڻ������������ṩ��һЩ�����Ĺ���
 */
public class PrintStream {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("pw.txt");
		
		pw.write("hello");	pw.print("hello");
		pw.write(98);pw.print(98);
		pw.flush();
		pw.write('a');//write�޷������Զ�ˢ��
		
		pw.close();
	}
}
