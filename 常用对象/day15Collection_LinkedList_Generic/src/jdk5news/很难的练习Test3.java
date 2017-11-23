package jdk5news;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*
 * 键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值
 */
public class 很难的练习Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> array = new ArrayList<Integer>();

		while (true) {
			System.out.println("请输入数据");
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
		System.out.println("输入的数据为" + arrayToString(i) + "最大值为" + i[i.length-1]);	
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
