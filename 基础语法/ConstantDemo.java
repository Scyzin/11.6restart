/*
	常量：
		程序执行过程中，其值不发生改变的量
		
	分类：
		字面常量
		自定义常量
		
	字面值常量
		字符串常量		用双引号括起来的
			“Hello”,
		整数常量	所有的整数
			举例：1,2,3
		小数常量 	所有小数
			举例：1.1
		字符常量	用单引号括起来的
			举例：'A','B'
		布尔常量	
			true false
		空常量
			null
*/
class ConstantDemo{
	public static void main(String[] args){
		//字符串常量的输出
		System.out.println("Hello");
		//整数常量的
		System.out.println(9);
		//小数常量的
		System.out.println(100.1);
		//字符常量
		System.out.println('A');
		//这个是有问题的
		//System.out.println('ab');
		//布尔常量的输出
		System.out.println(true);
	}
}