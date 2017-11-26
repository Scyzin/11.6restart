package collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Iterator iterator()	集合的专用遍历方式
 * 
 * boolean hasNext() 如果仍有元素可以迭代，则返回 true。
 * object next()   返回迭代的下一个元素。
 * 
 * 集合的使用步骤：
 * 		1.创建集合对象
 * 		2.创建元素对象
 * 		3.把元素添加到集合中
 * 		4.遍历集合
 * 				通过集合对象获取迭代器对象
 * 				用hasnext 判断是否有元素
 * 				用next获取元素，并移动到下一个位置
 * 
 *	实现的具体的子类，以内部类的方式体现的。
 * 
 */
public class Iterator {
	public static void main(String[] args) {

		Collection c = new ArrayList();

		c.add("hello");
		c.add("world");

		// java.util.Iterator it = c.iterator();

		// 遍历
		/*
		 * while (it.hasNext()) { String s = (String) it.next(); System.out.println(s +
		 * " " + s.length()); }
		 */

		// 效率更高
		for (java.util.Iterator it = c.iterator(); it.hasNext();) {
			String s = (String) it.next();
			System.out.println(s + " " + s.length());
		}

	}
}
