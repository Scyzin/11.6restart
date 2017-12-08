package reflect;
/*
 * 反射：就是通过class文件对象，去使用该文件中的成员变量，构造方法，成员方法。
 * 
 * Person p = new Person();
 * p.使用
 * 
 * 要想这样使用，首先你必须得到class文件对象，其实也就是得到Class类的对象。
 * Class类：
 * 		成员变量	Field
 * 		构造方法	Constructor
 * 		成员方法	Method
 * 
 * 获取class文件对象的方式：
 * A:Object类的getClass()方法
 * B:数据类型的静态属性class
 * C:Class类中的静态方法
 * 		public static Class forName(String className)
 * 
 * 用谁？
 * 		推荐第一种
 * 		开发 ：第三种
 * 		第三种是一个字符串，而不是一个具体的类名。
 * 			就可以把这样的字符串配置到配置文件中。
 * 	
 */
public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		//方式1:
		Person p = new Person();
		Class c = p.getClass();//Class是一个类型，只有一个。

		Person p2 = new Person();
		Class c2 = p2.getClass();

		System.out.println(p == p2);// false
		System.out.println(c == c2);// true
		
		//方式2
		Class c3 = Person.class;
		System.out.println(c == c3);//true
		
		// 方式3
		// ClassNotFoundException	写全路径
		
		Class c4 = Class.forName("reflect.Person");
		System.out.println(c == c4);
	}
}
