/*
	��̬��ϰ
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
		System.out.println("eat è��");
	}
	
	public void sleep(){
		System.out.println("sleep ��");
	}
	
	public void playGame(){
		System.out.println("playGame");
	}
}

class Dog extends Animal{
	public Dog(){}
	
	public void eat(){
		System.out.println("eat ����");
	}
	
	public void sleep(){
		System.out.println("sleep ����");
	}
}

class PolyMorphismTest{
		public static void main(String[] args){
			/*��������
			Cat c = new Cat();
			c.eat();
			c.sleep();
			
			Dog d = new Dog();
			d.eat();
			d.sleep();
			*/
			//��̬���ö���Ϊè
			Animal a = new Cat();
			a.eat();
			a.sleep();
			//a.playGame(); ���ò���playGame
			System.out.println("-----");
			
			//��ԭΪè
			Cat c =(Cat)a;
			c.eat();
			c.sleep();
			c.playGame();
			
			//�����
			//Cat cc = new Animal();���뱨��
			//Cat cc = (Dog)d;���뱨��
			//Cat c = (Cat)d;���벻�������б���
			
			
		}
}