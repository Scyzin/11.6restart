/*
	没有break，则会一直运行。
	模拟单向选择题。
	根据键盘录入字符串 String s = sc.nextLine，判断是否正确。
	case具有穿透性，可以一个多个值判断，选择语句体。
	
	判断时候如何选择语句，
	if用于boolean；一个范围；几个常量；
	switch:多个常量判断。
*/
import java.util.Scanner;
class SwitchTest{
	public static void main(String[] args){
		/*int x = 2;
		int y = 3;
		switch(x){
		default:
			y++;
		break;
		case 3:
			y++;
		case 4:
			y++;
		}
		System.out.println("y="+y);		y = 4	*/
		/*int x = 2;
		int y = 3;
		switch(x){
		default:
			y++;
		case 3:
			y++;
		case 4:
			y++;
	}
	System.out.println("y="+y);		y = 6	*/
		/*System.out.println("下面你想选择谁");
		System.out.println("65 : 1");
		System.out.println("66 : 2");
		System.out.println("67 : 3");
		System.out.println("68 : 4");
		Scanner sc = new Scanner(System.in);
		int choiceNumber = sc.nextInt();
		char choice = (char)choiceNumber;
		switch(choice){
			case 'A':
				System.out.println("选择正确");
				break;
				case 'B':
				System.out.println("选择错误");
				break;
				case 'C':
				System.out.println("选择错误");
				break;
				case 'D':
				System.out.println("选择错误");
				break;
				default:
					System.out.println("没有该选项");
					break;
			
		}*/
		/*System.out.println("请输入你要判断的字符串");
		Scanner sc = new Scanner(System.in);
		String s  = sc.nextLine();
		
		switch(s){
			case "Hello":
			System.out.println("输入正确");
			break;
			default:
			System.out.println("输入错误");
			break;
			}*/
			Scanner sc = new Scanner(System.in);
			int month = sc.nextInt();
		switch(month) {
			case 1:
			case 2:
			case 12:
				System.out.println("冬季");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋季");
				break;
			default:
				System.out.println("你输入的月份有误");	
		}
	}
}