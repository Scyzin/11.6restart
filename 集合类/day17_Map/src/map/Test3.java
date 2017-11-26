package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 * HashMapǶ��ArrayList
 * ͬ��  ����д��ArrayListǶ��HashMap
 * 
 * ����
 		����HashMap���ϵ�Ԫ����ArrayList����3����
 		ÿһ��ArrayList���ϵ�ֵ���ַ�����
 		Ԫ�����Ѿ���ɣ��������
 	�����
		 ��������
		 	����
		 	���
		 Ц������
		 	�����
		 	��ƽ֮
		 �������
		 	����
		 	���  

 */
public class Test3 {
	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

		ArrayList<String> a = new ArrayList<String>();
		a.add("¬��");
		a.add("����");
		hm.put("��������", a);

		ArrayList<String> b = new ArrayList<String>();
		b.add("�����");
		b.add("��ƽ֮��");
		hm.put("Ц������", b);

		ArrayList<String> c = new ArrayList<String>();
		c.add("����");
		c.add("���  ");
		hm.put(" �������", c);

		Set<String> hmkey = hm.keySet();
		for (String s1 : hmkey) {
			System.out.println(s1);
			ArrayList<String> d = hm.get(s1);
			for (String s2value : d) {
				System.out.println("\t" + s2value);
			}

		}

	}
}
