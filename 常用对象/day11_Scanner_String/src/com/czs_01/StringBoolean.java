package com.czs_01;

/*
 * String类的判断功能：
 * 
 *boolean equals(Object obj)：比较字符串内容是否相同
 *boolean equalsIgnoreCase(String str)：比较字符串是否相同，忽略大小写
 *boolean contains(String str)：判断大字符串中是否含有小字符串
 *boolean startsWith(String str)：判断以什么开头的字符
 *boolean endsWith(String str)：判断字符串是否以某个指定字符结尾
 *boolean isEmpty()：判断字符串是否为空 
 */

public class StringBoolean {
	public static void main(String[] args) {
		String s1 ="helloworld";
		String s2 ="helloworld";
		String s3 ="HelloWorld";
		String s4 ="你好，HelloWorld";
		
		//比较字符串内容是否相同
		System.out.println("equals:" + s1.equals(s2));
		//比较字符串内容是否相同，忽略大小写
		System.out.println("equalsIgnoreCase:" + s1.equalsIgnoreCase(s3));
		//判断大字符串中是否含有小字符串
		System.out.println("contains:" + s4.contains(s3));
		//判断字符串是否以h开头，或者某个字符串开头
		System.out.println("startsWith:" + s1.startsWith("h"));
		//判断字符串是否以s结尾
		System.out.println("endsWith:" + s1.endsWith("s"));
		//判断字符串是否为空
		System.out.println("isEmpty:" + s1.isEmpty());
		String s5 = "";
		String s6 = null;//NonePointerException
		System.out.println("isEmpty:" + s5.isEmpty());
		System.out.println("isEmpty:" + s6.isEmpty());//对象不存在，空指针异常
	}
}
