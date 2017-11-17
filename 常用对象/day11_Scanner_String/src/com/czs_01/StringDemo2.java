package com.czs_01;

/*
 * String一旦被赋值，值就不能被改变。		引用可以被改变
 * 
 * String s = new String(“hello”)和String s = “hello”;的区别?
 * 
 * 字符串如果是变量相加，先开空间，再相加；
 * 如果是常量相加，先相加，再在常量池里找，有就直接返回，否则就创建。
 *	
 */
public class StringDemo2 {
	public static void main(String[] args) {
		/*
		 * String s = "hello"; s += "world";//等于创建了两个对象。 System.out.println("s = " + s);
		 */

		String s = new String("hello");// 堆创建了一个地址，方法区里创建了一个地址，放置"hello"/
		System.out.println("s = " + s);

		String s1 = "hello";// 已经有hello，直接指向方法区里的地址。
		System.out.println("s1 = " + s1);

		System.out.println(s1 == s);
		System.out.println(s.equals(s1));
	}
}
