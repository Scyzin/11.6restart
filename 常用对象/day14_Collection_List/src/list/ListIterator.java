package list;
/*
 * ListIterator
 * 
 * boolean hasPrevious() 如果以逆向遍历列表，列表迭代器有多个元素，则返回 true。
 * 
 * E previous()  返回列表中的前一个元素。 
 * 
 * 可以实现逆向遍历，但是必须正向遍历，一般不适用。 
 * 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("hello");
		list.add("hell");
		list.add("helo");
		
		ListIterator lit = new ListIterator();
		while(lit.hasPrevious()) {
			String s = (String)lit.previous;
			System.out.println(s);
			
		}
	}
}
