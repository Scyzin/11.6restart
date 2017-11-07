/*
	需求：准备写java程序，输入HelloWorld在控制台
	
	分析：
		写一个程序，定义类
		数据能输出，程序可以独立运行，要有main方法
		要有输出语句
		
	实现：
		class 定义类
		main方法格式
		system.out.println
		
*/
//这是我的hello world 案例
class HelloWorld{
	//定义main方法，是程序的入口，被jvm调用
	public static void main(String[] args){
		//为了程序显示在控制台，用输出语句
		System.out.println("HelloWorld");
	}
}