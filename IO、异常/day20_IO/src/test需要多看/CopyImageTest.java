package test��Ҫ�࿴;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * ������file(string filename);
 * Ҳ������file(File file); ����֮ǰ�ö���File����
 * 
 */
public class CopyImageTest {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		String na1 = "E:\\java ��Ƶ\\���ǲ���_2015��Java������Ƶ-����ǳ��������\\day21\\day21\\code\\IO��С��ͼ��.bmp";
		String na2 = "E:\\java ��Ƶ\\11.6 java\\ioС��ͼ��.bmp";

		method3(na1, na2);
		long end = System.currentTimeMillis();
		System.out.println("��ʱ" + (end - start) + "����");
	}

	// �����ֽ�����дһ���ֽ�,��ʱ56821����
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

	// �����ֽ�����дһ���ֽ�����,��ʱ65956����
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

	// ��Ч�ֽ�����дһ���ֽ�,��ʱ526����
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

	// ��Ч�ֽ�����дһ���ֽ�����,��ʱ35126����,1024�Ҳ�����β�����Բ����ظ��Ķ�
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
