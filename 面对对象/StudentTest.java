/*
		成员变量：
			name，age
		构造方法：
			无参，带两个参
		成员方法：
			getXxx()/setXxx()
			show()：输出该类的所有成员变量值
			
	给成员变量赋值：
		A:setXxx()方法
		B:构造方法
		
	输出成员变量值的方式：
		A:通过getXxx()分别获取然后拼接
		B:通过调用show()方法搞定
*/
class Student {
	private String name;
	private int age;
	
	//构造方法
	public Student() {
	}
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//输出所有的成员变量值
	public void show() {
		System.out.println(name+"---"+age);
	}
}

class StudentTest {
	public static void main(String[] args) {
		//方式1给成员变量赋值
		//无参构造+setXxx()
		Student s1 = new Student();
		s1.setName("哈哈哈");
		s1.setAge(27);
		//输出值
		System.out.println(s1.getName()+"---"+s1.getAge());
		s1.show();
		System.out.println("----------------------------");
		
		//方式2给成员变量赋值 
		Student s2 = new Student("我是",30);
		System.out.println(s2.getName()+"---"+s2.getAge());
		s2.show();
	}
}