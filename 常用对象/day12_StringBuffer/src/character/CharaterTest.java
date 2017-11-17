package character;

import java.util.Scanner;

/*
* 将一个字符串的首字母转成大写，其余为小写
*
*/
public class CharaterTest {
	public static void main(String[] args) {
		System.out.println("请输入你要查询的字符串");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int bigNumber = 0;
		int smallNumber = 0;
		int Number = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isLowerCase(ch)) {
				smallNumber++;
			}else if (Character.isDigit(ch)) {
				Number++;
			}else if(Character.isUpperCase(ch)){
				bigNumber++;
			}
		}
		System.out.println("字符串中有大写字符" + bigNumber +",小写字符："
		+ smallNumber +"，数字字符:" + Number);
		
	}
}

