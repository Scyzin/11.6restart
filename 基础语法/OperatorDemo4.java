/*
	比较运算符：
			==,!=,>,>=,<,<=
		操作结果是boolean类型。true false
		
		== 不能写成 =
		
	逻辑运算符：
			&&	||	&	^	!	|
			用于连接布尔型表达式或者值。
			a == b
	结论：
		&逻辑与:有false则false。
		|逻辑或:有true则true。
		^逻辑异或:相同为false，不同为true。
			举例：情侣关系。男男,男女,女男,女女
		!逻辑非:非false则true，非true则false。
			特点：偶数个不改变本身。
		
		&&和&的区别? 同理||和|的区别?
		最终结果一样。
		&&具有短路效果。左边是false，右边不执行。
		|| 左边是true，右边不执行。
		
		开发中常用的逻辑运算符：
		&&,||,!	
		
*/
class OperatorDemo4{
	public static void main(String[] args){
		int x = 3;
		int y = 4;
		int z = 3;
		
		System.out.println(x==y);//false
		System.out.println(x!=y);//true
		System.out.println(x>=y);//false
		
		boolean flag = (x == y);
		System.out.println(flag);//false
		//有问题的 boolean flag = (x = y);
		
		//&逻辑与
		System.out.println((a > b) & (a > c)); //false & false = false
		System.out.println((a > b) & (a < c)); //false & true = false
		System.out.println((a < b) & (a > c)); //true & false = false
		System.out.println((a < b) & (a < c)); //true & true = true
		System.out.println("---------------");
		
		//|逻辑或
		System.out.println((a > b) | (a > c)); //false | false = false
		System.out.println((a > b) | (a < c)); //false | true = true
		System.out.println((a < b) | (a > c)); //true | false = true
		System.out.println((a < b) | (a < c)); //true | true = true
		System.out.println("---------------");
		
		//^逻辑异或
		System.out.println((a > b) ^ (a > c)); //false ^ false = false
		System.out.println((a > b) ^ (a < c)); //false ^ true = true
		System.out.println((a < b) ^ (a > c)); //true ^ false = true
		System.out.println((a < b) ^ (a < c)); //true ^ true = false
		System.out.println("---------------");
		
		//!逻辑非
		System.out.println(!(a > b)); //!false = true
		System.out.println(!(a < b)); //!true = false
		System.out.println(!!(a > b)); //!!false = false
		System.out.println(!!!(a > b)); //!!false = true
		
		//&&双与
		System.out.println((a > b) && (a > c)); //false && false = false
		System.out.println((a > b) && (a < c)); //false && true = false
		System.out.println((a < b) && (a > c)); //true && false = false
		System.out.println((a < b) && (a < c)); //true && true = true
		System.out.println("----------------");
		
		int x = 3;
		int y = 4;
		
		//boolean b1 = ((x++ == 3) & (y++ == 4));
		//boolean b1 = ((x++ == 3) && (y++ == 4));
		//boolean b1 = ((++x == 3) & (y++ == 4));
		boolean b1 = ((++x == 3) && (y++ == 4));
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println(b1);
	}
}