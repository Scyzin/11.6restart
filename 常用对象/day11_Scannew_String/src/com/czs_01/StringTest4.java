package com.czs_01;

/*
 * int[] arr = {1,2,3};	输出结果：[1, 2, 3
 * 
 */
public class StringTest4 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		String s = arrayToString(arr);
		System.out.println("最终的字符串" + s);
	}
	
	public static String arrayToString(int[]arr) {
		String s = "";
		s += "[";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				s += arr[i];
				s += "]";
			} else {
				s += arr[i];
				s += ", ";
			}
		}
		return s;
	}
}
