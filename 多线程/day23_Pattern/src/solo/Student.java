package solo;

public class Student {
	private Student() {
		
	}
	//静态方法只能访问静态成员变量
	private static Student s = new Student();
	
	public static Student getStudent() {
		return s ;
	}
	
}
