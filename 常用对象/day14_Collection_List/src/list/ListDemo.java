package list;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
/*
 * List���ص㣺
 * 			���򣬿�������
 * 			���ظ�
 * 
 */
public class ListDemo {
	public static void main(String[] args) {
		List c = new ArrayList();
		
		c.add("string");
		c.add("string");
		c.add("adddasd");
		
		Iterator it 
		= c.iterator();	
		while(it.hasNext()){
			System.out.println((String)it.next() );
		}
		
	}
}
