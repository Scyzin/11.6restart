package collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Iterator iterator()	���ϵ�ר�ñ�����ʽ
 * 
 * boolean hasNext() �������Ԫ�ؿ��Ե������򷵻� true��
 * object next()   ���ص�������һ��Ԫ�ء�
 * 
 * ���ϵ�ʹ�ò��裺
 * 		1.�������϶���
 * 		2.����Ԫ�ض���
 * 		3.��Ԫ����ӵ�������
 * 		4.��������
 * 				ͨ�����϶����ȡ����������
 * 				��hasnext �ж��Ƿ���Ԫ��
 * 				��next��ȡԪ�أ����ƶ�����һ��λ��
 * 
 *	ʵ�ֵľ�������࣬���ڲ���ķ�ʽ���ֵġ�
 * 
 */
public class Iterator {
	public static void main(String[] args) {

		Collection c = new ArrayList();

		c.add("hello");
		c.add("world");

		// java.util.Iterator it = c.iterator();

		// ����
		/*
		 * while (it.hasNext()) { String s = (String) it.next(); System.out.println(s +
		 * " " + s.length()); }
		 */

		// Ч�ʸ���
		for (java.util.Iterator it = c.iterator(); it.hasNext();) {
			String s = (String) it.next();
			System.out.println(s + " " + s.length());
		}

	}
}
