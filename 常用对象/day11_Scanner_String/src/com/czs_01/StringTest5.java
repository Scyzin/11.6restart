package com.czs_01;

import java.util.Scanner;

/*
 * 字符串反转
举例：键盘录入”abc”		输出结果：”cba”

 */
public class StringTest5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入需要反转的字符串");
		String s =sc.nextLine();
		String s1 = reverseString(s);
		System.out.println(s1);
	}
	
	//字符串反转的功能
	public static String reverseString(String s) {
		String s1 = "";
		for(int i =s.length()-1;i >=0;i--) {
			s1 += s.charAt(i);
		}
		return s1;
	}
}
