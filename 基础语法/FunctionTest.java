/*
	����ע������
		�����þͲ�ִ��
		��������Ƕ�׶���
		����֮���ã�����
		��������ȷ����ֵ��Ҫreturnһ��ֵ��
		�������ò����ٴ����������͡�
	void���ͷ���ֵ�ķ������ã�
		ֻ��һ�֣��������ã�
				
*/
import java.util.Scanner;
class FunctionTest{
	/*public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ��ӡ����������������");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Print(a,b);
	}
	public static void Print(int a, int b){
		for (int i =0; i <=a;i++){
			for(int j = 0;j <= b;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	*/
	//��ӡn*n�ĳ˷���
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ��ӡ�ĳ˷��������");
		int n = sc.nextInt();
		Print(n);
	}
	public static void Print(int n){
		for (int i =1; i <=n;i++){
			for(int j = 1;j <= i;j++){
				System.out.print( i*j +"\t");
			}
			System.out.println();
		}
	}
}
