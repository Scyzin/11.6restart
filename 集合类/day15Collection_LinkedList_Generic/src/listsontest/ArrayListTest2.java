package listsontest;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();

		a.add("hello");
		a.add("world");
		a.add("java");
		a.add("hello");
		a.add("hello");
		a.add("hello");
		a.add("hello");
		
		//����ѡ�������˼��
		for(int x = 0;x <a.size()-1; x ++) {
			for(int y = x+1;y<a.size();y++) {
				if(a.get(x).equals(a.get(y))){
					a.remove(y);
					//�Ƴ��󣬳������⣬��һ��Ԫ�ز�����һ���ظ�Ԫ��
					y--;
				}
			}
		}
		
		for(Iterator it = a.iterator();it.hasNext();) {
			System.out.println((String)it.next());
		}
	}
}
