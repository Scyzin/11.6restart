package test需要多看;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * 可以走file(string filename);
 * 也可以走file(File file); 但这之前得定义File对象
 * 
 */
public class CopyImageTest {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		String na1 = "E:\\java 视频\\传智播客_2015年Java基础视频-深入浅出精华版\\day21\\day21\\code\\IO流小结图解.bmp";
		String na2 = "E:\\java 视频\\11.6 java\\io小结图解.bmp";

		method3(na1, na2);
		long end = System.currentTimeMillis();
		System.out.println("耗时" + (end - start) + "毫秒");
	}

	// 基本字节流读写一个字节,耗时56821毫秒
	public static void method1(String s1, String s2) throws IOException {
		FileInputStream a = new FileInputStream(s1);
		FileOutputStream b = new FileOutputStream(s2);

		int i = 0;
		while ((i = a.read()) != -1) {
			b.write(i);
		}
		a.close();
		b.close();
	}

	// 基本字节流读写一个字节数组,耗时65956毫秒
	public static void method2(String s1, String s2) throws IOException {
		FileInputStream a = new FileInputStream(s1);
		FileOutputStream b = new FileOutputStream(s2);

		byte[] c = new byte[1024];
		int len = 0;
		while ((len = a.read()) != -1) {
			b.write(c, 0, len);
		}
		a.close();
		b.close();
	}

	// 高效字节流读写一个字节,耗时526毫秒
	public static void method3(String s1, String s2) throws IOException {
		BufferedInputStream a = new BufferedInputStream(new FileInputStream(s1));
		BufferedOutputStream b = new BufferedOutputStream(new FileOutputStream(s2));
		int i = 0;
		while ((i = a.read()) != -1) {
			b.write(i);
		}
		a.close();
		b.close();
	}

	// 高效字节流读写一个字节数组,耗时35126毫秒,1024找不到结尾，所以不断重复的读
	public static void method4(String s1, String s2) throws IOException {
		BufferedInputStream a = new BufferedInputStream(new FileInputStream(s1));
		BufferedOutputStream b = new BufferedOutputStream(new FileOutputStream(s2));
		byte[] c = new byte[1024];
		int len = 0;
		while ((len = a.read()) != -1) {
			b.write(c, 0, len);
		}
		a.close();
		b.close();
	}
}
