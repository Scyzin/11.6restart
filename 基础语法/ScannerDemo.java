/*
	键盘录入
		导入包 inmport java.util.Scanner;
		在所有的类名前面
		创建对象：Scaaner sc = new Scanner(System.in);
		int x = nextInt();
*/
import java.util.Scanner;
class ScannerDemo{
	public static void main(String[] args){
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		//从键盘上输入两个数据，并对他们进行求和
		System.out.println("你输入的数据1是：");
		int x = sc.nextInt();//控制台读入那个数据
		System.out.println("你输入的数据2是：");
		int y = sc.nextInt();//控制台读入那个数据
		
		System.out.println("两个数据的和:" + (x+y));
		//输出两个数据中的最大值
		int max = (x > y) ? x : y;
		System.out.println("两个数据的最大值：" + max);
		
		//
		
	}
}