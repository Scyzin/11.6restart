package game;

import java.util.Scanner;

/**
 * ����һ����½��Ľ���
 * 
 * @author Administrator
 *
 */
public class GuessNumber {

	public GuessNumber() {
		super();
	}

	public static void start() {
		// ����һ�������
		int number = (int) (Math.random() * 100) + 1;

		// ����һ��ͳ�Ʊ���
		int count = 0;

		while (true) {

			Scanner sc = new Scanner(System.in);
			System.out.println("����������(1-100)");
			int guessNumber = sc.nextInt();

			count++;
			if (guessNumber > 100 && guessNumber < 0) {
				System.out.println("������������д�����������");
			} else if (guessNumber > number) {
				System.out.println("��µ���" + guessNumber + "����һ��");
			} else if (guessNumber < number) {
				System.out.println("��µ���" + guessNumber + "С��һ��");
			} else {
				System.out.println("��ϲ��¶��ˣ�������" + count + "��");
				break;
			}
		}
	}
}
