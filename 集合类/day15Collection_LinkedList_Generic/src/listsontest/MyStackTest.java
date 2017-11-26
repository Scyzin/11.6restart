package listsontest;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * 用链表模拟数据结构  栈的集合
 * 先进后出
 * 新建一个类，用linkedlist类去模拟栈的功能
 * 再调用这个类
 * 
 */
public class MyStackTest {
	public static void main(String[] args) {
		
		MyStack a = new MyStack();
		
		a.add("你好");
		a.add("好");
		a.add("好");
		
		while(!a.isEmpty()) {
			System.out.println(a.get());
		}
		
	}
}
