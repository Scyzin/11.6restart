package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*
 * public Field[] getDeclaredFields()
                          throws SecurityException
 * 
 */
public class ReflectDemo3 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("reflect.Person");
		
		//Field[] fields = c.getFields();获取所有公共变量.
		
		/*获取所有成员变量
		 * Field[] fields = c.getDeclaredFields();
		for(Field field : fields){
			System.out.println(field);
		}*/
		
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		System.out.println(obj);
		
		//getField,getDeclaredField 获取单个成员变量
		Field addressfield = c.getDeclaredField("address");
		//public void set(Object obj,Object value)   
		//将指定对象变量上此 Field 对象表示的字段设置为指定的新值。
		addressfield.set(obj, "北京");//给obj对象的addressField字段值设置为北京
		System.out.println(obj);
		
		Field addressfield2 = c.getDeclaredField("name");
		//私有的，访问异常
		addressfield2.setAccessible(true);
		addressfield2.set(obj, "陈遵胜");
		System.out.println(obj);
		
		Field agefield = c.getDeclaredField("age");
		agefield.setAccessible(true);
		agefield.set(obj, 18);
		System.out.println(obj);
	}
}
