package listson;

import java.util.Vector;

/*
 * ���й���
 * ��ӣ�
 * public void addElement(E obj)	-add
 * 
 * ��ȡ��
 * public E elementAt(int index)	-get
 * public Enumeration<E> elements()		iterator
 * 				 
 			boolean hasMoreElements() 	 hasnext
 			nextElement() 		-next
 *		JDK�������򣺰�ȫ��Ч�ʣ���
 */
public class VectorDemo {
	public static void main(String[] args) {
		
		Vector a = new Vector();
		
		Student s1 = new Student(10,"����");
		Student s2 = new Student(12,"��");
		Student s3 = new Student(11,"��");
		
		a.add(s1);
		a.add(s2);
		a.add(s3);
		
		for(int x = 0;x <a.size(); x ++) {
			Student s =(Student)a.get(x);
			System.out.println(s.getAge() + s.getName());
		}
		
		/*a.addElement("hello");
		a.addElement("world");
		a.addElement("����ʤ");
		
		for(int x = 0; x <a.size(); x ++) {
			System.out.println((String)a.elementAt(x));
			
		}
		System.out.println("------");
		
		Enumeration s = a.elements();
		while(s.hasMoreElements()) {
		System.out.println((String)s.nextElement());*/
		
		
		
	}
}
