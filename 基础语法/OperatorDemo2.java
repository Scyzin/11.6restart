/*
	++,--运算符的使用
		作用：就是对变量进行自增或自减。
			常量不能用。
		单独使用：放前面后面都一样
		参与运算使用：
			放在操作前面，先自增或者自减，然后再参与运算；
			放在操作后面，先参与运算，后自增或自减
	+的运算：
		加法
		正号
		字符串连接符
*/
class OperatorDemo2{
	public static void main(String[] args){
		int x = 3;
		int y = 4;
		
		//字符串的拼接
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		//加加在后，值不变，运算完，值+1。
		x++;
		y--;
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		
		//参与运算使用
		int a = 3;
		int b = 4;
		
		int c = a++;
		int d = b--;
		//int c = ++a;
		//int d = --b;
		System.out.println("a:" + a);	//4	4
		System.out.println("b:" + b);	//3	3	
		System.out.println("c:" + c);	//3	4
		System.out.println("d:" + d);	//4	3
		
		System.out.println(3 + 4);//加法
		System.out.println(+4);//正号
		System.out.println('a' + 1);//加法，98
		System.out.println("Helo" + 'a' + 1);//字符串连接符	Heloa1
		System.out.println('a' + 1 + "Helo" );		//98Helo
	}
}
// a = 10; b = 11; c = 10;
// a = 9; b = 11; c = 9;
// a = 10; b =10; c = 9;
// a = 9; b = 10; c= 8;

// x = 6;y = 70