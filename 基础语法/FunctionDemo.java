/*
	����������ض����ܴ���顣
		�������������еĺ�����
		
	��ʽ��
		���η� ����ֵ���� ���������������� ����1, �������� ������2��{
			�����壻
			return����ֵ��
		}
	��ʽ���ͣ�
		���η��� public priate protect
		����ֵ���ͣ�int	boolean
		��������������������
		������
			��ʽ�����������϶���ģ����ڽ���ʵ�ʲ�����
			ʵ�ʲ�����ʵ�ʲ��������
		�������ͣ���������������	�����������Ǳ���
		��������䣺��ɹ��ܵĴ���
		return����������
		����ֵ�����򷵻ؽ�������ظ������ߡ�
	���ã�
		�������������塣������ã������á���ֵ������á�
	����һ���������ˡ�
*/
import java.util.Scanner;
class FunctionDemo{
	/*public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("��������������");
	int i = sc.nextInt();
	int j = sc.nextInt();
	boolean max = Sum(i,j);
	System.out.println( max);
	}

	public static boolean Sum(int a, int b){
		return a == b;
		*/
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������:");
		int a = sc.nextInt();		
		System.out.println("������ڶ�������:");
		int b = sc.nextInt();
		System.out.println("���������������:");
		int c = sc.nextInt();
		
		int max = getMax(a,b,c);
		System.out.println("���������е����ֵ�ǣ�"+max);
	}
	
	/*
		���󣻷����������е����ֵ
		
		������ȷ��
			����ֵ���ͣ�int
			�����б�int a,int b,int c
	*/
	public static int getMax(int a,int b,int c) {
		//ifǶ��
		/*
		if(a > b) {
			if(a > c) {
				return a;
			}else {
				return c;
			}
		}else {
			if(b > c) {
				return b;
			}else {
				return c;
			}
		}
		*/
		
		//����Ԫ��
		/*
		if(a > b) {
			return (a>c? a: c);
		}else {
			return (b>c? b: c);
		}
		*/
		
		//�����Ľ�
		//return (a>b)? (a>c? a: c): (b>c? b: c);
		int temp = ((a>b)? a: b);
		int max = ((temp>c)? temp: c);
		return max;
	}
	}
}