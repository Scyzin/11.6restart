package jdk5news;

/*
 * ��̬���룺
 *  
 * ����ֱ�ӵ��뵽�����ļ���
 * 
 * ��̬�����ע�����
 * 		A:���������Ǿ�̬��
 * 		B:����ж��ͬ���ľ�̬���������ײ�֪��ʹ��˭?���ʱ��Ҫʹ�ã�
 * 		�����ǰ׺���ɴ˿ɼ������岻������һ�㲻�ã�����Ҫ�ܿ�����
 */

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class StaticImporterDemo {
	public static void main(String[] args) {
		// System.out.println(java.lang.Math.abs(-100));
		// System.out.println(java.lang.Math.pow(2, 3));

		// System.out.println(Math.abs(-100));
		// System.out.println(Math.pow(2, 3));

		System.out.println(abs(-100));
		System.out.println(pow(2, 3));

	}
}
