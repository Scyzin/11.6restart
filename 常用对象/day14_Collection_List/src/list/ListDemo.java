package list;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
/*
 * List的特点：
 * 			有序，可以索引
 * 			可重复
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
