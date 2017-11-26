package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
 * Map�ı���
 * 1.���ݼ�ֵȥ��������ȡ��ֵ
 * 
 * 2.��ȡ���м�ֵ����ļ��ϣ�������ֵ���󣬸��ݼ�ֵ�����Ҽ���ֵ
 * 		Set<Map.Entry<K,V>> entrySet():
 * 
 * 	Map.entrySet ��������ӳ��� collection ��ͼ
 * 
 */
public class MapDemo2 {
	public static void main(String[] args) {
		Map<Integer, String> a = new HashMap<Integer, String>();

		// ��Ӽ���
		a.put(5, "����ʤ");
		a.put(10, "Ҧ��");
		a.put(15, "����");

		//1. ��ȡ���м�
		Set<Integer> b = a.keySet();
		for (Integer s : b) {
			// ���ݼ�ȥ��ֵ
			System.out.println(a.get(s));
		}
		
		//2.��ȡ���м�ֵ�Զ���ļ���
		Set<Map.Entry<Integer,String>> c = a.entrySet();
		//������ֵ�Զ���ļ��ϣ��õ�ÿһ����ֵ�Զ���
		for(Map.Entry<Integer,String> s1 :c) {	
			//���ݼ�ֵ�Զ����ȡ����ֵ
			System.out.println(s1.getKey() + s1.getValue());
		}
		
	}
}
