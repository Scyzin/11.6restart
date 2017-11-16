/*
	��ϰ2
*/
abstract class Student{
	private int age;
	private String name;
	
	public Student(){}
	
	public Student(String name, int age){
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
	
	public abstract void study();
}

class BaStudent extends Student{
	public BaStudent(){}
	
	public BaStudent(String name, int age){
		super(name,age);
	}
	
	public void study(){
		System.out.println("����ѧsc");
	}
}

class JiStudent extends Student{
	public JiStudent(){}
	
	public JiStudent(String name, int age){
		super(name,age);
	}
	
	public void study(){
		System.out.println("����ѧse");
	}
}

class AbstractTest2{
	public static void main(String[] args){
		//ͨ���������
		Student a = new JiStudent();
		a.setAge(17);
		a.setName("���");
		System.out.println(a.getAge()+a.getName());
		a.study();
		System.out.println("-----");
		//ͨ�����췽����ֵ��
		a = new BaStudent("�㲻��",18);
		System.out.println(a.getAge()+a.getName());
		a.study();
	}
}