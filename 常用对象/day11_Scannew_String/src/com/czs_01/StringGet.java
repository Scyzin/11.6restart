package com.czs_01;

/*
 * String��Ļ�ȡ����
 * 
 * int length()
 *char charAt(int index)
 *int indexOf(int ch)
 *int indexOf(String str)
 *int indexOf(int ch,int fromIndex)
 *int indexOf(String str,int fromIndex)
 *String substring(int start)
 *String substring(int start,int end)

 * 
 */
public class StringGet {
	public static void main(String[] args) {
		String s = "HelloWorld";
		
		// int length()����ȡ�ַ����ĳ���
		System.out.println("s.length:" + s.length());
		
		// int indextof(int ch),��ȡ�ַ���һ�γ��ֵ�����λ��
		System.out.println("s.indexof:" + s.indexOf('o'));
		
		// int indexOf(String str,)��ȡ�ַ�����һ�γ��ֵ�����λ��
		System.out.println("s.length:" + s.indexOf("World"));
		
		// char charAt(int index) �ַ����ڼ���λ���ϵ��ַ�
		System.out.println("s.char:" + s.charAt(5));
		
		// int indexOf(int ch,int fromIndex),�ӵ�5������λ�ÿ�ʼ�����ַ�
		System.out.println("s.length(ch):" + s.indexOf('r', 5));// 7
		
		// int indexOf(String str,int fromIndex�ӵ�5������λ�ÿ�ʼ�����ַ���
		System.out.println("s.length(str):" + s.indexOf("world", 2));// -1
		
		// String substring(int start)����һ���µ��ַ��������Ǵ��ַ�����һ�����ַ���
		System.out.println("substring:" + s.substring(2));
		
		// String substring(int start,int end)����һ���µ��ַ�����
		// ���Ǵ��ַ�����һ�����ַ���������start,������end
		System.out.println("substring:" + s.substring(2, 5));

	}

}
