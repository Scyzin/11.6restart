package day16_Set;

import java.util.TreeSet;

/*
 * TreeSet特点
 * 		使用元素的自然顺序对元素进行排序
 * 
 * 		或者根据创建 set 时提供的 Comparator 进行排序
		具体取决于使用的构造方法。 
			
 * 	排序和唯一
 */
public class TreeSetDemo {
	public static void main(String[] args) {
			TreeSet<Integer> a = new TreeSet<Integer>();
			
			a.add(15);
			a.add(18);
			a.add(22);
			a.add(15);
			a.add(19);
			a.add(23);
			a.add(24);
			a.add(15);
			
			for(Integer s : a) {
				System.out.println(s);
			}
	}
}
