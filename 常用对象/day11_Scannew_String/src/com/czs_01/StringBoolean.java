package com.czs_01;

/*
 * String����жϹ��ܣ�
 * 
 *boolean equals(Object obj)���Ƚ��ַ��������Ƿ���ͬ
 *boolean equalsIgnoreCase(String str)���Ƚ��ַ����Ƿ���ͬ�����Դ�Сд
 *boolean contains(String str)���жϴ��ַ������Ƿ���С�ַ���
 *boolean startsWith(String str)���ж���ʲô��ͷ���ַ�
 *boolean endsWith(String str)���ж��ַ����Ƿ���ĳ��ָ���ַ���β
 *boolean isEmpty()���ж��ַ����Ƿ�Ϊ�� 
 */

public class StringBoolean {
	public static void main(String[] args) {
		String s1 ="helloworld";
		String s2 ="helloworld";
		String s3 ="HelloWorld";
		String s4 ="��ã�HelloWorld";
		
		//�Ƚ��ַ��������Ƿ���ͬ
		System.out.println("equals:" + s1.equals(s2));
		//�Ƚ��ַ��������Ƿ���ͬ�����Դ�Сд
		System.out.println("equalsIgnoreCase:" + s1.equalsIgnoreCase(s3));
		//�жϴ��ַ������Ƿ���С�ַ���
		System.out.println("contains:" + s4.contains(s3));
		//�ж��ַ����Ƿ���h��ͷ������ĳ���ַ�����ͷ
		System.out.println("startsWith:" + s1.startsWith("h"));
		//�ж��ַ����Ƿ���s��β
		System.out.println("endsWith:" + s1.endsWith("s"));
		//�ж��ַ����Ƿ�Ϊ��
		System.out.println("isEmpty:" + s1.isEmpty());
		String s5 = "";
		String s6 = null;//NonePointerException
		System.out.println("isEmpty:" + s5.isEmpty());
		System.out.println("isEmpty:" + s6.isEmpty());//���󲻴��ڣ���ָ���쳣
	}
}
