package arrayTool;

import java.util.Arrays;

/*
 * Arrays�Ĺ�����
 * 	���Һ�����
 * 	Ҫ����������
 * 
 * public static String toString();������ת��Ϊ�ַ���
 * public static void sort(����)�������������	���ǿ�������
 * public static int binarySearch(����,key)��������ж��ֲ���
 * 
 */
public class ArrayTool {
	public static void main(String[] args) {
		
		int []arr1= {2,3,5,7,9,4,3};
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		int []arr= {2,3,5,7,9,4,3};
		String s =arr.toString();
		System.out.println(s);
		
		int []arr2= {2,3,5,7,9,4,3};
		int i =Arrays.binarySearch(arr2,4);
		System.out.println(i);
		
	}
}
