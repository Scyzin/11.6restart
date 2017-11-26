package collections;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 模拟斗地主洗牌和发牌
 * 
 * 分析：
 * 		A:创建一个牌盒
 * 		B:装牌
 * 		C:洗牌
 * 		D:发牌
 * 		E:看牌
 */

public class PokerDemo {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		//装牌
		String[] colors = {"♦","♣","♥","♠"};
		String [] numbers = {"3","4","5","7","8","9","10","J","Q","K","1","2"};
		
		for(String color : colors) {
			for(String number : numbers ) {
				array.add(color.concat(number));
			}
		}
		array.add("小王");
		array.add("大王");
		
		//洗牌
		Collections.shuffle(array);
		
		//发牌
		ArrayList<String> p1 = new ArrayList<String>();
		ArrayList<String> p2 = new ArrayList<String>();
		ArrayList<String> p3 = new ArrayList<String>();
		ArrayList<String> p4 = new ArrayList<String>();
		
		for(int x = 0;x <array.size();x++) {
			if(x >=array.size() -3) {
				p4.add(array.get(x));
			}else if( x %3==0){
				p1.add(array.get(x));
			}else if( x %3==1){
				p2.add(array.get(x));
			}else if( x %3==2){
				p3.add(array.get(x));
			}
		}
		
		//看牌
		lookPoker("陈遵胜", p1);
		lookPoker("陈遵", p2);
		lookPoker("陈胜", p3);
		
		lookPoker("底牌", p4);
	}
	public static void lookPoker(String name,ArrayList<String>array) {
		System.out.print(name + "的牌是"  );
		for(String s : array) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
}
