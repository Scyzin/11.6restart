/*
	������ӽӿ���ϰ
	
	�������Ӿ��嵽����
	ʵ�֣�
		�ӳ��󵽾���
		
	ʹ�ã�
		ʹ�þ�����
*/

abstract class Animal{
	private int age;
	
	private String name;
	
	public Animal(){}
	
	public Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getName(){
		return name;
	}
	public abstract void eat();
}

class Cat extends Animal{
	public Cat(){}
	
	public Cat(String name,int age){
		super(name,age);
	}
	
	public void eat(){
		System.out.println("��è��");
	}
}

class Dog extends Animal{
	public Dog(){}
	
	public Dog(String name,int age){
		super(name,age);
	}
	
	public void eat(){
		System.out.println("�Թ���");
	}
}

interface AnimalTrain{
	public abstract void jump();
}

class JumpCat extends Cat implements  AnimalTrain{
	public JumpCat(){}
	
	public void jump(){
		System.out.println("è��������");
	}
	public JumpCat(String name,int age) {
		super(name,age);
	}
	
}

class InterFaceTest{
	public static void main(String[] args){
		JumpCat a = new JumpCat("����",20);
		System.out.println(a.getAge() + a.getName());
		System.out.println("-----------------");
		a.eat();
		a.jump();
	}
}