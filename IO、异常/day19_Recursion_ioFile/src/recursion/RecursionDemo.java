package recursion;

import java.util.Scanner;

/*
 * �ݹ飺���������е��÷������������
 * 		�ݹ�һ��Ҫ�г��ڣ�����������ݹ顣
 * 		�ݹ�Ĵ�������̫��
 * 		���췽�����ܵݹ�ʹ��
 * 
 * �ݹ�һ��Ҫд������
 * 		�������ͣ�       ����ֵ����
 * 
 */
public class RecursionDemo {
	public static void main(String[] args) {
		System.out.println("��������Ҫ��׳˵���");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n + "�Ľ׳�Ϊ" + Mup(n));
	}

	// ��׳ˡ�
	public static int Mup(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * Mup(n - 1);
		}
	}
}
