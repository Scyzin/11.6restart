package listsontest;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * ������ģ�����ݽṹ  ջ�ļ���
 * �Ƚ����
 * �½�һ���࣬��linkedlist��ȥģ��ջ�Ĺ���
 * �ٵ��������
 * 
 */
public class MyStackTest {
	public static void main(String[] args) {
		
		MyStack a = new MyStack();
		
		a.add("���");
		a.add("��");
		a.add("��");
		
		while(!a.isEmpty()) {
			System.out.println(a.get());
		}
		
	}
}
