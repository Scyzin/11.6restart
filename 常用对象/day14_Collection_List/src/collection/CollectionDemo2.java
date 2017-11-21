package collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * boolean addAll(Collection c):添加一个集合的元素
 * boolean removeAll(Collection c):移除一个集合的元素  是一个
 * boolean containsAll(Collection c)：判断集合中是否包含指定的集合元素(是所有)
 * boolean retainAll(Collection c):两个集合都有的元素?思考元素去哪了，返回的boolean又是什么意思呢?
 * 
 * Object [] toArray();把集合转换成数组，可以实现集合的遍历。
 * 
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
		c1.add("abd1");
		c1.add("abd2");
		c1.add("abd3");
		
		c2.add("abd3");
		c2.add("abd2");
		c2.add("abd6");
		
		//将C2的元素添加到C1中，可以有重复
		//System.out.println("addAll" + c1.addAll(c2));
		
		//移除一个就是移除
		//System.out.println("removeAll:" + c1.removeAll(c2));
		
		//包含所有才是包含
		System.out.println("containsAll:" + c1.containsAll(c2));
		
		//共同包含的元素去了C1。
		//返回值表示C1中的元素是否发生了改变。即C1是空集，没有共同元素，但是
		//他的返回值为 true。
		//System.out.println("retatinAll：" + c1.retainAll(c2));
		System.out.println("c1" + c1);
		System.out.println("c2" + c2);
		
		Object [] objs = c1.toArray();
		for(int x = 0; x < objs.length;x++) {
			System.out.println(objs[x]);
			
			String s = (String) objs[x];
			System.out.println(s+ "----" +s.length());
		}
	}
}
