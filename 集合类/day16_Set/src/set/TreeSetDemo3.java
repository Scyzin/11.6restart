package set;

import java.util.Comparator;
import java.util.TreeSet;
/*
 * 利用构造器排序，需要使用一个构造器。
 * 他的方法的参数是接口，真正要的是接口的实现类的对象。
 * 可以使用匿名内部类
 * 
 * 每次排序的规则不同时，都要在学生类里面更改，太麻烦了。、
 * 运用构造器排序修改，比较方便。
 * 
 */
public class TreeSetDemo3 {
	public static void main(String[] args) {

		// TreeSet(Comparator<? super E> comparator)
		
		// 利用构造器排序
		//TreeSet<Student> ts = new TreeSet<Student>(new MyComparator());
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				
				int num = s1.getName().length() - s2.getName().length();
				
				int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
				
				int num3 = num2 == 0 ? s1.getAge() - s2.getAge() : num2;
				return num3;
			}
		});
		
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
