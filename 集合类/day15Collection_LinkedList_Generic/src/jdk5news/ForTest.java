package jdk5news;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 用泛型和增强for进行遍历
 * 
 * 
 */
public class ForTest {
	public static void main(String[] args) {
		ArrayList<String> li = new ArrayList<String>();
		
		li.add("hello");
		li.add("world");
		li.add("java");
		
		//1方法  普通for
		for(int x = 0;x<li.size();x++) {
			System.out.println(li.get(x));
		}
		System.out.println("---");
		//2方法	迭代器
		for(Iterator<String> it = li.iterator();it.hasNext();) {
			System.out.println(it.next());
		}
		System.out.println("---");
		//3增强for
		for(String s : li) {
			System.out.println(s);
		}
		
		
	}
}
