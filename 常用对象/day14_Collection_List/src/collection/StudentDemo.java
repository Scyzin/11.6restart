package collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 
 * ע�⣺�Լ���������Ҫ��ѧϰ��Ҫʹ�õ�API�е�������ͬ
 * 		���ƴ����ʱ�����װ��Ǹ������ڵİ�һ�������С��
 * 		
 * 		������forѭ������forѭ���á�
 * 		
 * 		(Student)a.next().getAge*(;�����next���������׷���ÿ��ʹ��
 * 		���Ƿ���һ������
 * 
 */
public class StudentDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		Student s = new Student("����ʤ",22);
		Student s2 = new Student("����ʤ",23);
		Student s3 = new Student("����ʤ",24);
		Student s4 = new Student("����ʤ",24);
		Student s5 = new Student("����ʤ",25);
		
		
		c.add(s);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		System.out.println("c:" + c);//���ص��ǵ�ֵַ
		
		java.util.Iterator a = c.iterator();
		while(a.hasNext()){
			Student sr =(Student)a.next();
			System.out.println(sr.getAge() + sr.getName());
		}
		
		
		/*Object[]obj=c.toArray();
		for(int x = 0; x < obj.length; x ++) {
		sr������ת��
		Student sr = (Student)obj[x];
		System.out.println(s.getAge()+s.getName());
			} */

	}
}
