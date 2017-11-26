package set;
/*
 * 编写一个程序，获取10个1至20的随机数，要求随机数不能重复。
 * 
 */
import java.util.HashSet;
import java.util.Random;

public class HashSetTest {
	public static void main(String[] args) {
		//创建随机数对象
		Random a = new Random();
		//创建set集合
		HashSet<Integer> ts = new HashSet<Integer>();
		//判断集合长度是否为10
		while (ts.size() < 10) {
			int num = a.nextInt(20) + 1;
			//hashset 不会重复，且无序。
			ts.add(num);
		}
		//遍历
		for (Integer b : ts) {
			System.out.println(b);
		}

	}
}
