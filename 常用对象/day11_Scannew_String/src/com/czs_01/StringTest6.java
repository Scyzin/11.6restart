package com.czs_01;

public class StringTest6 {
	public static void main(String[] args) {
		String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		String minString = "java";
		int count = getCount(maxString, minString);
		System.out.println("С���ڴ��г����� " + count + "��");
	}

	public static int getCount(String a, String b) {
		// ����ͳ�Ʊ���
		int count = 0;

		// ����С���ڴ��е�����λ��
		int index = a.indexOf(b);

		while ((index = a.indexOf(b)) != -1) {
			count++;
			a = a.substring(index + b.length());

		}
		return count;
	}

}
