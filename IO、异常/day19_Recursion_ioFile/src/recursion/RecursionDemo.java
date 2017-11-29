package recursion;

import java.util.Scanner;

/*
 * 递归：方法定义中调用方法本身的现象
 * 		递归一定要有出口，否则就是死递归。
 * 		递归的次数不能太多
 * 		构造方法不能递归使用
 * 
 * 递归一定要写方法：
 * 		参数类型：       返回值类型
 * 
 */
public class RecursionDemo {
	public static void main(String[] args) {
		System.out.println("请输入需要求阶乘的数");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n + "的阶乘为" + Mup(n));
	}

	// 求阶乘。
	public static int Mup(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * Mup(n - 1);
		}
	}
}
