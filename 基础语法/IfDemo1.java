/*
	˳��ṹ
		���ϵ�������ִ��
	ѡ��ṹ	
		if���
			if (��ϵ���ϵ){
				����壻
			}
		if����ע�����
		�Ƚϱ��ʽ���ۼ򵥻��Ǹ��ӣ����������boolean����
		if�����Ƶ�����������һ����䣬�����ſ���ʡ�ԣ�
		  ����Ƕ�����䣬�Ͳ���ʡ�ԡ�������Զ��Ҫʡ�ԡ�
		һ����˵����������ž�û�зֺţ��зֺž�û���������
		
			if (��ϵ���ʽ){
				�����1��
			}
			else{
				�����2��
			}
			�ȼ���Ƚϱ��ʽ��ֵ��������ֵ��true����false��trueִ��1��falseִ��2
		
*/
import java.util.Scanner;
class IfDemo1{
	public static void main(String[] args){
		System.out.println("����ʼ");
		System.out.println("�Ұ�java");
		System.out.println("�������");
		
		int x = 10;
		if (x == 10){
			System.out.println("x����10");
		}
		int b =100;
		if(b != 100);  //������ʵ���������ģ�ֻ�����ǿ�����塣
		
		if (x == 20){
			System.out.println("x������10");
		}
		else{
			System.out.println("x����20");
		}
		//��ȡ���������нϴ��ֵ
		Scanner sc = new Scanner(System.in);
		System.out.println("��һ������")��
		int a = sc.nextInt();
		System.out.println("�ڶ�������")��
		int b = sc.nextInt();
		if (a > b){
			System.out.println("�ϴ������" + a)��
		}else{
			System.out.println("�ϴ������" + b)��
		}
		
		int max = a > b ? a : b;//��Ԫ���������ʵ�ֵģ���������if���ʵ�֡�
		System.out.println("�ϴ����:" +max);
		
		
		
		
	}
}