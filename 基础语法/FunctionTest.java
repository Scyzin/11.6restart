/*
	方法注意事项
		不调用就不执行
		方法不能嵌套定义
		参数之间用，隔开
		方法有明确返回值，要return一个值。
		方法调用不用再传递数据类型。
	void类型返回值的方法调用：
		只有一种；单独调用；
				
*/
import java.util.Scanner;
class FunctionTest{
	/*public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入需要打印的星星行数和列数");
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
	//打印n*n的乘法表
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入需要打印的乘法表的行数");
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
