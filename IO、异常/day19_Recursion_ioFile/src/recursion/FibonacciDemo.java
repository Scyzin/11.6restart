package recursion;

import java.util.Scanner;
/*
 * �ҳ����������ҹ��ɡ�
 * 
 */
public class FibonacciDemo {
	public static void main(String[] args) {
		System.out.println("Ҫ��ѯ���·���");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("��" + n + "�������Ӷ���Ϊ:" + fib(n));

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
