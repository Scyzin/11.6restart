/*
	ѡȡ�ܶ��ˣ������й��ˣ�������һ���ġ�
	ÿ�δ����ռ䣬�ڶ��ڴ��п�����ͬ�Ŀռ䣬�˷�
	
	��̬������ʹһ���������ʵ���������ݡ��ùؼ���static
	
	static�ص�(�������γ�Ա�����ͳ�Ա����)��
		1.������ض�����,static void main��
		2.�����ڶ�����ڣ�
		3.��������ж�����
			���ĳ����Ա�����Ǳ����ж�����ģ�������Ӧ�ö���Ϊ��̬�ġ�
		4.����ͨ���������á�����Ҳ����ͨ�����������á�
			�Ƽ�ʹ���������á���̬���ε�������أ����Ա
			
	static�ؼ���ע�����
			1.��̬������û�йؼ���
				���ͣ���̬������ض����أ�this����󴴽�������
						��̬�ȶ����ȴ��ڡ�
			2.��̬����ֻ�ܷ��ʾ�̬�ĳ�Ա�����;�̬�ĳ�Ա����
				(��ֻ̬�ܷ��ʾ�̬)
				
class Teacher {
	public int num = 10;
	public static int num2 = 20;
	
	public void show() {
		System.out.println(num); //�����ĸ�������ʵ��ǳ�Ա����
		System.out.println(this.num); //��ȷ�ĸ�������ʵ��ǳ�Ա����
		System.out.println(num2);
		
		//function();
		//function2();
	}
	
	public static void method() {
		//�޷��Ӿ�̬�����������÷Ǿ�̬ ���� num
		//System.out.println(num);
		System.out.println(num2);
		
		//�޷��Ӿ�̬�����������÷Ǿ�̬ ���� function()
		//function();
		function2();
	}
}			
*/
class StaticExample {
	String name;
	int age ;
	int num =10;
	static int num2 = 100;
	//��̬�����ؼ��� static
	static String country;
	
	public StaticExample(){}
	
	public StaticExample(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public StaticExample(String name,int age,String country) {
		this.name = name;
		this.age = age;
		this.country = country;
	}
	
	public void show() {
		System.out.println("������"+name+",���䣺"+age+",������"+country);
	}
}

class StaticExampleTest {
	public static void main(String[] args) {
		StaticExample s =new StaticExample();
		System.out.println(StaticExample.num2);
		System.out.println(s.num2);
		
		StaticExample p1 = new StaticExample("���",16,"�й�");//����ȫΪ�й�
		p1.show();
		
		StaticExample p2 = new StaticExample("��",22);
		p2.show();
		
		StaticExample p3 = new StaticExample("��",20);
		p3.show();
		
		p3.country = "����";
		p3.show();//����Ĺ�������Ϊ������������һ������
		
		p1.show();
		p2.show();
	}
}