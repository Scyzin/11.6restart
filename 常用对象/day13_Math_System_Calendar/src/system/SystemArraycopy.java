package system;

import java.util.Arrays;

/*
 * static void arraycopy(Object src, 
 * int srcPos, Object dest, int destPos, int length) 
          ��ָ��Դ�����и���һ�����飬���ƴ�ָ����λ�ÿ�ʼ����Ŀ�������ָ��λ�ý�����       
 */
public class SystemArraycopy {
	public static void main(String[] args) {
		int [] arr = {11,22,33,44};
		int [] arr2 = {1,2,3,4};
		//��ԭ�����һ��λ�ÿ�ʼ�����Ƽ����滻��ָ�������λ�ã�
		System.arraycopy(arr, 1,arr2, 2, 2);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
}
