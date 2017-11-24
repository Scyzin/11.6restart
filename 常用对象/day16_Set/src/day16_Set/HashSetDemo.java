package day16_Set;

import java.util.HashSet;
import java.util.Iterator;

/*
 * hashset:存储字符串并遍历
 * 		无序
 * 
 * 如何保证唯一性
 * 		底层方法是hashcod();equals()
 * 		比较哈希值，如果相同走equals,如果不同，直接添加到集合中
 * 按照方法的步骤来说：	
 * 		先看hashCode()值是否相同
 * 			相同:继续走equals()方法
 * 				返回true：	说明元素重复，就不添加
 * 				返回false：说明元素不重复，就添加到集合
 * 			不同：就直接把元素添加到集合
 * 如果类没有重写这两个方法，默认使用的Object()。一般来说不会相同。
 * 而String类重写了hashCode()和equals()方法，所以，它就可以把内容
 * 相同的字符串去掉。只留下一个。	
 */
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("不好");
		hs.add("好");
		hs.add("好不好");
		hs.add("好");
		
		for(Iterator<String>it = hs.iterator();it.hasNext();) {
			System.out.println(it.next());
		}
		
	}
}
