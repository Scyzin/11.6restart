package jdk5news;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * �÷��ͺ���ǿfor���б���
 * 
 * 
 */
public class ForTest {
	public static void main(String[] args) {
		ArrayList<String> li = new ArrayList<String>();
		
		li.add("hello");
		li.add("world");
		li.add("java");
		
		//1����  ��ͨfor
		for(int x = 0;x<li.size();x++) {
			System.out.println(li.get(x));
		}
		System.out.println("---");
		//2����	������
		for(Iterator<String> it = li.iterator();it.hasNext();) {
			System.out.println(it.next());
		}
		System.out.println("---");
		//3��ǿfor
		for(String s : li) {
			System.out.println(s);
		}
		
		
	}
}
