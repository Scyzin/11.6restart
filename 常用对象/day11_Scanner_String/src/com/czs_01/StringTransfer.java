package com.czs_01;
/*
 *String类的转换功能：
 *
 *byte[] getBytes()
 *char[] toCharArray()
 *static String valueOf(char[] chs)
 *static String valueOf(int i)
 *		string类的valueOf 可以把任意类型的数据转换为字符串
 *String toLowerCase()
 *String toUpperCase()
 *String concat(String str)

 */
public class StringTransfer {
public static void main(String[] args) {
	String s = "HelloWorld";

	//byte[] getBytes()使用指定的字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
	byte[] bys = s.getBytes();
	System.out.println(bys[3]);
	
	//char[] toCharArray()使用指定的字符集将此 String 编码为 char数组。
	System.out.println(s.toCharArray());	
	
	//static String valueOf(char[] chs) 字符数组转换为字符串
	char[]chs = {'b','s','s'};
	System.out.println(String.valueOf(chs));
	
	//static String valueOf(int i) 把int类型转换为字符串
	System.out.println(String.valueOf(320));
	
	//String toLowerCase()：产生一个新字符串，将字符串所有字符转为小写，
	System.out.println("toLowerCase:" + s.toLowerCase());//原有的字符串不变
	
	//String toUpperCase()：将字符串所有字符转为大写
	System.out.println("toUpperCase:" + s.toUpperCase());
	
	//String concat(String str),用的多的还是字符串直接拼接
	System.out.println("concat" + s.concat("Hello"));
}
}
