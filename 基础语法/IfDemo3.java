/*
	����¼���·ݵ�ֵ�������Ӧ�ļ��ڡ�
	
	��	3,4,5
	��	6,7,8
	��	9,10,11
	��	12,1,2
	
	if����ǿ���Ƕ�ף�Ƕ�׵�ʱ��ǧ����˴����š����Ӧ�Ĵ�����Ҳ��Ӧ����
	
*/
import java.util.Scanner;
class IfDemo3{
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		System.out.println("�����·�");
		int  a = sc.nextInt();
		if(a < 1 && a > 12){
			System.out.println("������·��д�");
		}else if (a == 3 || a == 4 || a ==5){//( a <= 5 && a>=3)
			System.out.println("�Ǵ���");
		}else if (a == 6 || a == 7 || a ==8){
			System.out.println("���ļ�");
		}else if (a == 9 || a == 10 || a ==11){
			System.out.println("���＾");
		}else{
			System.out.println("�Ƕ���");
		}
	//��ȡ���������е����ֵ	
		int b = 30;
		int c = 20;
		int d = 10;
		int max;

		if(b > c){
			if(b > d){
				max = b;
			}else{
				max = d;
			}
		}else{
			if(c > d){
				max = c;
			}else{
				max = d;
				}
			}
		System.out.println("max=" + max);			
		
	}
}