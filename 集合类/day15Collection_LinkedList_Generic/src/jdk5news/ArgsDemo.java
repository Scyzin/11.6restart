package jdk5news;

import java.util.Arrays;
import java.util.List;

/*
 * 格式 :修饰符 返回值类型 方法名(数据类型…  变量名){}
 * 	上面的变量其实是一个数组
 * 	如果有多个参数，可变参数一定是最后一个
 * 
 * * public static <T> List<T> asList(T... a):把数组转成集合
 * 
 * 注意事项：
 * 		虽然可以把数组转成集合，但是集合的长度不能改变，与数组的长度一样
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
		
		//多个数字求和怎么办呢
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
