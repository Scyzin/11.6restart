package exception;

import java.util.Scanner;

/*
 * �쳣ע������:
 * A:������д���෽��ʱ������ķ��������׳���ͬ���쳣�����쳣�����ࡣ
 * 		(���׻���,���Ӳ��ܱȸ��׸���)
 * 
 * B:��������׳��˶���쳣,������д����ʱ,ֻ���׳���ͬ���쳣����������
 * 		�Ӽ�,���಻���׳�����û�е��쳣
 * 
 * C:�������д�ķ���û���쳣�׳�,��ô����ķ������Բ������׳��쳣,���
 * 		���෽�������쳣����,��ô����ֻ��try,����throws
 * 
 */
public class StudentDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ���ɼ�");
		int t = sc.nextInt();
		try {
			check(t);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void check(int t) throws Exception {
		if (t > 100 || t < 0) {
			throw new MyException("������������");
		} else {
			System.out.println("����û������");
		}
	}
}
