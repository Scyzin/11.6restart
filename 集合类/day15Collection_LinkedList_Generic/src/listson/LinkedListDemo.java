package listson;

import java.util.LinkedList;

/*
 * 添加：
 * 		 void addFirst(E e) 	将指定元素插入此列表的开头。 
 * 	 	void addLast(E e) 将指定元素添加到此列表的结尾 
 * 获取：
 * 		E getFirst() 返回此列表的第一个元素。 //拿值 本身的链表不变
 *		 E getLast() 返回此列表的最后一个元素 
 *删除：
 *		 E removeLast() 移除 并 返回 此列表的最后一个元素。 
 * 
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList link = new LinkedList();
		
		link.add("hello");
		link.addLast("好嗎");//链表是按顺序添加的，所有addLast和add并未什么区别
		link.add("world");
		for(int x = 0;x <link.size();x++) {
		System.out.println((String)link.get(x));
		}
		
		System.out.println("-----");
		
		link.addFirst("不好");
		
		System.out.println((String)link.getFirst() + (String)link.getLast());
		System.out.println("-----");
		
		link.removeLast();
		for(int x = 0;x <link.size();x++) {
			System.out.println((String)link.get(x));
			}
		
		}
}
