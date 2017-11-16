/*
	math类
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
		System.out.println("请输入一个数");
		int a = sc.nextInt();
		System.out.println("请输入另一个数");
		int b = sc.nextInt();
		Math s =new Math();
		System.out.println("两个数的和:" + s.sum(a,b));
		System.out.println("两个数的差:" + s.sub(a,b));
		System.out.println("两个数的积:" + s.mul(a,b));
		System.out.println("两个数的商:" + s.idv(a,b));
		
	}
}