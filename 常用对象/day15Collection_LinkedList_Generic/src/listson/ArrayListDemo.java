package listson;

import java.util.Iterator;
import java.util.Vector;

/*
 * Arraylist:查询快，增删慢，线程不安全，效率高
 * 
 * vector:查询快，增删慢，线程安全，效率低
 * 
 * linkedlist：查询慢，增删快，线程不安全，效率高
 * 
 *自定义存储类，要注意对象引用，别用错类名
 * 
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		Vector arr = new Vector();
		
		arr.add("hello");
		arr.add("world");
		arr.add("java");
		
		Iterator it = arr.iterator();
		while(it.hasNext()) {
			System.out.println((String)it.next());
		}
		
		System.out.println("--------");
		
		for(int x = 0;x<arr.size();x++) {
			System.out.println((String)arr.get(x));
		}
		
	}
}
