package listson;

import java.util.Iterator;
import java.util.Vector;

/*
 * Arraylist:��ѯ�죬��ɾ�����̲߳���ȫ��Ч�ʸ�
 * 
 * vector:��ѯ�죬��ɾ�����̰߳�ȫ��Ч�ʵ�
 * 
 * linkedlist����ѯ������ɾ�죬�̲߳���ȫ��Ч�ʸ�
 * 
 *�Զ���洢�࣬Ҫע��������ã����ô�����
 * 
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		Vector arr = new Vector();
		
		arr.add("hello");
		arr.add("world");
		arr.add("java");
		
		Iterator it = arr.iterator();
		while(it.hasNext()) {
			System.out.println((String)it.next());
		}
		
		System.out.println("--------");
		
		for(int x = 0;x<arr.size();x++) {
			System.out.println((String)arr.get(x));
		}
		
	}
}
