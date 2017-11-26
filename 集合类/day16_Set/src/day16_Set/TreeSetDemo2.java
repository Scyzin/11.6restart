package day16_Set;

import java.util.TreeSet;

/*
 * 怎么排序：
 * 		自然排序：按姓名的长度
 * 
 * 	成员变量怎么判断是否为同一个元素。
 * 	  唯一性：是根据比较的返回是否是0来决定。
 * 排序：
 * 		A:自然排序(元素具备比较性)
 * 			让元素所属的类实现自然排序接口 Comparable
 * 		B:比较器排序(集合具备比较性)
 * 			让集合的构造方法接收一个比较器接口的子类对象 Comparator
 * 
 */
public class TreeSetDemo2 {
	public static void main(String[] args) {
		// 自然排序
		TreeSet<Student> ts = new TreeSet<Student>();

		Student s1 = new Student("林青霞1", 27);
		Student s2 = new Student("柳岩", 22);
		Student s3 = new Student("王祖贤22", 30);
		Student s4 = new Student("林青霞", 27);
		Student s5 = new Student("林青霞", 20);
		Student s6 = new Student("范冰冰", 22);

		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);

		for (Student s : ts) {
			System.out.println(s.getAge() + s.getName());
		}
	}
}
