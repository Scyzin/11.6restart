/*
 * public final class Scannerextends Object
 * 		Scanner(InputStream source) 
 * 
 * System����public static final InputStream in
 * 		��ʾ����׼���������������Ѵ򿪲�׼���ṩ�������ݡ�
 * 		InputStrem in = System.in 
 * 
 * 			public boolean hasNextxxx():�ж��Ƿ���ĳ�����͵����뷵��true��false
 * 			public xxxnextxxx();��������Ϣ���Ϊxxx��
 * 
 * 		���õ�����������
 * 			public int nextInt();��ȡint���͵�ֵ
 * 			public String nextLine();��ȡһ��String��ֵ
 * 
 * 		һ�����⣺
 * 				�Ȼ�ȡһ����ֵ���ٻ�ȡһ��string��������⡣
 * 				����ڶ���ֵʱ���س���\n�ᱻ���ɵڶ�ֵ���룬ֱ�ӽ�����
 * 		�����
 * 			���������ݰ��ַ�����ȡ���ٶ�Ӧ��ת��
 */
package com.czs_01;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			int x = sc.nextInt();
			System.out.println("x= " + x);
		}
		System.out.println("���������������");
		
		int a = sc.nextInt();
		String b = sc.nextLine();
		System.out.println("a="+a+",b="+b);
	}
}
