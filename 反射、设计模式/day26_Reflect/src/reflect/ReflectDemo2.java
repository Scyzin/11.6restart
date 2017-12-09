package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * ͨ�������ȡ���췽����ʹ�á�
 * 		
 * 		���Բ����ذ���
 * 		ͨ������ȥ��ȡ�ù��췽��ȥʹ�ã�
 * 			public Person(String name, int age, String address)
 * 
 * 		�����޲Σ����Σ��Լ�˽�С�
 * 
 * 		Person p = new Person("��",27,"nihao ")��
 * 		System.out.println(p);
 */
public class ReflectDemo2 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// ��ȡ�ֽ����ļ�����
		Class c = Class.forName("reflect.Person");

		// ��ȡ���췽��
		// public Constructor[] getConstructors():���й������췽��
		// public Constructor[] getDeclaredConstructors():���й��췽��
		//Constructor[] cons = c.getDeclaredConstructors();
		// for (Constructor con : cons) {
		 //System.out.println(con);
		// }

		// ��ȡ�������췽��
		// public Constructor<T> getConstructor(Class<?>... parameterTypes)
		// ������ʾ���ǣ���Ҫ��ȡ�Ĺ��췽���Ĺ�������������������͵�class�ֽ����ļ�����
		Constructor con = c.getConstructor();// ���ص��ǹ��췽������ͨ��������ȥ�����

		 
		// public T newInstance(Object... initargs)
		// ʹ�ô� Constructor �����ʾ�Ĺ��췽���������ù��췽����
		//���������ʵ��������ָ���ĳ�ʼ��������ʼ����ʵ����
		Object obj = con.newInstance();
		System.out.println(obj);
		
		//����Ĳ����ȼ������
		Person p = new Person();
		System.out.println(p);
		 
		// Person p = (Person)obj;	֤��obj��ʵ���Ƕ���p
		// p.show();
		
		//d����
		Class b = Class.forName("reflect.Person");
		Constructor con1 = b.getConstructor(String.class,int.class,String.class);
		Object obj1 = con1.newInstance("��",20,"����");
		System.out.println(obj1);
		
		//����˽��
		Class d = Class.forName("reflect.Person");
		Constructor con2 = d.getDeclaredConstructor(String.class);
		
		//��������
		con2.setAccessible(true);// ֵΪtrue��ָʾ����Ķ�����ʹ��ʱӦ��ȡ��Java���Է��ʼ�顣
		Object obj2 = con2.newInstance("��ð�");
		
		//System.out.println(obj2);
		
		
	}
}

