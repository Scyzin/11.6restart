package com.czs_01;

/*
 * Object������ṹ��εĸ��࣬ÿ���඼ֱ�ӻ��ӵļ̳�Object
 * 
 * Objcet��ķ�����
 * 		public int hashcode():���ظö���Ĺ�ϣ��ֵ�����ݵ�ֵַ���������
 * 		
 * 		public final Class getClass()�����ش� Object ������ʱ��
 * 			Class���еķ�����public String getName()�� String ����ʽ���ش� Class ��������ʾ��ʵ��
 * 		
 * 		public String toString()
 * 				���ظö�����ַ�����ʾ��
 * 				������д����ķ���:return ����Ҫ���ַ�����
 * 			Ҳ����ͨ����ݼ����Զ�����toString 				
 * 			ֱ�����һ����������ƣ����ǵ���toString����
 * 
 * 		public boolean equals(Object obj)ָʾ����ĳ�������Ƿ���˶�����ȡ��� 
 * 			this - s1   obj -s2	
 * 			�������ͣ�����Ķ���ָ���ǵ�ַ��
 * 		��д��
 * 			һ�㶼�������Ƚ϶���ĳ�Ա�����Ƿ���ͬ��
 * 		���հ�alt + shift + s + h  ��дhashcode��equal
 * 
 * 		protected void finalize()
 * 			������������ȷ�������ڶԸö���ĸ�������ʱ���ɶ�����������������ô˷�����
 * 			������д finalize ������������ϵͳ��Դ��ִ����������� 
 *		protected Object clone()
 *			���������ش˶����һ������
 *		��ǽӿ�
 *		cloneable:����ʵ����cloneable�ӿڣ�ָʾobject.clone()�������ԺϷ��ضԸ���ʵ�������ֶθ��ơ�
 *		��¡�󣬸���ֵ��Ӱ��ԭ����ֵ��
 */
public class StudentDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s = new Student();
		System.out.println(s.hashCode());
		System.out.println(s.getClass().getName());
		
		System.out.println(s.toString());
		
		// getClass().getName() + '@' + Integer.toHexString(hashCode())
		Student s1 = new Student("����ʤ",22);
		Student s2 = new Student("����ʤ",22);
		System.out.println(s1.equals(s2));
		//��¡ѧ������
		Object obj = s.clone();
		Student s3 = (Student)obj;
		System.out.println(s.getAge() + s.getName());
		System.out.println(s3.getAge() + s3.getName());
	}
}
