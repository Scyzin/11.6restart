/*
	java��û�з�����ķ���Ӧ�ö���Ϊ���󷽷���
	��������г��󷽷���������붨��Ϊ�����ࡣ
	
	��������ص㣺
		��ʽ��abstract
		�������в�һ���г��󷽷������г��󷽷�������붨��Ϊ������
		�����಻��ʵ�������й��췽����������ʵ������
				����������������ʸ������ݵĳ�ʼ��
		��������ࣺ
			���������д���󷽷�����������һ��������
			��д���еĳ��󷽷�������ͱ����һ���������
			
			���������ʵ�����ǿ����������ʵ�ֵģ�ͨ����̬����Ҫ�з������� ��	
*/

abstract class Animal{
	
	//public static void eat(){};//�շ����壬���򷽷�����������
	public abstract void eat();
	
	public Animal(){}
}

class Cat extends Animal{
	public void eat(){
		System.out.println("è����");
	}
 }
 
class AbstractDemo{
	public static void main(String[] args){
		Animal a = new Cat();
		a.eat();
	}
}