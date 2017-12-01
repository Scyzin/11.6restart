package game;

import java.util.Scanner;

/**
 * 这是一个登陆后的奖励
 * 
 * @author Administrator
 *
 */
public class GuessNumber {

	public GuessNumber() {
		super();
	}

	public static void start() {
		// 产生一个随机数
		int number = (int) (Math.random() * 100) + 1;

		// 定义一个统计变量
		int count = 0;

		while (true) {

			Scanner sc = new Scanner(System.in);
			System.out.println("请输入数据(1-100)");
			int guessNumber = sc.nextInt();

			count++;
			if (guessNumber > 100 && guessNumber < 0) {
				System.out.println("你输入的数据有错，请重新输入");
			} else if (guessNumber > number) {
				System.out.println("你猜的数" + guessNumber + "大了一点");
			} else if (guessNumber < number) {
				System.out.println("你猜的数" + guessNumber + "小了一点");
			} else {
				System.out.println("恭喜你猜对了，你用了" + count + "次");
				break;
			}
		}
	}
}
