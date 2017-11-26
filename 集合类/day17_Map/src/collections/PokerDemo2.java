package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/*
 * 思路：
 * 		A:创建一个HashMap集合
 * 		B:创建一个ArrayList集合
 * 		C:创建花色数组和点数数组
 * 		D:从0开始往HashMap里面存储编号，并存储对应的牌
 *        同时往ArrayList里面存储编号即可。
 *      E:洗牌(洗的是编号)
 *      F:发牌(发的也是编号，为了保证编号是排序的，就创建TreeSet集合接收)
 *      G:看牌(遍历TreeSet集合，获取编号，到HashMap集合找对应的牌)
 */

public class PokerDemo2 {
	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		ArrayList<Integer> array = new ArrayList<Integer>();

		// 装牌
		String[] colors = { "♦", "♣", "♥", "♠" };
		String[] numbers = { "3", "4", "5", "7", "8", "9", "10", "J", "Q", "K", "1", "2" };

		int index = 0;
		for (String number : numbers) {
			for (String color : colors) {
				String poker = color.concat(number);
				hm.put(index, poker);
				array.add(index);
				index++;
			}
		}
		hm.put(index, "小王");
		array.add(index);
		index++;
		hm.put(index, "大王王");
		array.add(index);

		// 洗牌
		Collections.shuffle(array);

		// 发牌
		TreeSet<Integer> p1 = new TreeSet<Integer>();
		TreeSet<Integer> p2 = new TreeSet<Integer>();
		TreeSet<Integer> p3 = new TreeSet<Integer>();

		TreeSet<Integer> p4 = new TreeSet<Integer>();

		for (int x = 0; x < array.size(); x++) {
			if (x >= array.size() - 3) {
				p4.add(array.get(x));
			} else if (x % 3 == 0) {
				p1.add(array.get(x));
			} else if (x % 3 == 1) {
				p2.add(array.get(x));
			} else if (x % 3 == 2) {
				p3.add(array.get(x));
			}
		}

		// 看牌
		lookPoker("陈遵胜", p1, hm);
		lookPoker("陈胜", p2, hm);
		lookPoker("陈胜", p3, hm);

		lookPoker("底牌", p4, hm);

	}

	public static void lookPoker(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm) {
		System.out.print(name + "的牌是");
		for (Integer s : ts) {
			System.out.print(hm.get(s) + "  ");
		}
		System.out.println();
	}

}
