package test1;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/*
 * 通过配置文件运行类中的方法
 * 
 * 		不需要改代码，只需要改配置文件。
 * 
 */
public class Test1 {
	public static void main(String[] args) throws IOException, Exception {
		
		/*	要求访问对象变化，这里也要不断变化。
		 * Student s = new Student();
		s.love();
		
		Teacher s1 = new Teacher();
		//私有的还访问不了
		*/
		Properties prop = new Properties();
		FileReader fr = new FileReader("class.txt");
		prop.load(fr);
		fr.close();
		
		String className = prop.getProperty("ClassName");
		String methodName = prop.getProperty("methodName");
		//反射
		Class c = Class.forName(className);
		
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		
		//调用方法，可以通过配置文件去访问私有方法
		Method m1 = c.getDeclaredMethod(methodName);
		m1.setAccessible(true);
		m1.invoke(obj);
		
	}
}
