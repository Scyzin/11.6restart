package stringBuffer;

import java.util.Scanner;

/*
 * �ж�һ���ַ����Ƿ��ǶԳ��ַ���
 * ����"abc"���ǶԳ��ַ�����"aba"��"abba"��"aaa"��"mnanm"�ǶԳ��ַ���
 * 
 */
public class StringBufferTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in );
		System.out.println("������һ���ַ���" );
		String s = sc.nextLine();
		boolean b =isSame(s);
		System.out.println("b:"+b);
	}
	
	public static boolean isSame(String s) {
	
		return new StringBuffer(s).reverse().toString().equals(s);
	}
	
	/*//�ַ���ת��Ϊ����ȥ�ж�
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
