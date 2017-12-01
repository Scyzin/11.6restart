package test;

import java.util.Scanner;

import dao.UserDao;
import dao.UserDaoImpl;
import game.GuessNumber;
import pojo.User;

/**
 * 这是用户测试类
 * 
 * @author Administrator
 *
 */
public class UserTest {
	public static void main(String[] args) {

		while (true) {
			System.out.println("-----------欢迎光临----------");
			System.out.println("1登录");
			System.out.println("2注册");
			System.out.println("3退出");
			System.out.println("请输入你的选择");
			// 创建输入
			Scanner sc = new Scanner(System.in);
			String choiceString = sc.nextLine();

			// 调用登录功能
			UserDao ud = new UserDaoImpl();
			switch (choiceString) {
			case "1":
				// 登陆界面，输入用户名
				System.out.println("-----------登录界面-----------");
				System.out.println("请输入用户名：");
				String username = sc.nextLine();
				System.out.println("请输入用户密码：");
				String password = sc.nextLine();

				boolean flag = ud.isLogin(username, password);
				if (flag) {
					System.out.println("登录成功，可以开始游戏");
					System.out.println("你玩吗y/n");
					while (true) {
						String resultString = sc.nextLine();
						if (resultString.equals("y")) {
							GuessNumber.start();
							System.out.println("你还玩吗");
						} else {
							break;
						}
					}
					System.out.println("谢谢使用，欢迎下次再来");
					System.exit(0);
				} else {
					System.out.println("登陆失败");
				}
				break;
			case "2":
				// 欢迎界面
				System.out.println("---------注册---------");
				System.out.println("请输入用户名");
				String newUsername = sc.nextLine();
				System.out.println("请输入密码");
				String newPassword = sc.nextLine();
				// 把用户名和密码封装到一个对象中
				User user = new User();
				user.setUsername(newUsername);
				user.setPassword(newPassword);
				// 调用注册功能
				// 多态
				// UserDaoImpl ud = new UserDaoImpl();
				ud.regist(user);

				System.out.println("注册成功");
				break;
			case "3":
			default:
				System.out.println("谢谢光临");
				System.exit(0);
				break;
			}
		}
	}
}
