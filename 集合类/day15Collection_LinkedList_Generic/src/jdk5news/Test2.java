package jdk5news;

import java.util.ArrayList;
/*
 * 产生1-20的不重复的随机数
 */
public class Test2 {
	public static void main(String[] args) {
		
		
		ArrayList<Integer> ran = new ArrayList<Integer>();
		
		int count = 0;
		while(count <10) {
			int a = (int)(Math.random()*20 +1);
			if(!ran.contains(a)) {
				ran.add(a);
				count ++;
			}
		}
		
		
		for(Integer x:ran) {
			System.out.println(x);
		}
		
		
	}
}
