package listson;

import java.util.LinkedList;

/*
 * ��ӣ�
 * 		 void addFirst(E e) 	��ָ��Ԫ�ز�����б�Ŀ�ͷ�� 
 * 	 	void addLast(E e) ��ָ��Ԫ����ӵ����б�Ľ�β 
 * ��ȡ��
 * 		E getFirst() ���ش��б�ĵ�һ��Ԫ�ء� //��ֵ �����������
 *		 E getLast() ���ش��б�����һ��Ԫ�� 
 *ɾ����
 *		 E removeLast() �Ƴ� �� ���� ���б�����һ��Ԫ�ء� 
 * 
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList link = new LinkedList();
		
		link.add("hello");
		link.addLast("�Æ�");//�����ǰ�˳����ӵģ�����addLast��add��δʲô����
		link.add("world");
		for(int x = 0;x <link.size();x++) {
		System.out.println((String)link.get(x));
		}
		
		System.out.println("-----");
		
		link.addFirst("����");
		
		System.out.println((String)link.getFirst() + (String)link.getLast());
		System.out.println("-----");
		
		link.removeLast();
		for(int x = 0;x <link.size();x++) {
			System.out.println((String)link.get(x));
			}
		
		}
}
