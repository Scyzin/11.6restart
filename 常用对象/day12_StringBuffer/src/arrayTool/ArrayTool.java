package arrayTool;

import java.util.Arrays;

/*
 * Arrays的工具类
 * 	查找和排序
 * 	要带类名调用
 * 
 * public static String toString();把数组转换为字符串
 * public static void sort(数组)对数组进行排序	就是快速排序
 * public static int binarySearch(数组,key)对数组进行二分查找
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
