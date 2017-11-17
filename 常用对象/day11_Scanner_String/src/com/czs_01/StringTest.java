package com.czs_01;
/*
 * 登陆判断
 */
import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		String username = "admin";
		String password = "admin";
		for (int i = 0; i < 3; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入登入用户名");
			String name = sc.nextLine();
			System.out.println("请输入登入密码");
			String word = sc.nextLine();

			if (name.equals(username) && word.equals(password)) {
				System.out.println("登入成功，开始猜数字游戏");
				GuessNumber.start();
				break;
			} else {
				if ((2 - i) == 0) {
					System.out.println("用户名已被锁定");
				} else {
					System.out.println("登入失败，你还有" + (2 - i) + "次机会");
				}
			}
		}
	}
}
