package test��Ҫ�࿴;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * �����Ĳ�������ʹ�ñ���Ĭ�ϱ��룬���ԣ�����ָ�����롣
 * ��ת�����������е㳤�����ԣ�Java���ṩ�������๩����ʹ�á�
 * OutputStreamWriter = FileOutputStream + �����(GBK)
 * FileWriter = FileOutputStream + �����(GBK)
 * 
 * InputStreamReader = FileInputStream + �����(GBK)
 * FileReader = FileInputStream + �����(GBK)
 * 
 * FileReader(File file) 
 * FileReader(String fileName) 
 * 
 * 	file reader  22����
 /*
 */
public class IO2 {
public static void main(String[] args) throws IOException{
	long start = System.currentTimeMillis();
	FileReader ir = new FileReader("a.txt");
	FileWriter ow = new FileWriter("b.txt");
	
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
