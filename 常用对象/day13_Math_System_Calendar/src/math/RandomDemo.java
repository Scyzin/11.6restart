package math;

import java.util.Random;

/*
 * Random() 
          创建一个新的随机数生成器。是当前时间的毫秒值。
    Random(long seed) 
 * 用单个 long 种子创建一个新的随机数生成器。
 * 给定种子后，每次产生的随机数是相同的。
 * 
 * 成员方法：
 * public int nextInt()		int范围内的随机数
 * public int nextInt(int n)	[0-n)

 * 
 */
public class RandomDemo {
	public static void main(String[] args) {
		Random r = new Random();
		//Random s = new Random(100);
		
		for(int x = 0 ; x < 10 ;x ++) {
			int num = r.nextInt();
			//int num = r.nextInt(100);
			System.out.println(num);
		}
		
	}
}
