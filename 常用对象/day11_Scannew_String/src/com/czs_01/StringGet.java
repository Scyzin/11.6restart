package com.czs_01;

/*
 * String类的获取功能
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
		
		// int length()，获取字符串的长度
		System.out.println("s.length:" + s.length());
		
		// int indextof(int ch),获取字符第一次出现的索引位置
		System.out.println("s.indexof:" + s.indexOf('o'));
		
		// int indexOf(String str,)获取字符串第一次出现的索引位置
		System.out.println("s.length:" + s.indexOf("World"));
		
		// char charAt(int index) 字符串第几个位置上的字符
		System.out.println("s.char:" + s.charAt(5));
		
		// int indexOf(int ch,int fromIndex),从第5个索引位置开始搜索字符
		System.out.println("s.length(ch):" + s.indexOf('r', 5));// 7
		
		// int indexOf(String str,int fromIndex从第5个索引位置开始搜索字符喘
		System.out.println("s.length(str):" + s.indexOf("world", 2));// -1
		
		// String substring(int start)返回一个新的字符串，它是此字符串的一个子字符串
		System.out.println("substring:" + s.substring(2));
		
		// String substring(int start,int end)返回一个新的字符串，
		// 它是此字符串的一个子字符串，包括start,不包括end
		System.out.println("substring:" + s.substring(2, 5));

	}

}
