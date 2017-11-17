package stringBuffer;

import java.util.Scanner;

/*
 * 判断一个字符串是否是对称字符串
 * 例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"是对称字符串
 * 
 */
public class StringBufferTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in );
		System.out.println("请输入一个字符串" );
		String s = sc.nextLine();
		boolean b =isSame(s);
		System.out.println("b:"+b);
	}
	
	public static boolean isSame(String s) {
	
		return new StringBuffer(s).reverse().toString().equals(s);
	}
	
	/*//字符串转化为数组去判断
	public static boolean isSame(String s) {
		boolean flag = true;
		char [] chs = s.toCharArray();
		
		for(int start = 0,end = chs.length-1;start <= end;start++,end--) {
			if(chs[start] != chs[end]) {
				flag = false;
				break;
			}
		}
		return flag;
	}*/
}
