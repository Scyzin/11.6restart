/*
	����¼��
		����� inmport java.util.Scanner;
		�����е�����ǰ��
		��������Scaaner sc = new Scanner(System.in);
		int x = nextInt();
*/
import java.util.Scanner;
class ScannerDemo{
	public static void main(String[] args){
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		//�Ӽ����������������ݣ��������ǽ������
		System.out.println("�����������1�ǣ�");
		int x = sc.nextInt();//����̨�����Ǹ�����
		System.out.println("�����������2�ǣ�");
		int y = sc.nextInt();//����̨�����Ǹ�����
		
		System.out.println("�������ݵĺ�:" + (x+y));
		//������������е����ֵ
		int max = (x > y) ? x : y;
		System.out.println("�������ݵ����ֵ��" + max);
		
		//
		
	}
}