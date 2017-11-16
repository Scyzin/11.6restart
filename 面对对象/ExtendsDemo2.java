/*
	什么时候考虑继承？
		谁是什么的一种？B是A的一种或者A是B的一种。
		
	类的组成：
			成员变量
			构造方法
			成员方法
	继承中成员变量的关系： 
		A:子类中的成员变量和父类中的成员变量名称不一样，。
		B:子类中的成员变量和父类中的成员变量名称一样，
			在子类方法中访问一个变量的查找顺序：
				a:在子类方法的局部范围找，有就使用
				b:在子类的成员范围找，有就使用
				c:在父类的成员范围找，有就使用
				d:如果还找不到，就报错。
		this 和 super的区别：
				this代表本类的引用；
				super代表父类存储空间的标识；(可以调用父类的成员变量、构造方法、方法)
				应用场景与this相同。
				调用成员变量：super.成员变量
				调用构造方法：super(构造方法)
				调用方法：super.成员方法。
				
		子类中所有的构造方法都会默认访问父类中空参数的构造方法。
			子类会继承父类中的数据，可能还会使用父类的数据。
			所以，子类初始化之前，一定要先完成父类数据的初始化。
			每一个构造方法的第一条语句默认都是：super();
			
		如何父类中没有构造方法，该怎么办呢?		会报错。
			子类通过super去显示调用父类其他的带参的构造方法
			子类通过this去调用本类的其他构造方法
			本类其他构造也必须首先访问了父类构造
		一定要注意：
				super(…)或者this(….)必须出现在第一条语句山
				否则，就会有父类数据的多次初始化	
				
		继承中成员方法的关系:
		A:子类中的方法和父类中的方法声明不一样，
		B:子类中的方法和父类中的方法声明一样，
			通过子类对象调用方法：
				a:先找子类中，看有没有这个方法，有就使用
				b:再看父类中，有没有这个方法，有就使用
				c:如果没有就报错。			

*/

class Father{
	public int num3 =10;//再再找这
	public void method(){//不会找到这，除非用super
		int num = 20;
		System.out.println("method 父类");
	}
	public Father(){
		System.out.println("这是父类的无参构造方法");
	}
	public Father(String name){
		System.out.println("这是父类的带参构造方法");
	}
}
class Son extends Father{
	public int num2 = 20;//再找这
	
	public void method(){
	
		System.out.println("method 子类");
	}
	public void show() {//先找这
		int num = 40;
		System.out.println(num);
		System.out.println(this.num2);
		// 找不到符号
		System.out.println(super.num3);
	}
	public Son(){
		super();//默认有这句的
		System.out.println("这是子类的无参构造方法");
	}
	public Son(String name){
		System.out.println("这是子类的带参构造方法");
	}
}
class ExtendsDemo2{
	public static void main(String[] args){
		Son s = new Son();
		s.show();
		s.method();
		System.out.println("-----");
		Son s2 = new Son("你好");
		
	}
}