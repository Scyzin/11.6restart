/*
	选取很多人，都是中国人，国籍是一样的。
	每次创建空间，在堆内存中开辟相同的空间，浪费
	
	静态变量：使一个类的所有实例共享数据。用关键字static
	
	static特点(可以修饰成员变量和成员方法)：
		1.随类加载而加载,static void main。
		2.优先于对象存在；
		3.被类的所有对象共享。
			如果某个成员变量是被所有对象共享的，那他就应该定义为静态的。
		4.可以通过类名调用。本身也可以通过对象名调用。
			推荐使用类名调用。静态修饰的与类相关：类成员
			
	static关键字注意事项：
			1.静态方法中没有关键字
				解释：静态随类加载而加载，this随对象创建而存在
						静态比对象先存在。
			2.静态方法只能访问静态的成员变量和静态的成员方法
				(静态只能访问静态)
				
class Teacher {
	public int num = 10;
	public static int num2 = 20;
	
	public void show() {
		System.out.println(num); //隐含的告诉你访问的是成员变量
		System.out.println(this.num); //明确的告诉你访问的是成员变量
		System.out.println(num2);
		
		//function();
		//function2();
	}
	
	public static void method() {
		//无法从静态上下文中引用非静态 变量 num
		//System.out.println(num);
		System.out.println(num2);
		
		//无法从静态上下文中引用非静态 方法 function()
		//function();
		function2();
	}
}			
*/
class StaticExample {
	String name;
	int age ;
	int num =10;
	static int num2 = 100;
	//静态变量关键字 static
	static String country;
	
	public StaticExample(){}
	
	public StaticExample(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public StaticExample(String name,int age,String country) {
		this.name = name;
		this.age = age;
		this.country = country;
	}
	
	public void show() {
		System.out.println("姓名："+name+",年龄："+age+",国籍："+country);
	}
}

class StaticExampleTest {
	public static void main(String[] args) {
		StaticExample s =new StaticExample();
		System.out.println(StaticExample.num2);
		System.out.println(s.num2);
		
		StaticExample p1 = new StaticExample("你好",16,"中国");//国籍全为中国
		p1.show();
		
		StaticExample p2 = new StaticExample("幂",22);
		p2.show();
		
		StaticExample p3 = new StaticExample("姐",20);
		p3.show();
		
		p3.country = "美国";
		p3.show();//后面的国籍都改为了美国，共享一个数据
		
		p1.show();
		p2.show();
	}
}