package czs.test;

import java.util.Scanner;

import czs.dao.UserDao;
import czs.dao.impl.UserDaoImpl;
import czs.uesr.User;

/**
 * �����û�������
 * 
 * @author Administrator
 *
 */
public class UserTest {
	public static void main(String[] args) {
		while (true) {
			System.out.println("--------------��ӭ����");
			System.out.println("1��½");
			System.out.println("2ע��");
			System.out.println("3�˳�");
			System.out.println("���������ѡ��");

			Scanner sc = new Scanner(System.in);
			String choose = sc.nextLine();
			// ud����õ������Խ���������ͷ
			UserDao ud = new UserDaoImpl();
			switch (choose) {
			case "1":
				System.out.println("---------��½-------");
				System.out.println("�������û���");
				String Username = sc.nextLine();
				System.out.println("����������");
				String Password = sc.nextLine();

				boolean flag = ud.isLogin(Username, Password);
				if (flag) {
					System.out.println("��½�ɹ�");
					System.exit(0);
					// break;����break switch
				} else {
					System.out.println("��½ʧ��");
				}

				break;
			case "2":
				System.out.println("---------ע��-------");
				System.out.println("�������û���");
				String newUsername = sc.nextLine();
				System.out.println("����������");
				String newPassword = sc.nextLine();

				User user = new User();
				user.setUserName(newUsername);
				user.setPassword(newPassword);
				// ����ע�Ṧ��
				// ��̬
				// UserDaoImpl ud = new UserDaoImpl();
				ud.regist(user);
				System.out.println("ע��ɹ�");
				break;
			case "3":
			default:
				System.out.println("лл����");

				break;
			}
		}
	}
}
