package map;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMap String���Student
 * 
 * LinkedHashMap  Map �ӿڵĹ�ϣ��������б�ʵ�֣����п�Ԥ֪�ĵ���˳��
 *  ��ϣ��֤Ԫ�ص�Ψһ�ԡ�
 * ����֤Ԫ������(�洢��ȡ����һ��)
 * 
 */
public class HashMapDemo2 {
	public static void main(String[] args) {
		HashMap<String,Student> a = new HashMap<String,Student>();
		
		//����ѧ������
		Student s1 = new Student(17,"����ʤ");
		Student s2 = new Student(18,"����ʤ");
		Student s3 = new Student(19,"����ʤ");
		Student s4 = new Student(17,"ʤ");
		
		a.put("it1", s1);
		a.put("it2", s2);
		a.put("it3", s3);
		a.put("it4", s4);
		
		Set<String> b = a.keySet();
		for(String c :b) {
			Student d= a.get(c);
			System.out.println("���:"  +c + "ѧ������:" + d.getAge() +"ѧ������:" + d.getName());
			System.out.println("-----");
			System.out.println(a.get(c).toString());
			
		}
		
	}
}
