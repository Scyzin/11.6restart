package regex;

import java.util.Scanner;

/*
 * �жϹ���
 * String���String���public boolean matches(String regex)
 * 
 * �ָ��
 * String���public String[] split(String regex)
 * 
 */
public class RegexMatchsSpilt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����������ֻ�����");
		String phone = sc.nextLine();

		String regex = "1[38]\\d";
		boolean flag = phone.matches(regex);
		System.out.println("flag:" + flag);
		
		String age = "18-24";
		
		String regex1= "-";
		String[] strArray = age.split(regex1);
		
		for(int i=0;i<strArray.length;i++) {
			System.out.println(strArray[i]);
		}
		
		int startAge = Integer.parseInt(strArray[0]);
		int endAge = Integer.parseInt(strArray[1]);
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("�������������");
		int a = sc1.nextInt();
		if(a>startAge && a<endAge) {
			System.out.println("����Ҫ��");
		}else {
			System.out.println("�㲻������Ҫ����");
			
			String s1 = "aa,bb,cc";
			String [] arr = s1.split(",");
			for(int x =0;x<arr.length;x++) {
				System.out.println(arr[x]);
		}

	}
	}
}
