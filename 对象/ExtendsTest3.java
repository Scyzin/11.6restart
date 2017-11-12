/*
	学生类是人类的一种：
		成员变量：姓名，年龄
		构造方法：无参
		方法：get set
*/
class Person{
	private int age;
	private String name;
	public Person(){
		
	}
	public Person(int age,String name){
		this.age =age;
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}
class Student extends Person{
	
}
class Teacher extends Person{
	public Teacher(){
		
	}
	public Teacher(String name,int age){
		super(name,age);
	}
}
class ExtendsTest3{
	public static void main(String[] args){
		Teacher t = new Teacher();
		t.setName("哈哈哈");
		t.setAge(27);
		System.out.println(t.getAge() + t.getName());
		
		Teacher t1 = new Teacher("你好",27);
		System.out.println(t1.getAge() + t1.getName());
	}
}