/*
	final,最终的意思，可以修饰类、方法、变量
	
	final类不能被继承；
	final方法不能被覆盖；
	final变量是常量，变量不能被重新赋值
	
	final可以修饰局部变量。
		方法内部中，该变量不可以被改变；
		方法生命上， 
			基本类型：值不能发生改变
			引用类型：该类型的地址值不能改变，但是该内存储存的值可以改变的。
	final修饰变量时机:
		被final修饰的变量只能赋值一次
		在对象构造方法完毕前
*/
class Student{
	int age = 10; 
	final int num;
	{
		num =3;
	}
	public Student{
		//num = 4;构造代码块的先赋值了
	}
}
class FinalDemo{
	public static void main(String[] args){
		//基本类型
		int x = 10;
		x = 100;
		System.out.println(x);//100
		
		final int y = 10;
		//y = 10; y是常量无法为y赋值了
		System.out.println(y);//10
		System.out.println("------");
		
		//局部类型是引用类型
		Student s = new Student();
		System.out.println(s.age);//10
		s.age = 100;
		System.out.println(s.age);//100
		
		final Student ss = new Student();
		System.out.println(ss.age);//10
		ss.age = 100;
		System.out.println(ss.age);//100
		
		//无法为ss再创建空间
		//Student ss = new Student();
	}
}


