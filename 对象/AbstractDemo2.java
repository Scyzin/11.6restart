/*
		������ĳ�Ա�ص㣺
			��Ա�����������Ǳ�����Ҳ�����ǳ���
			���췽���� 
					����������ʸ�������ʱ�ĳ�ʼ����
			��Ա�����������ǳ���ģ�Ҳ�����Ƿǳ����
			
			�����ص㣺
				���󷽷���  ǿ��Ҫ������ȥ���ǡ�
				�ǳ��󷽷�	����̳� ��ߴ��븴����
		
		����������⣺
			abstract�� private ��ͻ����final��ͻ��static ��ͻ�������塣
			
*/

abstract class Animal{
	public int num = 10;
	
	public Animal(){}
	
	public Animal(String name,int age){}
	
	public abstract void show();
	
	public void method(){
		System.out.println("method");
	}
}

class Dog extends Animal{
	public void show(){
		System.out.println("show dog ");
	}
}

class AbstractDemo2{
	public static void main(String[] args){
		Animal a = new Dog();
		a.num = 100;
		System.out.println(a.num);
		a.show();
		a.method();
	}
}
