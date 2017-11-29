package io_file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���������ֽ�����ʽ�����ļ�
 * 
 */
public class TestTime {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		//��ʱ62296����
		//method1("E:\\java ��Ƶ\\11.6 java\\����ľ�̬��ʼ�����ڴ�ͼ.bmp", "copy.bmp");
		//��ʱ52549����
		//method2("E:\\java ��Ƶ\\11.6 java\\����ľ�̬��ʼ�����ڴ�ͼ.bmp", "copy.bmp");
		//��ʱ1219����
		//method3("E:\\java ��Ƶ\\11.6 java\\����ľ�̬��ʼ�����ڴ�ͼ.bmp", "copy.bmp");
		//��ʱ106386����  
		//�������⣬Ϊʲô��ʱ��ô�ࣿ
		method4("E:\\java ��Ƶ\\11.6 java\\����ľ�̬��ʼ�����ڴ�ͼ.bmp", "copy.bmp");
		long end = System.currentTimeMillis();
		System.out.println("��ʱ" + (end - start) + "����");
	}
	//�����ֽ�����дһ���ֽ�
	public static void method1(String s1, String s2) throws IOException {
		FileInputStream a = new FileInputStream(s1);
		FileOutputStream b = new FileOutputStream(s2);

		int i = 0;
		while ((i = a.read()) != -1) {
			b.write(i);
		}
	}
	//�����ֽ�����дһ���ֽ�����
	public static void method2(String s1, String s2) throws IOException {
		FileInputStream a = new FileInputStream(s1);
		FileOutputStream b = new FileOutputStream(s2);

		byte[] c = new byte[1024];
		int len = 0;
		while ((len = a.read()) != -1) {
			b.write(c, 0, len);
		}
	}
	//��Ч�ֽ�����дһ���ֽ�
	public static void method3(String s1, String s2) throws IOException {
		BufferedInputStream a = new BufferedInputStream(new FileInputStream(s1));
		BufferedOutputStream b = new BufferedOutputStream(new FileOutputStream(s2));
		int i = 0;
		while ((i = a.read()) != -1) {
			b.write(i);
		}
	}
	//��Ч�ֽ�����дһ���ֽ�����
	public static void method4(String s1, String s2) throws IOException {
		BufferedInputStream a = new BufferedInputStream(new FileInputStream(s1));
		BufferedOutputStream b = new BufferedOutputStream(new FileOutputStream(s2));
		byte[] c = new byte[1024];
		int len = 0;
		while ((len = a.read()) != -1) {
			b.write(c, 0, len);
		}
	}
}
