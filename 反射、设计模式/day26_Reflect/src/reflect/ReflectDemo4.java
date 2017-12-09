package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo4 {
	public static void main(String[] args)throws Exception {
		Class c = Class.forName("reflect.Person");
		
		//获得自己包括父亲所有公共方法
		 //Method[]methods = c.getMethods();
		//获取自己的所有方法
		/*Method[]methods = c.getDeclaredMethods();
		for(Method method:methods) {
			System.out.println(method);
		}*/
		
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		
		//获得单个方法并使用,后面两个参数，一个是方法名，另外一个是方法参数的clss类型
		Method m1 = c.getMethod("show",null );
		//obj.m1();错误  public Object invoke(Object obj , Object ... args)
		//返回值object类型，第一个参数表示对象是谁，第二个参数表示调用该方法的实际参数
		
		m1.invoke(obj);//等价于person对象的show方法
		
		System.out.println("------");
		Method m2 = c.getMethod("method", String.class);
		m2.invoke(obj, "陈遵胜");
		System.out.println("-----");
		
		Method m3 = c.getDeclaredMethod("getString", String.class,int.class);
		//返回值是object，你也可以通过 string 强转。
		Object obstring = m3.invoke(obj, "你好",120);
		System.out.println(obstring);
		
		Method m4 = c.getDeclaredMethod("function");
		m4.setAccessible(true);
		m4.invoke(obj );
		
		
	}
}
