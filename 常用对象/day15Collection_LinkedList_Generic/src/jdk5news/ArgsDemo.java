package jdk5news;

import java.util.Arrays;
import java.util.List;

/*
 * ��ʽ :���η� ����ֵ���� ������(�������͡�  ������){}
 * 	����ı�����ʵ��һ������
 * 	����ж���������ɱ����һ�������һ��
 * 
 * * public static <T> List<T> asList(T... a):������ת�ɼ���
 * 
 * ע�����
 * 		��Ȼ���԰�����ת�ɼ��ϣ����Ǽ��ϵĳ��Ȳ��ܸı䣬������ĳ���һ��
 */
public class ArgsDemo {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int result = sum(a, b);
		System.out.println("result:" + result);
		
		
		List<String> list = Arrays.asList("hello", "world", "java");
		list.set(1, "javaee");
		
		for (String s : list) {
			System.out.println(s);
		}
		
		//������������ô����
	}
	
	public static int sum(int b,int...a) {
		
		int s = 0;
		for(int x :a) {
			s += x;
		}
		return s;
	}

	/*public static int sum(int a, int b) {
		return a + b;	
	}*/
}
