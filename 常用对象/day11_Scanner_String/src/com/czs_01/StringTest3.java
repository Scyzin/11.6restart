package com.czs_01;
/*
 * ��һ���ַ���������ĸת�ɴ�д������ΪСд
 * 
 * 		�Ȼ�ȡ��һ���ַ������ȡ����һ���ַ�������ַ�����
 * 
 *		
 */
public class StringTest3 {
	public static void main(String[] args) {
		String s ="HsddaDFA";
		//�Ȼ�ȡ��һ���ַ���
		String s1 = s.substring(0, 1);
		//���ȡ����һ���ַ�������ַ�����
		String s2= s.substring(1);
		
		//��һ���ַ�����д + ������ַ���Сд
		System.out.println(s1.toUpperCase()
				+ s2.toLowerCase());
		
	}
			
}
