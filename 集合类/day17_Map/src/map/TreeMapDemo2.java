package map;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;


/*
 * TreeMap，student, string
 * 
 * 要排序，比较器排序
 * 
 */
public class TreeMapDemo2 {
	public static void main(String[] args) {

		TreeMap< Student,String> a = new TreeMap< Student,String>(new Comparator<Student>(){

			@Override
			public int compare(Student s1, Student s2) {

				int num = s1.getAge() -s2.getAge();
				int num2 = num ==0 ?s1.getName().compareTo(s2.getName()):num;
				return num2;
			}
			
		});

		// 创建学生对象
		Student s1 = new Student(17, "陈遵胜");
		Student s2 = new Student(18, "陈遵胜");
		Student s3 = new Student(19, "陈遵胜");
		Student s4 = new Student(17, "胜");

		a.put(s1,"it1");
		a.put(s2,"it2" );
		a.put(s3,"it3");
		a.put(s4,"it4");

		Set<Student> b = a.keySet();
		for (Student c : b) {	

			System.out.println("编号:" +  "学生年龄:" + c.getAge() + "学生姓名:" + c.getName());
			System.out.println("-----");

		}
	}
}
