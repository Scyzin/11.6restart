package listsontest;

import java.util.ArrayList;
import java.util.Iterator;

import listson.Student;

/*
 * 自定义对象存储的判断可能会出现问题
 * 
 * contains方法的底层依赖的是equals方法。学生类没有eqauls方法，
 * 用的是object的equals，比较的是地址值。要重写学生类的equals
 * 
 */
public class ArrayLiestTest3 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();

		Student s1 = new Student(10, "陈尊");
		Student s2 = new Student(10, "陈尊");
		Student s3 = new Student(10, "陈尊");
		Student s4 = new Student(12, "陈");
		Student s5 = new Student(11, "陈");

		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		a.add(s5);
		
		ArrayList b = new ArrayList();

		for (int x = 0; x < a.size(); x++) {
			// 为啥不能用指定的集合？

			if (!b.contains((Student) a.get(x))) {
				b.add((Student) a.get(x));
			}
		}
		//下面代码出错了
		/*for (int x = 0; x < a.size() - 1; x++) {
			for (int y = x + 1; y < a.size(); y++) {
				//
				if((Student)a.get(x).equals((Student)a.get(y)){
					a.remove(y);
					y--;
				}
			}
		}*/
		
		for(Iterator it = b.iterator();it.hasNext();) {
			System.out.println((Student)it.next());

	}
}
}
