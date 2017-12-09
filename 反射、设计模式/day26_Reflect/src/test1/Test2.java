package test1;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * 通过反射，越过泛型，添加东西
 * 
 */
public class Test2 {
	public static void main(String[] args) throws Exception {
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("你好");
		
		Class c = array.getClass();
		Method m = c.getMethod("add", Object.class);
		m.invoke(array, 18);
		m.invoke(array, 28);
		
		System.out.println(array);
		
	}
}
