package listsontest;

import java.util.ArrayList;
import java.util.Iterator;

import listson.Student;

/*
 * �Զ������洢���жϿ��ܻ��������
 * 
 * contains�����ĵײ���������equals������ѧ����û��eqauls������
 * �õ���object��equals���Ƚϵ��ǵ�ֵַ��Ҫ��дѧ�����equals
 * 
 * ����student�ķ���.
 * 
 */
public class ArrayLiestTest3 {
	public static void main(String[] args) {
		ArrayList<Student> a = new ArrayList<Student>();

		Student s1 = new Student(10, "����");
		Student s2 = new Student(10, "����");
		Student s3 = new Student(10, "����");
		Student s4 = new Student(12, "��");
		Student s5 = new Student(11, "��");

		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		a.add(s5);
		
		ArrayList<Student> b = new ArrayList<Student>();

		for (int x = 0; x < a.size(); x++) {
			// Ϊɶ������ָ���ļ��ϣ�

			if (!b.contains((Student) a.get(x))) {
				b.add( a.get(x));
			}
		}
		//������������
		/*for (int x = 0; x < a.size() - 1; x++) {
			for (int y = x + 1; y < a.size(); y++) {
				//
				if((Student)a.get(x).equals((Student)a.get(y)){
					a.remove(y);
					y--;
				}
			}
		}*/
		
		for(Iterator<Student> it = b.iterator();it.hasNext();) {
			System.out.println(it.next());

	}
}
}
