package com.czs_01;
/*
 * �ַ�����������+�жϴ�дСд
 */
import java.util.Scanner;

public class StringTest2 {
	public static void main(String[] args) {

		System.out.println("��������Ҫ��ѯ���ַ���");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int bigNumber = 0;
		int smallNumber = 0;
		int Number = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='a'&&ch<='z') {
				smallNumber++;
			}else if (ch>='0'&&ch<='9') {
				Number++;
			}else if(ch>='A'&&ch<='Z'){
				bigNumber++;
			}
		}
		System.out.println("�ַ������д�д�ַ�" + bigNumber +",Сд�ַ���"
		+ smallNumber +"�������ַ�:" + Number);
		
	}
}

