package test;

import java.util.Scanner;

import dao.UserDao;
import dao.UserDaoImpl;
import game.GuessNumber;
import pojo.User;

/**
 * �����û�������
 * 
 * @author Administrator
 *
 */
public class UserTest {
	public static void main(String[] args) {

		while (true) {
			System.out.println("-----------��ӭ����----------");
			System.out.println("1��¼");
			System.out.println("2ע��");
			System.out.println("3�˳�");
			System.out.println("���������ѡ��");
			// ��������
			Scanner sc = new Scanner(System.in);
			String choiceString = sc.nextLine();

			// ���õ�¼����
			UserDao ud = new UserDaoImpl();
			switch (choiceString) {
			case "1":
				// ��½���棬�����û���
				System.out.println("-----------��¼����-----------");
				System.out.println("�������û�����");
				String username = sc.nextLine();
				System.out.println("�������û����룺");
				String password = sc.nextLine();

				boolean flag = ud.isLogin(username, password);
				if (flag) {
					System.out.println("��¼�ɹ������Կ�ʼ��Ϸ");
					System.out.println("������y/n");
					while (true) {
						String resultString = sc.nextLine();
						if (resultString.equals("y")) {
							GuessNumber.start();
							System.out.println("�㻹����");
						} else {
							break;
						}
					}
					System.out.println("ллʹ�ã���ӭ�´�����");
					System.exit(0);
				} else {
					System.out.println("��½ʧ��");
				}
				break;
			case "2":
				// ��ӭ����
				System.out.println("---------ע��---------");
				System.out.println("�������û���");
				String newUsername = sc.nextLine();
				System.out.println("����������");
				String newPassword = sc.nextLine();
				// ���û����������װ��һ��������
				User user = new User();
				user.setUsername(newUsername);
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
				System.exit(0);
				break;
			}
		}
	}
}
