package jdk5news;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 将string和integer类型统一按string类型转换，报错
 * 
 * 集合模仿数组的做法，在创建对象的时候明确元素的数据类型，
 * 这就叫做   泛型。
 * 
 * 泛型：特殊的类型。把类型明确的工作推迟到创建对象或者调用方法的时候采取
 * 		明确 的类型。参数化类型，把类型当做参数一样的传递
 * 
 * 	<数据类型>		这里的类型只能是引用类型
 * 
 *  <E>  这个时候用泛型
 *  
 * 	这时候调用的时候，就不用向下转型了。
 * 	优点：	
 * 			把运行时候的问题提前到了编译期间
 * 			（String）it.next() 多余了，避免了强制转换
 * 			优化程序设计，减少警告问题。
 * 			
 * 	早期，object可以接收任意的对象类型，在是实际引用中，会有类型转换问题
 * 		JDK5后引入的，提高程序的安全性
 * 
 * JDK7特型:泛型推断.
 * 			ArrayList<String> arr = new ArrayList<>();
 * 
 */
public class GenericDemo {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("hello");
		arr.add("hlo");		
		arr.add("helo");
		
		//自动封箱
		//等价于arr.add(Integer.valueOf(10));
		arr.add("10");
		
		for(Iterator<String> it = arr.iterator();it.hasNext();) {
			System.out.println(it.next());
		}
	}
}
