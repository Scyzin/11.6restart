/*
	��̬�ĺô���
		��ߴ����ά���ԣ��̳б�֤��
		��ߴ������չ�ԣ���̬��֤��
		һ�������࣬���ֶ���̳�������������ǣ����ø�����Ĳ��Թ����ࣻ
		ǰ�����Ǳر��ģ����Թ�������Բ�ÿ�ε��ã�
		
		���ٹ�����ĵ���
		
	��̬�ı׶ˣ�
		����ʹ����������й���
	
	��̬�ĵ�����Ҫ���ڳ������ϡ�
				����ڽӿ��ϡ�
				���������û�С�
		
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
		System.out.println("������");
	}
	
	public void sleep(){
		System.out.println("��վ��˯��");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("è����");
	}
	
	public void sleep() {
		System.out.println("èſ��˯��");
	}
}

class Pig extends Animal {
	public void eat() {
		System.out.println("��԰ײ�");
	}
	
	public void sleep() {
		System.out.println("�����˯");
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