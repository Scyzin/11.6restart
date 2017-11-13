/*
		抽象类的成员特点：
			成员变量：可以是变量，也可以是常量
			构造方法： 
					用于子类访问父类数据时的初始化。
			成员方法：可以是抽象的，也可以是非抽象的
			
			方法特点：
				抽象方法，  强制要求子类去覆盖。
				非抽象方法	子类继承 提高代码复用性
		
		抽象类的问题：
			abstract与 private 冲突，与final冲突，static 冲突、无意义。
			
*/

abstract class Animal{
	public int num = 10;
	
	public Animal(){}
	
	public Animal(String name,int age){}
	
	public abstract void show();
	
	public void method(){
		System.out.println("method");
	}
}

class Dog extends Animal{
	public void show(){
		System.out.println("show dog ");
	}
}

class AbstractDemo2{
	public static void main(String[] args){
		Animal a = new Dog();
		a.num = 100;
		System.out.println(a.num);
		a.show();
		a.method();
	}
}
