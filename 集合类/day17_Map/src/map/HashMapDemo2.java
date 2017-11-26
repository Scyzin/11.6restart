package map;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMap String类和Student
 * 
 * LinkedHashMap  Map 接口的哈希表和链接列表实现，具有可预知的迭代顺序。
 *  哈希表保证元素的唯一性。
 * 链表保证元素有序。(存储和取出是一致)
 * 
 */
public class HashMapDemo2 {
	public static void main(String[] args) {
		HashMap<String,Student> a = new HashMap<String,Student>();
		
		//创建学生对象
		Student s1 = new Student(17,"陈遵胜");
		Student s2 = new Student(18,"陈遵胜");
		Student s3 = new Student(19,"陈遵胜");
		Student s4 = new Student(17,"胜");
		
		a.put("it1", s1);
		a.put("it2", s2);
		a.put("it3", s3);
		a.put("it4", s4);
		
		Set<String> b = a.keySet();
		for(String c :b) {
			Student d= a.get(c);
			System.out.println("编号:"  +c + "学生年龄:" + d.getAge() +"学生姓名:" + d.getName());
			System.out.println("-----");
			System.out.println(a.get(c).toString());
			
		}
		
	}
}
