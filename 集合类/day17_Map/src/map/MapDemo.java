package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * public interface Map<K,V>  K - 此映射所维护的键的类型 V - 映射值的类型
 * 
 * 将键映射到值的对象。一个映射不能包含重复的键；每个键最多只能映射到一个值。
 * 可以存储键值对的元素
 * 
 * 键是set是唯一的，值是collection。
 * 
 * 无序
 * 
 * Map和collection的区别？
 * 		Map集合元素成对出现，集合的键是唯一的，但是可重复。键是set集合的，无序的	
 *  	Collection 集合存储元素单独出现，Set是唯一的，List可以重复。
 *  
 *  Map集合的数据结构值针对键有效，跟值无关
 *  Collection集合的数据结构是针对元素有效
 * 
 * Map集合的功能概述：
 * 1:添加功能
 * 		V put(K key,V value):添加元素。
 * 			如果键是第一次存储，就直接存储元素，返回null
 * 			如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值
 * 2:删除功能
 * 		void clear():移除所有的键值对元素
 *  	V remove(Object key)：根据键删除键值对元素，并把值返回
 * 3:判断功能
 * 		boolean containsKey(Object key)：判断集合是否包含指定的键
 * 		boolean containsValue(Object value):判断集合是否包含指定的值
 * 		boolean isEmpty()：判断集合是否为空
 * 4:获取功能
 * 		Set<Map.Entry<K,V>> entrySet():获取所有键值对象的集合
 *  	V get(Object key):根据键获取值
 * 		Set<K> keySet():获取集合中所有键的集合
 * 		Collection<V> values():获取集合中所有值的集合
 * 5：长度功能
 * 		int size()：返回集合中的键值对的对数
 */
public class MapDemo {
	public static void main(String[] args) {
		Map<String,String> a = new HashMap<String,String>();
		
		//添加键对
		a.put("5","陈遵胜" );
		a.put("10","姚明" );
		a.put("15","老妈" );
		
		//之前已经添加了键值对应的值，所以put返回的是之前的值
		System.out.println("put" +a.put("15","老妈" ));
		
		//删除键，并返回对应的值
		System.out.println(a.remove("5"));
		
		//boolean containsKey(Object key)：判断集合是否包含指定的键
		System.out.println(a.containsKey("5"));
		
		//boolean containsValue(Object value):判断集合是否包含指定的值
		System.out.println(a.containsValue("姚明"));
		
		//boolean isEmpty()：判断集合是否为空
		System.out.println(a.isEmpty());
		
		System.out.println(a.size());
		System.out.println("------------");
		
		//V get(Object key):根据键获取值
		System.out.println(a.get("10"));
		
		//Set<K> keySet():获取集合中所有键的集合
		Set<String> b = a.keySet();
		for(String s : b) {
			System.out.println(s);
		}
		
		//Collection<V> values():获取集合中所有值的集合
		Collection<String> c = a.values();
		for(String s1 :c) {
			System.out.println(s1);
		}
		
		//集合元素的字符串的表示
		System.out.println("Map:" + a);
	}
}
