package character;

import java.util.Scanner;

/*
* ��һ���ַ���������ĸת�ɴ�д������ΪСд
*
*/
public class CharaterTest {
	public static void main(String[] args) {
		System.out.println("��������Ҫ��ѯ���ַ���");
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
		System.out.println("�ַ������д�д�ַ�" + bigNumber +",Сд�ַ���"
		+ smallNumber +"�������ַ�:" + Number);
		
	}
}

