package map;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMap:是基于哈希表的Map接口实现。
 * 哈希表的作用是用来保证键的唯一性的。
 * 
 * HashMap<String,String>
 * 键：String
 * 值：String
 * 
 */
public class HashMapDemo {
	public static void main(String[] args) {

		HashMap<String, String> a = new HashMap<String, String>();

		a.put("it1", "陈遵胜");
		a.put("it2", "陈遵胜");
		a.put("it3", "陈遵");
		a.put("it4", "陈胜");

		Set<String> b = a.keySet();
		for (String s : b) {
			System.out.println(s + "----" + a.get(s));
		}
	}
}
