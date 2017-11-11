/*
	构造方法：
			给对象的数据进行初始化。是用来构造对象的
			
			Student s = new Student();
	
	格式：
		方法名和类名相同；
		方法没有返回值类型，没void；
		没有具体return。
		
	注意：
		没给出构造方法，系统会自动提供一个无参构造方法
		给出了构造方法，系统将不再提供默认的无参构造方法
		最好自己给出无参构造方法
	
	给成员变量赋值有两种方式：
		setXxx()
		构造方法	
*/
class Student{
	private String name;
	private int age;
}
	public Student(){
		System.out.println("这是无参构造方法");
	}
	
	public Student(String name){
		System.out.println("这是带一个String类型的构造方法");
		this.name = name;
	}
	
	public Student(String name,int age) {
		System.out.println("这是一个带多个参数的构造方法");
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println(name+"---"+age);
	}
	
class ConstructDemo{
	public static void main(String[] args){
		Student s = new Student();
		s.show();
		System.out.println("------");
		
		Student s2 = new Student("林青霞");
		s2.show();
		System.out.println("-------------");
		
		Student s3 = new Student(27);
		s3.show();
		System.out.println("-------------");
	}
}