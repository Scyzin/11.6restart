/*
	多态：某个事物，不同时刻变现出不同状态；
		 水（固液气）
	前提：	有继承关系
			要有方法覆盖，不然没意义!!
			要有父类引用子类：	父f = new 子();
	成员访问特点：
		成员变量：	编译和运行都看左边，即父类.
		构造方法：	创建子类对象时，访问父类的构造方法，对父类数据进行初始化。
		成员方法：	编译看左边 父类，运行看右边  子类
		静态修饰：编译看父类，运行看父类。
		
		成员方法：存在方法覆盖，所以多态运行看子类。
		
	这也是多态的弊端： 不能使用子类的特有功能	
		
		如何使用子类的特有功能：
			1.创建子类对象调用方法（但是太占用内存空间）
			2.把父类的引用强制转换为子类的引用（向下转型）
		
		对象间的转型：
			向上转型：Fu f = new Zi()
					从子到父，父类引用指向子类对象

			向下转型： Zi z = (Zi)f //要求f必须是能够转换为zi的。
					从父到子  父类引用转为子类对象
				容易出现类型转换异常，

*/
class Fu{
	public int num = 100;
	
	public void show(){
		System.out.println("show father");
	}
}

class Zi extends Fu{
	public int num = 1000;
	
	public int num2 = 200;
	
	public void show(){
		System.out.println("show zi");
	}
	
	public void method(){
		System.out.println("show method");
	}
}

class PolyMorphism{
	public static void main(String[] args){
		Fu s = new Zi();
		System.out.println(s.num);
		//System.out.println(s.num2);编译错误，父类里面没有num2
		
		s.show();
		//编译错误，父类里面没有method
		//s.method();
	}
}