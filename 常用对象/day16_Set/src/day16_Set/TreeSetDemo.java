package day16_Set;

import java.util.TreeSet;

/*
 * TreeSet�ص�
 * 		ʹ��Ԫ�ص���Ȼ˳���Ԫ�ؽ�������
 * 
 * 		���߸��ݴ��� set ʱ�ṩ�� Comparator ��������
		����ȡ����ʹ�õĹ��췽���� 
			
 * 	�����Ψһ
 */
public class TreeSetDemo {
	public static void main(String[] args) {
			TreeSet<Integer> a = new TreeSet<Integer>();
			
			a.add(15);
			a.add(18);
			a.add(22);
			a.add(15);
			a.add(19);
			a.add(23);
			a.add(24);
			a.add(15);
			
			for(Integer s : a) {
				System.out.println(s);
			}
	}
}
