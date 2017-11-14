/*
	类与类：继承，不能多继承，可以多层继承
	类与接口:实现关系，可以边继承边同时实现多个接口
	接口与接口：继承关系，可以单继承，也可以多继承
	
	抽象类和接口的区别：
	A:成员区别
		抽象类：
			成员变量：可以变量，也可以常量
			构造方法：有
			成员方法：可以抽象，也可以非抽象
		接口：
			成员变量：只可以常量
			成员方法：只可以抽象
*/
interface Father{
	public abstract void show();
}

interface Mother{
	public abstract void show2();
}

interface Sister extends Father,Mother{
	
}

class Son extends Object implements Father,Mother{
	public void show(){
		System.out.println("show son");
	}
	
	public void show2(){
		System.out.println("show2 son");
	}
}

class ApiDemo3{
	public static void main(String[] args){
		Father f = new Son();
		f.show();
		
		Mother m = new Son();
		m.show2();
	}
}