package com.czs_01;

/*
 * Stringһ������ֵ��ֵ�Ͳ��ܱ��ı䡣		���ÿ��Ա��ı�
 * 
 * String s = new String(��hello��)��String s = ��hello��;������?
 * 
 * �ַ�������Ǳ�����ӣ��ȿ��ռ䣬����ӣ�
 * ����ǳ�����ӣ�����ӣ����ڳ��������ң��о�ֱ�ӷ��أ�����ʹ�����
 *	
 */
public class StringDemo2 {
	public static void main(String[] args) {
		/*
		 * String s = "hello"; s += "world";//���ڴ������������� System.out.println("s = " + s);
		 */

		String s = new String("hello");// �Ѵ�����һ����ַ���������ﴴ����һ����ַ������"hello"/
		System.out.println("s = " + s);

		String s1 = "hello";// �Ѿ���hello��ֱ��ָ�򷽷�����ĵ�ַ��
		System.out.println("s1 = " + s1);

		System.out.println(s1 == s);
		System.out.println(s.equals(s1));
	}
}
