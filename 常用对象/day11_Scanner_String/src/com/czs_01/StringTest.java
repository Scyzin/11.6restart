package com.czs_01;
/*
 * ��½�ж�
 */
import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		String username = "admin";
		String password = "admin";
		for (int i = 0; i < 3; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("����������û���");
			String name = sc.nextLine();
			System.out.println("�������������");
			String word = sc.nextLine();

			if (name.equals(username) && word.equals(password)) {
				System.out.println("����ɹ�����ʼ��������Ϸ");
				GuessNumber.start();
				break;
			} else {
				if ((2 - i) == 0) {
					System.out.println("�û����ѱ�����");
				} else {
					System.out.println("����ʧ�ܣ��㻹��" + (2 - i) + "�λ���");
				}
			}
		}
	}
}
