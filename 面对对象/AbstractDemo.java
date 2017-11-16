/*
	java中没有方法体的方法应该定义为抽象方法。
	类中如果有抽象方法，该类必须定义为抽象类。
	
	抽象类的特点：
		格式：abstract
		抽象类中不一定有抽象方法，但有抽象方法的类必须定义为抽象类
		抽象类不能实例化。有构造方法，但不能实例化。
				作用是用于子类访问父类数据的初始化
		抽象的子类：
			如果不想重写抽象方法，该子类是一个抽象类
			重写所有的抽象方法，子类就变成了一个具体的类
			
			抽象类可以实例化是靠具体的子类实现的，通过多态。（要有方法覆盖 ）	
*/

abstract class Animal{
	
	//public static void eat(){};//空方法体，轴向方法不能有主体
	public abstract void eat();
	
	public Animal(){}
}

class Cat extends Animal{
	public void eat(){
		System.out.println("猫吃鱼");
	}
 }
 
class AbstractDemo{
	public static void main(String[] args){
		Animal a = new Cat();
		a.eat();
	}
}