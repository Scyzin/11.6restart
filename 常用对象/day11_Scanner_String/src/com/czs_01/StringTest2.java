package com.czs_01;
/*
 * 字符串遍历功能+判断大写小写
 */
import java.util.Scanner;

public class StringTest2 {
	public static void main(String[] args) {

		System.out.println("请输入你要查询的字符串");
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
		System.out.println("字符串中有大写字符" + bigNumber +",小写字符："
		+ smallNumber +"，数字字符:" + Number);
		
	}
}

