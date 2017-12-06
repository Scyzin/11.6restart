package solo;
/*
 *单例模式：	确保类中只有一个对象，实例必须自动创建，并且对外提供。
 *			恶汉：类一加载就创建对象
 *			懒汉：用的时候，采取创建对象。
 *
 *如何实现？
 *			构造方法私有；成员位置自己创建一个对象；通过一个公共的方法提供访问。
 * 
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student s = Student.getStudent();
		Student s1= Student.getStudent();
		System.out.println(s1==s);
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		Teacher t1 = Teacher.getTeacher();
		//Teacher t2 = Teacher.getTeacher();
		//System.out.println(t2==t1);
		System.out.println(t1);
	}
}
