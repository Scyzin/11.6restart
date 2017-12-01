package iodata;

import java.util.Properties;
import java.util.Set;

/*
 * Properties:属性集合类。是一个可以和IO流相结合使用的集合类。
 * Properties 可保存在流中或从流中加载。属性列表中每个键及其对应值都是一个字符串。
 * 是Hashtable的子类，说明是一个Map集合。
 * 
 * 特殊功能：
 * public Object setProperty(String key,String value)：添加元素
 * public String getProperty(String key):获取元素
 * public Set<String> stringPropertyNames():获取所有的键的集合* 
 *  
 */
public class PropertiesDemo {
	public static void main(String[] args) {

		Properties prop = new Properties();
		Properties prop2 = new Properties();

		prop.put("111", "陈");
		prop.put("2", "飞");
		prop.put("3", "无");

		prop2.setProperty("111", "陈");
		prop2.setProperty("2", "飞");
		prop2.setProperty("3", "无");

		Set<Object> set = prop.keySet();
		for (Object key : set) {
			System.out.println(key + "-------" + prop.get(key));
		}

		Set<String> set2 = prop2.stringPropertyNames();
		for (String key2 : set2) {
			System.out.println(key2 + "------" + prop2.getProperty(key2));
		}
	}
}
