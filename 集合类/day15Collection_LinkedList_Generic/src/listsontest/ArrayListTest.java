package listsontest;

import java.util.ArrayList;
import java.util.Iterator;

//去除字符串的重复值

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();

		a.add("hello");
		a.add("world");
		a.add("java");
		a.add("hello");
		a.add("hello");
		a.add("hello");
		a.add("hello");

		for (Iterator it = a.iterator(); it.hasNext();) {
			System.out.println((String) it.next());
		}

		System.out.println("-----");

		ArrayList b = new ArrayList();

		for (int x = 0; x < a.size(); x++) {
			// 为啥不能用指定的集合？

			if (!b.contains((String) a.get(x))) {
				b.add((String) a.get(x));
			}
		}

		for (int x = 0; x < b.size(); x++) {
			System.out.println((String) b.get(x));
		}

	}
}
