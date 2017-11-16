/*
	抽象类练习
*/
abstract class Animal{
	private int age;
	private String name;
	
	public Animal(){}
	
	public Animal(String name , int age){
		this.name = name;
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	//一个抽象方法
	public abstract void eat();
}

class Dog extends Animal{
	public Dog(){}
	
	public Dog(String name,int age) {
		super(name,age);
	}
	
	public void eat(){
		System.out.println("狗吃肉");
	}
}	
class Cat extends Animal{
	public Cat(){}
	
	
	
	public void eat(){
		System.out.println("猫吃什么");
	}
}

class AbstractTest{
	public static void main(String[] args){
		Dog d = new Dog();
		d.setAge(17);
		d.setName("heillo");
		System.out.println(d.getAge()+d.getName());
		d.eat();
		
		Dog d2 = new Dog("hello",17);
		System.out.println(d2.getAge()+d2.getName());
		System.out.println("-----");
		
		Animal a = new Dog();
		a.setName("旺财");
		a.setAge(3);
		System.out.println(a.getName()+"---"+a.getAge());
		a.eat();
		
		Animal a2 = new Dog("旺财",3);
		System.out.println(a2.getName()+"---"+a2.getAge());
		a2.eat();
		
	}
}
	