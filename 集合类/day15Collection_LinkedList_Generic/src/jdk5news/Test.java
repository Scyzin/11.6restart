package jdk5news;

import java.util.ArrayList;
/*
 * 集合的嵌套遍历
 * 
 */
public class Test {
	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> a = new ArrayList<ArrayList<String>>();
	
		ArrayList<String> b =new ArrayList<String>();
		ArrayList<String> c =new ArrayList<String>();
		ArrayList<String> d =new ArrayList<String>();
		
		b.add("hello");
		b.add("world");
		b.add("java");
		
		c.add("ok");
		c.add("no");
		c.add("jsda");
		
		d.add("hi");
		d.add("ian");
		d.add("ojp");
		
		a.add(b);
		a.add(c);
		a.add(d);
		
		for(ArrayList<String> x : a) {
			for(String s :x) {
				System.out.println(s);
			}
		}
		
		
		
		
	}
}
