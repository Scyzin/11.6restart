package collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * boolean addAll(Collection c):���һ�����ϵ�Ԫ��
 * boolean removeAll(Collection c):�Ƴ�һ�����ϵ�Ԫ��  ��һ��
 * boolean containsAll(Collection c)���жϼ������Ƿ����ָ���ļ���Ԫ��(������)
 * boolean retainAll(Collection c):�������϶��е�Ԫ��?˼��Ԫ��ȥ���ˣ����ص�boolean����ʲô��˼��?
 * 
 * Object [] toArray();�Ѽ���ת�������飬����ʵ�ּ��ϵı�����
 * 
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
		c1.add("abd1");
		c1.add("abd2");
		c1.add("abd3");
		
		c2.add("abd3");
		c2.add("abd2");
		c2.add("abd6");
		
		//��C2��Ԫ����ӵ�C1�У��������ظ�
		//System.out.println("addAll" + c1.addAll(c2));
		
		//�Ƴ�һ�������Ƴ�
		//System.out.println("removeAll:" + c1.removeAll(c2));
		
		//�������в��ǰ���
		System.out.println("containsAll:" + c1.containsAll(c2));
		
		//��ͬ������Ԫ��ȥ��C1��
		//����ֵ��ʾC1�е�Ԫ���Ƿ����˸ı䡣��C1�ǿռ���û�й�ͬԪ�أ�����
		//���ķ���ֵΪ true��
		//System.out.println("retatinAll��" + c1.retainAll(c2));
		System.out.println("c1" + c1);
		System.out.println("c2" + c2);
		
		Object [] objs = c1.toArray();
		for(int x = 0; x < objs.length;x++) {
			System.out.println(objs[x]);
			
			String s = (String) objs[x];
			System.out.println(s+ "----" +s.length());
		}
	}
}
