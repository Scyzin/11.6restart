package set;

import java.util.LinkedHashSet;

/*
 * LinkedHashset 
 * 		Set �ӿڵĹ�ϣ��������б�ʵ��
 * ��ϣ��֤Ԫ�ص�Ψһ�ԡ�
 * ����֤Ԫ������(�洢��ȡ����һ��)
 * 
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> a = new LinkedHashSet<String>();
		
		a.add("����");
		a.add("����");
		a.add("��");
		a.add("�ò���");
		
		for(String s : a) {
			System.out.println(s);
		}
	}
}
