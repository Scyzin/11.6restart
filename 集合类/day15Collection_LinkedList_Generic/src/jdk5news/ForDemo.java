package jdk5news;

import java.util.ArrayList;

/*
 * ��ǿforѭ��
 * 
 * for(Ԫ���������� ���� : �������Collection���ϵĶ��� ) {
	ʹ�ñ������ɣ��ñ�������Ԫ��
    }
 * 
 * �ô����򻯱���
 * �������������������	Դ���ϾͿ��Կ�����
 * 
 */
public class ForDemo {
	public static void main(String[] args) {
			int [] arr = {1,2,3,4,5};
			for(int x = 0 ; x < arr.length; x ++) {
				System.out.println(arr[x]);
			}
			System.out.println("------");
		
			for(int x :arr) {
				System.out.println(x);
			}
			System.out.println("------");
			
			ArrayList<String> array = new ArrayList<String>();
			array.add("hellow");
			array.add("world");
			array.add("java");
			
			//�׶ˣ�Ҫ���Ƚ��б�Ŀ�ָ���ж�
			if(array!=null) {
			for(String s :array) {
				System.out.println(s);
			} 
			}
	}
}
