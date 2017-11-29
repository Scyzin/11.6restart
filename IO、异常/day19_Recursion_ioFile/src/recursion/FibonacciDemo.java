package recursion;

import java.util.Scanner;
/*
 * 找出口条件，找规律。
 * 
 */
public class FibonacciDemo {
	public static void main(String[] args) {
		System.out.println("要查询的月份是");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("第" + n + "个月兔子对数为:" + fib(n));

		int[] arr = new int[20];
		arr[0] = 1;
		arr[1] = 2;
		for (int x = 2; x < arr.length; x++) {
			arr[x] = arr[x - 1] + arr[x - 2];
		}
		System.out.println(arr[5]);
	}

	public static int fib(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}
}
