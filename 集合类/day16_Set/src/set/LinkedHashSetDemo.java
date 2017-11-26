package set;

import java.util.LinkedHashSet;

/*
 * LinkedHashset 
 * 		Set 接口的哈希表和链接列表实现
 * 哈希表保证元素的唯一性。
 * 链表保证元素有序。(存储和取出是一致)
 * 
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> a = new LinkedHashSet<String>();
		
		a.add("不好");
		a.add("不好");
		a.add("好");
		a.add("好不好");
		
		for(String s : a) {
			System.out.println(s);
		}
	}
}
