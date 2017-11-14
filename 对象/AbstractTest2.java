/*
	练习2
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
		System.out.println("基础学sc");
	}
}

class JiStudent extends Student{
	public JiStudent(){}
	
	public JiStudent(String name, int age){
		super(name,age);
	}
	
	public void study(){
		System.out.println("基础学se");
	}
}

class AbstractTest2{
	public static void main(String[] args){
		//通过子类调用
		Student a = new JiStudent();
		a.setAge(17);
		a.setName("你好");
		System.out.println(a.getAge()+a.getName());
		a.study();
		System.out.println("-----");
		//通过构造方法赋值，
		a = new BaStudent("你不好",18);
		System.out.println(a.getAge()+a.getName());
		a.study();
	}
}