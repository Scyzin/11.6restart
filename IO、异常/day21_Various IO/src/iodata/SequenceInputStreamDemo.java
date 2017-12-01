package iodata;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/*
 * public SequenceInputStream(InputStream s1,InputStream s2)ͨ����ס��������������ʼ���´����� SequenceInputStream������˳���ȡ�������������ȶ�ȡ s1��Ȼ���ȡ s2����
 * 			���ṩ�Ӵ� SequenceInputStream ��ȡ���ֽڡ� 
 * �������ļ������ݸ��Ƶ��������ļ���
 * 
 * SequenceInputStream(Enumeration<? extends InputStream> e) 
 * 
 */
public class SequenceInputStreamDemo {
	public static void main(String[] args) throws IOException {
		
		/*InputStream s1 = new FileInputStream("ByteArrayStreamDemo.java");
		InputStream s2 = new FileInputStream("pw.txt");
		//�����������inputstream����
		SequenceInputStream sis = new SequenceInputStream(s1,s2);
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.txt"));
		
		byte[] bys = new byte[1024];
		int len = 0;
		//��ȡ�������ַ��顣
		while((len = sis.read(bys)) != -1) {
			bos.write(bys,0,len);
		}
		bos.close();
		sis.close();*/
		
		//Enumeration ��vector�е�һ�������ķ���ֵ��ö��
		Vector<InputStream> v = new Vector<InputStream>();
		
		InputStream s1 = new FileInputStream("ByteArrayStreamDemo.java");
		InputStream s2 = new FileInputStream("pw.txt");
		InputStream s3 = new FileInputStream("copy.txt");
		v.add(s1);
		v.add(s2);
		v.add(s3);
		Enumeration<InputStream> en = v.elements();
		SequenceInputStream sis = new SequenceInputStream(en);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy2.txt"));
		
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = sis.read(bys))!= -1) {
			bos.write(bys,0,len);
		}
		sis.close();
		bos.close();
		
	}
}
