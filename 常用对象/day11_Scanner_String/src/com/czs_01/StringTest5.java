package com.czs_01;

import java.util.Scanner;

/*
 * �ַ�����ת
����������¼�롱abc��		����������cba��

 */
public class StringTest5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ��ת���ַ���");
		String s =sc.nextLine();
		String s1 = reverseString(s);
		System.out.println(s1);
	}
	
	//�ַ�����ת�Ĺ���
	public static String reverseString(String s) {
		String s1 = "";
		for(int i =s.length()-1;i >=0;i--) {
			s1 += s.charAt(i);
		}
		return s1;
	}
}
