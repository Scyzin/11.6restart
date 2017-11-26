package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 * HashMap嵌套ArrayList
 * 同理  可以写出ArrayList嵌套HashMap
 * 
 * 需求：
 		假设HashMap集合的元素是ArrayList。有3个。
 		每一个ArrayList集合的值是字符串。
 		元素我已经完成，请遍历。
 	结果：
		 三国演义
		 	吕布
		 	周瑜
		 笑傲江湖
		 	令狐冲
		 	林平之
		 神雕侠侣
		 	郭靖
		 	杨过  

 */
public class Test3 {
	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

		ArrayList<String> a = new ArrayList<String>();
		a.add("卢布");
		a.add("赵云");
		hm.put("三国演义", a);

		ArrayList<String> b = new ArrayList<String>();
		b.add("令狐冲");
		b.add("林平之云");
		hm.put("笑傲江湖", b);

		ArrayList<String> c = new ArrayList<String>();
		c.add("郭靖");
		c.add("杨过  ");
		hm.put(" 神雕侠侣", c);

		Set<String> hmkey = hm.keySet();
		for (String s1 : hmkey) {
			System.out.println(s1);
			ArrayList<String> d = hm.get(s1);
			for (String s2value : d) {
				System.out.println("\t" + s2value);
			}

		}

	}
}
