package day16_Set;

import java.util.TreeSet;

/*
 * ��ô����
 * 		��Ȼ���򣺰������ĳ���
 * 
 * 	��Ա������ô�ж��Ƿ�Ϊͬһ��Ԫ�ء�
 * 	  Ψһ�ԣ��Ǹ��ݱȽϵķ����Ƿ���0��������
 * ����
 * 		A:��Ȼ����(Ԫ�ؾ߱��Ƚ���)
 * 			��Ԫ����������ʵ����Ȼ����ӿ� Comparable
 * 		B:�Ƚ�������(���Ͼ߱��Ƚ���)
 * 			�ü��ϵĹ��췽������һ���Ƚ����ӿڵ�������� Comparator
 * 
 */
public class TreeSetDemo2 {
	public static void main(String[] args) {
		// ��Ȼ����
		TreeSet<Student> ts = new TreeSet<Student>();

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
