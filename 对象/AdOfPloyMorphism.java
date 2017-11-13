/*
	多态的好处：
		提高代码的维护性（继承保证）
		提高代码的扩展性（多态保证）
		一个动物类，各种动物继承至动物，方法覆盖，调用各动物的测试工具类；
		前三项是必备的，测试工具类可以不每次调用；
		
		减少工具类的调用
		
	多态的弊端：
		不能使用子类的特有功能
	
	多态的调用主要用在抽象类上。
				最常用在接口上。
				具体类基本没有。
		
*/
class Animal{
	public Animal(){
		
	}
	public void eat(){
		System.out.println("eat");
	}
	
	public void sleep(){
		System.out.println("sleep");
	}
}
class Dog extends Animal {
	public void eat(){
		System.out.println("狗吃肉");
	}
	
	public void sleep(){
		System.out.println("狗站着睡觉");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("猫吃鱼");
	}
	
	public void sleep() {
		System.out.println("猫趴着睡觉");
	}
}

class Pig extends Animal {
	public void eat() {
		System.out.println("猪吃白菜");
	}
	
	public void sleep() {
		System.out.println("猪侧着睡");
	}
}
class AnimalTool {
	private AnimalTool(){}

	public static void useAnimal(Animal a) {
		a.eat();
		a.sleep();
	}
	
}
class AdOfPloyMorphism{
	public static void main(String[] args) {
		
		Dog d = new Dog();
		Dog d2 = new Dog();   
		Dog d3 = new Dog();
		//AnimalTool.useDog(d);
		//AnimalTool.useDog(d2);
		//AnimalTool.useDog(d3);
		AnimalTool.useAnimal(d);
		AnimalTool.useAnimal(d2);
		AnimalTool.useAnimal(d3);
		System.out.println("--------------");

		}
}