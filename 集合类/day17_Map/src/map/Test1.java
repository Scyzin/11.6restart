package map;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 * "aababcabcdabcde",��ȡ�ַ�����ÿһ����ĸ���ֵĴ���
 * Ҫ����:a(5)b(4)c(3)d(2)e(1)
 * 
 * ������
 * 		A:����һ���ַ���(���ԸĽ�Ϊ����¼��)
 * 		B:����һ��TreeMap����
 * 			��:Character
 * 			ֵ��Integer
 * 		C:���ַ���ת��Ϊ�ַ�����
 * 		D:�����ַ����飬�õ�ÿһ���ַ�
 * 		E:�øղŵõ����ַ���Ϊ����������ȥ��ֵ��������ֵ
 * 			��null:˵���ü������ڣ��ͰѸ��ַ���Ϊ����1��Ϊֵ�洢
 * 			����null:˵���ü����ڣ��Ͱ�ֵ��1��Ȼ����д�洢�ü���ֵ
 * 		F:�����ַ�������������
 * 		G:�������ϣ��õ�����ֵ�����а���Ҫ��ƴ��
 * 		H:���ַ���������ת��Ϊ�ַ������
 * 
 * ¼�룺linqingxia
 * �����result:a(1)g(1)i(3)l(1)n(2)q(1)x(1) 
 */

public class Test1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String line = sc.nextLine();
		
		TreeMap<Character , Integer> tm = new TreeMap<Character, Integer>();
		
		//�ַ���תΪ�ַ�����
		char[] ch = line.toCharArray();
		for(char a :ch ) {
			Integer i = tm.get(a);
			
			if(i == null) {
				tm.put(a, 1);
			}else {
				i++;
				tm.put(a, i);
			}
		}
		
		StringBuilder s = new StringBuilder();
		//�������ϣ��õ�����ֵ
		Set<Character> set = tm.keySet();
		for(Character key : set) {
			Integer value = tm.get(key);
			s.append(key).append("(").append(value).append(")");
		}
		String result = s.toString();
		System.out.println("��� " + result);
		
	}
}
