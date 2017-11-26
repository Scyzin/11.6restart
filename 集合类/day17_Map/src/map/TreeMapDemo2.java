package map;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;


/*
 * TreeMap��student, string
 * 
 * Ҫ���򣬱Ƚ�������
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

		// ����ѧ������
		Student s1 = new Student(17, "����ʤ");
		Student s2 = new Student(18, "����ʤ");
		Student s3 = new Student(19, "����ʤ");
		Student s4 = new Student(17, "ʤ");

		a.put(s1,"it1");
		a.put(s2,"it2" );
		a.put(s3,"it3");
		a.put(s4,"it4");

		Set<Student> b = a.keySet();
		for (Student c : b) {	

			System.out.println("���:" +  "ѧ������:" + c.getAge() + "ѧ������:" + c.getName());
			System.out.println("-----");

		}
	}
}
