package day16_Set;

import java.util.HashSet;
import java.util.Iterator;

/*
 * hashset:�洢�ַ���������
 * 		����
 * 
 * ��α�֤Ψһ��
 * 		�ײ㷽����hashcod();equals()
 * 		�ȽϹ�ϣֵ�������ͬ��equals,�����ͬ��ֱ����ӵ�������
 * ���շ����Ĳ�����˵��	
 * 		�ȿ�hashCode()ֵ�Ƿ���ͬ
 * 			��ͬ:������equals()����
 * 				����true��	˵��Ԫ���ظ����Ͳ����
 * 				����false��˵��Ԫ�ز��ظ�������ӵ�����
 * 			��ͬ����ֱ�Ӱ�Ԫ����ӵ�����
 * �����û����д������������Ĭ��ʹ�õ�Object()��һ����˵������ͬ��
 * ��String����д��hashCode()��equals()���������ԣ����Ϳ��԰�����
 * ��ͬ���ַ���ȥ����ֻ����һ����	
 */
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("����");
		hs.add("��");
		hs.add("�ò���");
		hs.add("��");
		
		for(Iterator<String>it = hs.iterator();it.hasNext();) {
			System.out.println(it.next());
		}
		
	}
}
