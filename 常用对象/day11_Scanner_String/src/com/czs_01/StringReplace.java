package com.czs_01;

/*
 * �滻����
String replace(char old,char new)
String replace(String old,String new)
ȥ���ַ������ո�	
String trim()
���ֵ�˳��Ƚ������ַ���  
int compareTo(String str)
int compareToIgnoreCase(String str) 
 */
public class StringReplace {
	public static void main(String[] args) {
		String s1 = "helloworld";
		//�滻���ܣ��ַ��滻
		String s2 = s1.replace('l', 'o');
		System.out.println("s1= " + s1 + ",s2=" + s2);
		
		//�ַ����滻
		String s3 = s1.replace("llo", "eee");
		System.out.println("s1= " + s1 + ",s3=" + s3);
		
		//ȥ���ַ������˿ո�
		String s4 = "  sdrsat  ";
		System.out.println("s4 = " + s4);
		
		//���ֵ�˳��Ƚ������ַ���  
		String s5 ="hello";
		String s6 ="hello";
		String s7 ="abc";
		String s8 ="ABC";
		System.out.println(s5.compareTo(s6));
		System.out.println(s5.compareTo(s7));
		System.out.println(s7.compareTo(s8));
		
	}

}
