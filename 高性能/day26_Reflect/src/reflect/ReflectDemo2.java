package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * 通过反射获取构造方法并使用。
 * 		
 * 		可以不加载包。
 * 		通过反射去获取该构造方法去使用：
 * 			public Person(String name, int age, String address)
 * 
 * 		访问无参，带参，以及私有。
 * 
 * 		Person p = new Person("称",27,"nihao ")；
 * 		System.out.println(p);
 */
public class ReflectDemo2 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// 获取字节码文件对象
		Class c = Class.forName("reflect.Person");

		// 获取构造方法
		// public Constructor[] getConstructors():所有公共构造方法
		// public Constructor[] getDeclaredConstructors():所有构造方法
		//Constructor[] cons = c.getDeclaredConstructors();
		// for (Constructor con : cons) {
		 //System.out.println(con);
		// }

		// 获取单个构造方法
		// public Constructor<T> getConstructor(Class<?>... parameterTypes)
		// 参数表示的是：你要获取的构造方法的构造参数个数及数据类型的class字节码文件对象
		Constructor con = c.getConstructor();// 返回的是构造方法对象，通过构造器去创造的

		 
		// public T newInstance(Object... initargs)
		// 使用此 Constructor 对象表示的构造方法来创建该构造方法的
		//声明类的新实例，并用指定的初始化参数初始化该实例。
		Object obj = con.newInstance();
		System.out.println(obj);
		
		//上面的操作等价于这个
		Person p = new Person();
		System.out.println(p);
		 
		// Person p = (Person)obj;	证明obj其实就是对象p
		// p.show();
		
		//d带参
		Class b = Class.forName("reflect.Person");
		Constructor con1 = b.getConstructor(String.class,int.class,String.class);
		Object obj1 = con1.newInstance("称",20,"北京");
		System.out.println(obj1);
		
		//访问私有
		Class d = Class.forName("reflect.Person");
		Constructor con2 = d.getDeclaredConstructor(String.class);
		
		//暴力访问
		con2.setAccessible(true);// 值为true则指示反射的对象在使用时应该取消Java语言访问检查。
		Object obj2 = con2.newInstance("你好啊");
		
		//System.out.println(obj2);
		
		
	}
}

