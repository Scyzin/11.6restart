package easyfactory;
/*
 * 简单工厂模式：定义一个工程类负责创建一些类的实例
 * 
 * 优点：客户端不用负责对象的创建
 * 
 * 缺点：工厂类负责所有对象的创建，有新对象增加，或者创建方式不同，就要
 * 		不断的修改工厂类，不利于后期的维护。
 * 
 * 设计工厂模式：抽象工厂类负责定义创建对象的接口，
 * 				具体对象的创建工作由继承抽象工厂的具体类实现。
 * 
 * 优点：如果有新的对象增加，只需要增加一个具体的类和工厂类即可，后期维护容易
 * 		增加扩展性。
 * 缺点：
 * 		额外编写代码，增加工作量。
 * 
 */
public class AnimalDemo {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		Cat c = new Cat();
		c.eat();
		System.out.println("-------");
		
		Dog dd= AnimalFactory.creatDog();
		Cat cc = AnimalFactory.creatCat();
		dd.eat();
		cc.eat();
		System.out.println("-------");
		
		Animal ddd = AnimalFactory.createAnimal("dog");
		ddd.eat();
	}
}
