package map;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMap:�ǻ��ڹ�ϣ���Map�ӿ�ʵ�֡�
 * ��ϣ���������������֤����Ψһ�Եġ�
 * 
 * HashMap<String,String>
 * ����String
 * ֵ��String
 * 
 */
public class HashMapDemo {
	public static void main(String[] args) {

		HashMap<String, String> a = new HashMap<String, String>();

		a.put("it1", "����ʤ");
		a.put("it2", "����ʤ");
		a.put("it3", "����");
		a.put("it4", "��ʤ");

		Set<String> b = a.keySet();
		for (String s : b) {
			System.out.println(s + "----" + a.get(s));
		}
	}
}
