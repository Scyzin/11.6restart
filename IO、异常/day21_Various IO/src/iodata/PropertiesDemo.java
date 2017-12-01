package iodata;

import java.util.Properties;
import java.util.Set;

/*
 * Properties:���Լ����ࡣ��һ�����Ժ�IO������ʹ�õļ����ࡣ
 * Properties �ɱ��������л�����м��ء������б���ÿ���������Ӧֵ����һ���ַ�����
 * ��Hashtable�����࣬˵����һ��Map���ϡ�
 * 
 * ���⹦�ܣ�
 * public Object setProperty(String key,String value)�����Ԫ��
 * public String getProperty(String key):��ȡԪ��
 * public Set<String> stringPropertyNames():��ȡ���еļ��ļ���* 
 *  
 */
public class PropertiesDemo {
	public static void main(String[] args) {

		Properties prop = new Properties();
		Properties prop2 = new Properties();

		prop.put("111", "��");
		prop.put("2", "��");
		prop.put("3", "��");

		prop2.setProperty("111", "��");
		prop2.setProperty("2", "��");
		prop2.setProperty("3", "��");

		Set<Object> set = prop.keySet();
		for (Object key : set) {
			System.out.println(key + "-------" + prop.get(key));
		}

		Set<String> set2 = prop2.stringPropertyNames();
		for (String key2 : set2) {
			System.out.println(key2 + "------" + prop2.getProperty(key2));
		}
	}
}
