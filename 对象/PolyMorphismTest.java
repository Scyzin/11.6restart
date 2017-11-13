/*
	多态练习
*/
class Animal{
	public Animal(){}
	
	public void eat(){
		System.out.println("eat food");
	}
	
	public void sleep(){
		System.out.println("sleep well");
	}
}

class Cat extends Animal{
	public Cat(){}
	
	public void eat(){
		System.out.println("eat 猫粮");
	}
	
	public void sleep(){
		System.out.println("sleep 床");
	}
	
	public void playGame(){
		System.out.println("playGame");
	}
}

class Dog extends Animal{
	public Dog(){}
	
	public void eat(){
		System.out.println("eat 狗粮");
	}
	
	public void sleep(){
		System.out.println("sleep 狗窝");
	}
}

class PolyMorphismTest{
		public static void main(String[] args){
			/*正常调用
			Cat c = new Cat();
			c.eat();
			c.sleep();
			
			Dog d = new Dog();
			d.eat();
			d.sleep();
			*/
			//多态调用定义为猫
			Animal a = new Cat();
			a.eat();
			a.sleep();
			//a.playGame(); 调用不了playGame
			System.out.println("-----");
			
			//还原为猫
			Cat c =(Cat)a;
			c.eat();
			c.sleep();
			c.playGame();
			
			//错误的
			//Cat cc = new Animal();编译报错
			//Cat cc = (Dog)d;编译报错
			//Cat c = (Cat)d;编译不报错，运行报错
			
			
		}
}