/*
	û��break�����һֱ���С�
	ģ�ⵥ��ѡ���⡣
	���ݼ���¼���ַ��� String s = sc.nextLine���ж��Ƿ���ȷ��
	case���д�͸�ԣ�����һ�����ֵ�жϣ�ѡ������塣
	
	�ж�ʱ�����ѡ����䣬
	if����boolean��һ����Χ������������
	switch:��������жϡ�
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
		/*System.out.println("��������ѡ��˭");
		System.out.println("65 : 1");
		System.out.println("66 : 2");
		System.out.println("67 : 3");
		System.out.println("68 : 4");
		Scanner sc = new Scanner(System.in);
		int choiceNumber = sc.nextInt();
		char choice = (char)choiceNumber;
		switch(choice){
			case 'A':
				System.out.println("ѡ����ȷ");
				break;
				case 'B':
				System.out.println("ѡ�����");
				break;
				case 'C':
				System.out.println("ѡ�����");
				break;
				case 'D':
				System.out.println("ѡ�����");
				break;
				default:
					System.out.println("û�и�ѡ��");
					break;
			
		}*/
		/*System.out.println("��������Ҫ�жϵ��ַ���");
		Scanner sc = new Scanner(System.in);
		String s  = sc.nextLine();
		
		switch(s){
			case "Hello":
			System.out.println("������ȷ");
			break;
			default:
			System.out.println("�������");
			break;
			}*/
			Scanner sc = new Scanner(System.in);
			int month = sc.nextInt();
		switch(month) {
			case 1:
			case 2:
			case 12:
				System.out.println("����");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("����");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("�ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("�＾");
				break;
			default:
				System.out.println("��������·�����");	
		}
	}
}