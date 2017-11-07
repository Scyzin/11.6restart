/*
	运算符：
		对常量和变量进行操作的符号
	分类：算数、赋值、比较、逻辑、位、三目
	
*/
class OperatorDemo{
	public static void main(String[] args){
		//定义变量
		int x = 3;
		int y = 4;
		System.out.println("x+y");
		System.out.println("x-y");
		System.out.println("x*y");
		System.out.println("x/y");//整数相除只能得到整数
		//小数，将其中一个数据变为浮点数类型
		System.out.println("x*1.0/y");
		//%的应用，求余。
		System.out.println("x%y");
	}
}