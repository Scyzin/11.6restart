package test1;

import java.lang.reflect.Field;

public class Tool {
	public void setProperty(Object obj, String propertyName, Object value) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		Class c =obj.getClass();
		Field field = c.getDeclaredField(propertyName);
		field.setAccessible(true);
		field.set(obj, value);
	}
		
}
