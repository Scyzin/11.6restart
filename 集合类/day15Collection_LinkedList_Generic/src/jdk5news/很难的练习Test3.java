package jdk5news;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*
 * ����¼�������ݣ���0������Ҫ���ڿ���̨������������е����ֵ
 */
public class ���ѵ���ϰTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> array = new ArrayList<Integer>();

		while (true) {
			System.out.println("����������");
			int number = sc.nextInt();
			if (number != 0) {
				array.add(number);
			}else {
				break;
			}
		}
		
		Integer[] i = new Integer[array.size()];
		array.toArray(i);
		Arrays.sort(i);
		System.out.println("���������Ϊ" + arrayToString(i) + "���ֵΪ" + i[i.length-1]);	
	}
	
	public static String arrayToString(Integer[] i) {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for(int x = 0; x <i.length;x++) {
			s.append(i[x]);
		}
		
		s.append("]");
		return s.toString();
		
	}
	
}
