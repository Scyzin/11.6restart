package map;

import java.util.Set;
import java.util.TreeMap;
/*
 * TreeMap
 * 
 * �ײ��Ǻ�����ṹ
 * �޲�Ĭ����Ȼ����
 * 
 */
public class TreeMapDemo {
	public static void main(String[] args) {

		TreeMap<String, String> a = new TreeMap<String, String>();

		a.put("it1", "����ʤ");
		a.put("it2", "����ʤ");
		a.put("it3", "����");
		a.put("it4", "��ʤ");
		a.put("it2", "����2ʤ");
		

		Set<String> b = a.keySet();
		for (String s : b) {
			System.out.println(s + "----" + a.get(s));
		}
	}
}