package jdk5news;

import java.util.ArrayList;

/*
 * 增强for循环
 * 
 * for(元素数据类型 变量 : 数组或者Collection集合的对象 ) {
	使用变量即可，该变量就是元素
    }
 * 
 * 好处：简化遍历
 * 就是用来替代迭代器的	源码上就可以看到的
 * 
 */
public class ForDemo {
	public static void main(String[] args) {
			int [] arr = {1,2,3,4,5};
			for(int x = 0 ; x < arr.length; x ++) {
				System.out.println(arr[x]);
			}
			System.out.println("------");
		
			for(int x :arr) {
				System.out.println(x);
			}
			System.out.println("------");
			
			ArrayList<String> array = new ArrayList<String>();
			array.add("hellow");
			array.add("world");
			array.add("java");
			
			//弊端：要首先进行表的空指针判断
			if(array!=null) {
			for(String s :array) {
				System.out.println(s);
			} 
			}
	}
}
