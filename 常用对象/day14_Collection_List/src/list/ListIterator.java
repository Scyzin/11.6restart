package list;
/*
 * ListIterator
 * 
 * boolean hasPrevious() �������������б��б�������ж��Ԫ�أ��򷵻� true��
 * 
 * E previous()  �����б��е�ǰһ��Ԫ�ء� 
 * 
 * ����ʵ��������������Ǳ������������һ�㲻���á� 
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
