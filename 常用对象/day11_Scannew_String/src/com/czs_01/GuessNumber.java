package com.czs_01;

import java.util.Scanner;

public class GuessNumber {

	private GuessNumber() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static void start() {
		int a = (int)(Math.random()*100+1);
		while(true) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number > a) {
			System.out.println("��µ�������");
		}else if(number < a){
			System.out.println("��µ���С��");
		}else {
			System.out.println("��ϲ��¶���");
			break;
		}
	}
	}
}
