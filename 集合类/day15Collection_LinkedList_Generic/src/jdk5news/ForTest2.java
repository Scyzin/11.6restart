package jdk5news;

import java.util.ArrayList;
import java.util.Iterator;

import listson.Student;

/*
 * 
 */
public class ForTest2 {
	public static void main(String[] args) {
		ArrayList<Student> a = new ArrayList<Student>();
		
		Student s1 = new Student(10,"³Â×ð");
		Student s2 = new Student(12,"³Â");
		Student s3 = new Student(11,"³Â");
		
		a.add(s1);
		a.add(s2);
		a.add(s3);
		
		for(int x = 0;x <a.size(); x ++) {
			Student s =(Student)a.get(x);
			System.out.println(s.getAge() + s.getName());
		}
		System.out.println("-----");
		
		for(Iterator<Student> it = a.iterator();it.hasNext();) {
			Student s = it.next();
			System.out.println(s.getAge() + s.getName());
		}
		System.out.println("-----");
		
		for(Student s :a) {
			System.out.println(s.getAge() + s.getName());
		}
	}
}
