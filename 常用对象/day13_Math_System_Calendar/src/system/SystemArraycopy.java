package system;

import java.util.Arrays;

/*
 * static void arraycopy(Object src, 
 * int srcPos, Object dest, int destPos, int length) 
          从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。       
 */
public class SystemArraycopy {
	public static void main(String[] args) {
		int [] arr = {11,22,33,44};
		int [] arr2 = {1,2,3,4};
		//从原数组第一个位置开始，复制几个替换到指定数组的位置，
		System.arraycopy(arr, 1,arr2, 2, 2);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
}
