/*
 * public final class Scannerextends Object
 * 		Scanner(InputStream source) 
 * 
 * System类下public static final InputStream in
 * 		表示“标准”输入流。此流已打开并准备提供输入数据。
 * 		InputStrem in = System.in 
 * 
 * 			public boolean hasNextxxx():判断是否是某种类型的输入返回true或false
 * 			public xxxnextxxx();将输入信息标记为xxx；
 * 
 * 		常用的两个方法：
 * 			public int nextInt();获取int类型的值
 * 			public String nextLine();获取一个String的值
 * 
 * 		一个问题：
 * 				先获取一个数值，再获取一个string，会出问题。
 * 				输入第二个值时，回车键\n会被当成第二值输入，直接结束。
 * 		解决：
 * 			把所有数据按字符串获取，再对应的转换
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
		System.out.println("你输入的数据有误");
		
		int a = sc.nextInt();
		String b = sc.nextLine();
		System.out.println("a="+a+",b="+b);
	}
}
