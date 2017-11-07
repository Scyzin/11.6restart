/*
	赋值运算符：
		=右边的数据值赋给左边
		扩展的运算符:+=,-=,*=,/=
		将左边和右边做运算，然后赋值给左边
		扩展的数值运算符隐含了一个强制类型转换
		//s += 1; s = (s的数据类型) + 1;
*/
class	OperatorDemo3{
	public static void main(String[] args){
		
		int x = 10;
		//其他用法
		int a,b;
		a = b =10;
		System.out.println(a);
		System.out.println(a);
		
		int y = 10;
		int y1,y2,y3,y4;
		y1=y2=y3=y4=10;
		y1 += 20;//y=30
		y2 -= 20;//y=-10
		y3 *= 20;//y=200
		y4 /= 20;//y=0
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(y3);
		System.out.println(y4);
		
		//short s = 1; s = s + 1;可能损失精度。有问题
		
		//short s = 1 ; s += 1;
		//第二个没有问题。扩展的数值运算符隐含了一个强制类型转换
		//s += 1; s = (s的数据类型) + 1;
}
}
