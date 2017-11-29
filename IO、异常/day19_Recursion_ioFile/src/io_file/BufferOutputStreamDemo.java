package io_file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ֽڻ��������	д����
 * BufferedOutputStream
 * �ֽڻ���������	������
 * BufferedInputStream
 *
 * ����������ָ����С.
 * ���������ֻ��Ϊ�˸�Ч����Ƶģ������Ķ�д��������������������ʵ�֡�
 * 
 * һ���ļ���ֻ����һ�ַ�ʽ��ȡ����Ϊ��ȡ��һ�κ󣬾͵���ĩβ��
 */
public class BufferOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		
		//�����������
		BufferedOutputStream a = new BufferedOutputStream(
				new FileOutputStream("c.txt"));
		
		a.write("hellojava".getBytes());
		
		a.close();
		
		BufferedInputStream b= new BufferedInputStream(new FileInputStream("a.txt"));
		byte [] bys = new byte[1024];
		int len = 0;
		while((len = b.read(bys)) != -1) {
			System.out.println(new String(bys,0,len));
		}
	}
}
