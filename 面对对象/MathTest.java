/*
	math��
*/
import java.util.Scanner;
class Math{
	public int sum(int a,int b){
		return a + b;
	}
	public int sub(int a,int b){
		return a - b;
	}
	public int idv(int a, int b){
		return a / b;
	}
	public int mul(int a, int b){
		return a * b;
	}
}
class MathTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����");
		int a = sc.nextInt();
		System.out.println("��������һ����");
		int b = sc.nextInt();
		Math s =new Math();
		System.out.println("�������ĺ�:" + s.sum(a,b));
		System.out.println("�������Ĳ�:" + s.sub(a,b));
		System.out.println("�������Ļ�:" + s.mul(a,b));
		System.out.println("����������:" + s.idv(a,b));
		
	}
}