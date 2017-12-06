package easyfactory;
/*
 * �򵥹���ģʽ������һ�������ฺ�𴴽�һЩ���ʵ��
 * 
 * �ŵ㣺�ͻ��˲��ø������Ĵ���
 * 
 * ȱ�㣺�����ฺ�����ж���Ĵ��������¶������ӣ����ߴ�����ʽ��ͬ����Ҫ
 * 		���ϵ��޸Ĺ����࣬�����ں��ڵ�ά����
 * 
 * ��ƹ���ģʽ�����󹤳��ฺ���崴������Ľӿڣ�
 * 				�������Ĵ��������ɼ̳г��󹤳��ľ�����ʵ�֡�
 * 
 * �ŵ㣺������µĶ������ӣ�ֻ��Ҫ����һ���������͹����༴�ɣ�����ά������
 * 		������չ�ԡ�
 * ȱ�㣺
 * 		�����д���룬���ӹ�������
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
