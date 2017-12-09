package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo4 {
	public static void main(String[] args)throws Exception {
		Class c = Class.forName("reflect.Person");
		
		//����Լ������������й�������
		 //Method[]methods = c.getMethods();
		//��ȡ�Լ������з���
		/*Method[]methods = c.getDeclaredMethods();
		for(Method method:methods) {
			System.out.println(method);
		}*/
		
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		
		//��õ���������ʹ��,��������������һ���Ƿ�����������һ���Ƿ���������clss����
		Method m1 = c.getMethod("show",null );
		//obj.m1();����  public Object invoke(Object obj , Object ... args)
		//����ֵobject���ͣ���һ��������ʾ������˭���ڶ���������ʾ���ø÷�����ʵ�ʲ���
		
		m1.invoke(obj);//�ȼ���person�����show����
		
		System.out.println("------");
		Method m2 = c.getMethod("method", String.class);
		m2.invoke(obj, "����ʤ");
		System.out.println("-----");
		
		Method m3 = c.getDeclaredMethod("getString", String.class,int.class);
		//����ֵ��object����Ҳ����ͨ�� string ǿת��
		Object obstring = m3.invoke(obj, "���",120);
		System.out.println(obstring);
		
		Method m4 = c.getDeclaredMethod("function");
		m4.setAccessible(true);
		m4.invoke(obj );
		
		
	}
}
