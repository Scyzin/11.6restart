## day17 Map ##
`public interface Map<K,V>  K` - 此映射所维护的键的类型 V - 映射值的类型
将键映射到值的对象。一个映射不能包含重复的键；每个键最多只能映射到一个值。

### Map和collection的区别？ ###
 * 		Map集合元素成对出现，集合的键是唯一的，但是可重复。键是set集合的，无序的	
 *  	Collection 集合存储元素单独出现，Set是唯一的，List可以重复。

### Map功能 ###

1:添加功能

 * 		V put(K key,V value):添加元素。
 * 			如果键是第一次存储，就直接存储元素，返回null
 * 			如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值
 
2:删除功能

 * 		void clear():移除所有的键值对元素
 *  	V remove(Object key)：根据键删除键值对元素，并把值返回

3:判断功能

 * 		boolean containsKey(Object key)：判断集合是否包含指定的键
 * 		boolean containsValue(Object value):判断集合是否包含指定的值
 * 		boolean isEmpty()：判断集合是否为空

4:获取功能

 * 		Set<Map.Entry<K,V>> entrySet():获取所有键值对象的集合
 *  	V get(Object key):根据键获取值
 * 		Set<K> keySet():获取集合中所有键的集合
 * 		Collection<V> values():获取集合中所有值的集合

5：长度功能
 * 		int size()：返回集合中的键值对的对数

### 遍历 ###

		Set<Integer> b = a.keySet();
		for (Integer s : b) {
			System.out.println(a.get(s));
		}

		Set<Map.Entry<Integer,String>> c = a.entrySet();
		for(Map.Entry<Integer,String> s1 :c) {	
			System.out.println(s1.getKey() + s1.getValue());
		}

### Collections ###

 **Collection和Collections的区别?**

 * Collection:是单列集合的顶层接口，有子接口List和Set。
 * Collections:是针对集合操作的工具类，有对集合进行排序和二分查找的方法

**方法**

 * public static <T> void sort(List<T> list)：排序 默认情况下是自然顺序。
 * public static <T> int binarySearch(List<?> list,T key):二分查找
 * public static <T> T max(Collection<?> coll):最大值
 * public static void reverse(List<?> list):反转
 * public static void shuffle(List<?> list):随机置换,对	位置进行随机的调换
