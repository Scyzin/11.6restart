package set;

import java.util.HashSet;
import java.util.Set;

/*
 * set特点：存储顺序与取出顺序不一致，唯一。
 * 		set有自己的存储顺序
 * 		
 * hashset:此类实现 Set 接口，由哈希表（实际上是一个 HashMap 实例）支持。
 * 			它不保证 set 的迭代顺序；特别是它不保证该顺序恒久不变。此类允许
 * 			使用 null 元素
 */
public class SetDemo {
	public static void main(String[] args) {
		
		Set<String> set= new HashSet<String>();
		
		set.add("你好");
		set.add("陈遵胜");
		set.add("你");
		
		for(String s :set) {
			System.out.println(s);
		}
	}
}
