package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
 * Map的遍历
 * 1.根据键值去遍历，获取到值
 * 
 * 2.获取所有键值对象的集合，遍历键值对象，根据键值对象找键和值
 * 		Set<Map.Entry<K,V>> entrySet():
 * 
 * 	Map.entrySet 方法返回映射的 collection 视图
 * 
 */
public class MapDemo2 {
	public static void main(String[] args) {
		Map<Integer, String> a = new HashMap<Integer, String>();

		// 添加键对
		a.put(5, "陈遵胜");
		a.put(10, "姚明");
		a.put(15, "老妈");

		//1. 获取所有键
		Set<Integer> b = a.keySet();
		for (Integer s : b) {
			// 根据键去找值
			System.out.println(a.get(s));
		}
		
		//2.获取所有键值对对象的集合
		Set<Map.Entry<Integer,String>> c = a.entrySet();
		//遍历键值对对象的集合，得到每一个键值对对象
		for(Map.Entry<Integer,String> s1 :c) {	
			//根据键值对对象获取键和值
			System.out.println(s1.getKey() + s1.getValue());
		}
		
	}
}
