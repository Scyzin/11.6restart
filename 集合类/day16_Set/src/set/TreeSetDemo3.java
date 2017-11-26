package set;

import java.util.Comparator;
import java.util.TreeSet;
/*
 * ���ù�����������Ҫʹ��һ����������
 * ���ķ����Ĳ����ǽӿڣ�����Ҫ���ǽӿڵ�ʵ����Ķ���
 * ����ʹ�������ڲ���
 * 
 * ÿ������Ĺ���ͬʱ����Ҫ��ѧ����������ģ�̫�鷳�ˡ���
 * ���ù����������޸ģ��ȽϷ��㡣
 * 
 */
public class TreeSetDemo3 {
	public static void main(String[] args) {

		// TreeSet(Comparator<? super E> comparator)
		
		// ���ù���������
		//TreeSet<Student> ts = new TreeSet<Student>(new MyComparator());
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				
				int num = s1.getName().length() - s2.getName().length();
				
				int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
				
				int num3 = num2 == 0 ? s1.getAge() - s2.getAge() : num2;
				return num3;
			}
		});
		
		Student s1 = new Student("����ϼ1", 27);
		Student s2 = new Student("����", 22);
		Student s3 = new Student("������22", 30);
		Student s4 = new Student("����ϼ", 27);
		Student s5 = new Student("����ϼ", 20);
		Student s6 = new Student("������", 22);

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
