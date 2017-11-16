package com.czs_01;
/*
 * 将一个字符串的首字母转成大写，其余为小写
 * 
 * 		先获取第一个字符，后获取除第一个字符意外的字符串。
 * 
 *		
 */
public class StringTest3 {
	public static void main(String[] args) {
		String s ="HsddaDFA";
		//先获取第一个字符，
		String s1 = s.substring(0, 1);
		//后获取除第一个字符意外的字符串。
		String s2= s.substring(1);
		
		//第一个字符串大写 + 后面的字符串小写
		System.out.println(s1.toUpperCase()
				+ s2.toLowerCase());
		
	}
			
}
