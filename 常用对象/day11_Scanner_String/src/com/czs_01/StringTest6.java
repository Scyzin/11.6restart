package com.czs_01;

public class StringTest6 {
	public static void main(String[] args) {
		String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		String minString = "java";
		int count = getCount(maxString, minString);
		System.out.println("小串在大串中出现了 " + count + "次");
	}

	public static int getCount(String a, String b) {
		// 定义统计变量
		int count = 0;

		// 返回小串在大串中的索引位置
		int index = a.indexOf(b);

		while ((index = a.indexOf(b)) != -1) {
			count++;
			a = a.substring(index + b.length());

		}
		return count;
	}

}
