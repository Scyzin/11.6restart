package test1;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/*
 * ͨ�������ļ��������еķ���
 * 
 * 		����Ҫ�Ĵ��룬ֻ��Ҫ�������ļ���
 * 
 */
public class Test1 {
	public static void main(String[] args) throws IOException, Exception {
		
		/*	Ҫ����ʶ���仯������ҲҪ���ϱ仯��
		 * Student s = new Student();
		s.love();
		
		Teacher s1 = new Teacher();
		//˽�еĻ����ʲ���
		*/
		Properties prop = new Properties();
		FileReader fr = new FileReader("class.txt");
		prop.load(fr);
		fr.close();
		
		String className = prop.getProperty("ClassName");
		String methodName = prop.getProperty("methodName");
		//����
		Class c = Class.forName(className);
		
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		
		//���÷���������ͨ�������ļ�ȥ����˽�з���
		Method m1 = c.getDeclaredMethod(methodName);
		m1.setAccessible(true);
		m1.invoke(obj);
		
	}
}
