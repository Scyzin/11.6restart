package io_file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 测试四种字节流方式复制文件
 * 
 */
public class TestTime {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		//耗时62296毫秒
		//method1("E:\\java 视频\\11.6 java\\数组的静态初始化及内存图.bmp", "copy.bmp");
		//耗时52549毫秒
		//method2("E:\\java 视频\\11.6 java\\数组的静态初始化及内存图.bmp", "copy.bmp");
		//耗时1219毫秒
		//method3("E:\\java 视频\\11.6 java\\数组的静态初始化及内存图.bmp", "copy.bmp");
		//耗时106386毫秒  
		//出现问题，为什么耗时这么多？
		method4("E:\\java 视频\\11.6 java\\数组的静态初始化及内存图.bmp", "copy.bmp");
		long end = System.currentTimeMillis();
		System.out.println("耗时" + (end - start) + "毫秒");
	}
	//基本字节流读写一个字节
	public static void method1(String s1, String s2) throws IOException {
		FileInputStream a = new FileInputStream(s1);
		FileOutputStream b = new FileOutputStream(s2);

		int i = 0;
		while ((i = a.read()) != -1) {
			b.write(i);
		}
	}
	//基本字节流读写一个字节数组
	public static void method2(String s1, String s2) throws IOException {
		FileInputStream a = new FileInputStream(s1);
		FileOutputStream b = new FileOutputStream(s2);

		byte[] c = new byte[1024];
		int len = 0;
		while ((len = a.read()) != -1) {
			b.write(c, 0, len);
		}
	}
	//高效字节流读写一个字节
	public static void method3(String s1, String s2) throws IOException {
		BufferedInputStream a = new BufferedInputStream(new FileInputStream(s1));
		BufferedOutputStream b = new BufferedOutputStream(new FileOutputStream(s2));
		int i = 0;
		while ((i = a.read()) != -1) {
			b.write(i);
		}
	}
	//高效字节流读写一个字节数组
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
