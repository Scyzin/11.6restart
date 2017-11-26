package list;

import java.util.ArrayList;
import java.util.List;

/*
 * 添加功能
 * void add(String item, int index)  向滚动列表中索引指示的位置添加指定的项。
 * 
 * 获取功能
 * String getItem(int index)   获取与指定索引关联的项。 
 * 
 * List的迭代器
 * ListIterator<E> listIterator() 
 * 
 * 删除功能
 * 		Object remove(int index)：根据索引删除元素,返回被删除的元素
 * 
 *	修改功能
 * 		Object set(int index,Object element):根据索引修改元素，返回被修饰的元素 
 */
public class ListAd {
	public static void main(String[] args) {
		// 创建集合对象
		List list = new ArrayList();

		// 添加元素
		list.add("hello");
		list.add("world");
		list.add("java");

		// void add(int index,Object element):在指定位置添加元素
		// list.add(11, "javaee");//有问题
		//list.add(3, "javaee"); // 没有问题

		// Object get(int index):获取指定位置的元素
		//System.out.println("get:" + list.get(1));
		
		//索引越界
		// System.out.println("get:" + list.get(11));
		
		// Object remove(int index)：根据索引删除元素,返回被删除的元素
		//System.out.println("remove:" + list.remove(1));
		
		// Object set(int index,Object element):根据索引修改元素，返回被修饰的元素
		System.out.println("set:"+ list.set(1, "世界"));
		System.out.println("list:" + list);
		
		//运用size和get的方法实现遍历
		for(int x = 0; x <list.size();x ++) {
			String s =(String)list.get(x);
			System.out.println(s);
		}
		
	}
}
