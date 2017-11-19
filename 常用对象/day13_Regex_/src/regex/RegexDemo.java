package regex;
/*
 * 正则表达式：符合一定规则的字符串 
 *
 */
import java.util.Scanner;

public class RegexDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入QQ");
		String QQ = sc.nextLine();
	}

	public static boolean checkQ(String qq) {
		/*boolean flag = true;
		if (qq.length() > 5 && qq.length() < 9) {
			if (qq.startsWith("0")) {
				flag = false;
			} else {
				char[] chs = qq.toCharArray();
				for (int x = 0; x < chs.length; x++) {
					char ch = chs[x];
					if (!Character.isDigit(ch)) {
						flag = false;
					}
				}
			}
		} else {
			flag = false;
		}
		return flag;*/
		return qq.matches("[1-9][0-9]{4-14}");
	}
}
