package list;

import java.util.ArrayList;
import java.util.List;

/*
 * ��ӹ���
 * void add(String item, int index)  ������б�������ָʾ��λ�����ָ�����
 * 
 * ��ȡ����
 * String getItem(int index)   ��ȡ��ָ������������� 
 * 
 * List�ĵ�����
 * ListIterator<E> listIterator() 
 * 
 * ɾ������
 * 		Object remove(int index)����������ɾ��Ԫ��,���ر�ɾ����Ԫ��
 * 
 *	�޸Ĺ���
 * 		Object set(int index,Object element):���������޸�Ԫ�أ����ر����ε�Ԫ�� 
 */
public class ListAd {
	public static void main(String[] args) {
		// �������϶���
		List list = new ArrayList();

		// ���Ԫ��
		list.add("hello");
		list.add("world");
		list.add("java");

		// void add(int index,Object element):��ָ��λ�����Ԫ��
		// list.add(11, "javaee");//������
		//list.add(3, "javaee"); // û������

		// Object get(int index):��ȡָ��λ�õ�Ԫ��
		//System.out.println("get:" + list.get(1));
		
		//����Խ��
		// System.out.println("get:" + list.get(11));
		
		// Object remove(int index)����������ɾ��Ԫ��,���ر�ɾ����Ԫ��
		//System.out.println("remove:" + list.remove(1));
		
		// Object set(int index,Object element):���������޸�Ԫ�أ����ر����ε�Ԫ��
		System.out.println("set:"+ list.set(1, "����"));
		System.out.println("list:" + list);
		
		//����size��get�ķ���ʵ�ֱ���
		for(int x = 0; x <list.size();x ++) {
			String s =(String)list.get(x);
			System.out.println(s);
		}
		
	}
}
