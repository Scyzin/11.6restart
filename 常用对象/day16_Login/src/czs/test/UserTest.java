package czs.test;

import java.util.Scanner;

import czs.dao.UserDao;
import czs.dao.impl.UserDaoImpl;
import czs.uesr.User;

/**
 * 这是用户测试类
 * 
 * @author Administrator
 *
 */
public class UserTest {
	public static void main(String[] args) {
		while (true) {
			System.out.println("--------------欢迎光临");
			System.out.println("1登陆");
			System.out.println("2注册");
			System.out.println("3退出");
			System.out.println("请输入你的选择");

			Scanner sc = new Scanner(System.in);
			String choose = sc.nextLine();
			// ud多次用到，所以将他移至外头
			UserDao ud = new UserDaoImpl();
			switch (choose) {
			case "1":
				System.out.println("---------登陆-------");
				System.out.println("请输入用户名");
				String Username = sc.nextLine();
				System.out.println("请输入密码");
				String Password = sc.nextLine();

				boolean flag = ud.isLogin(Username, Password);
				if (flag) {
					System.out.println("登陆成功");
					System.exit(0);
					// break;这是break switch
				} else {
					System.out.println("登陆失败");
				}

				break;
			case "2":
				System.out.println("---------注册-------");
				System.out.println("请输入用户名");
				String newUsername = sc.nextLine();
				System.out.println("请输入密码");
				String newPassword = sc.nextLine();

				User user = new User();
				user.setUserName(newUsername);
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

				break;
			}
		}
	}
}
