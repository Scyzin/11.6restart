package com.czs_01;

/*
 * Object类是类结构层次的根类，每个类都直接或间接的继承Object
 * 
 * Objcet类的方法：
 * 		public int hashcode():返回该对象的哈希码值。根据地址值换算出来的
 * 		
 * 		public final Class getClass()：返回此 Object 的运行时类
 * 			Class类中的方法：public String getName()以 String 的形式返回此 Class 对象所表示的实体
 * 		
 * 		public String toString()
 * 				返回该对象的字符串表示。
 * 				建议重写该类的方法:return 你想要的字符串。
 * 			也可以通过快捷键，自动生成toString 				
 * 			直接输出一个对象的名称，就是调用toString方法
 * 
 * 		public boolean equals(Object obj)指示其他某个对象是否与此对象“相等”。 
 * 			this - s1   obj -s2	
 * 			引用类型：这里的对象指的是地址。
 * 		重写？
 * 			一般都是用来比较对象的成员变量是否相同。
 * 		最终版alt + shift + s + h  重写hashcode和equal
 * 
 * 		protected void finalize()
 * 			当垃圾回收器确定不存在对该对象的更多引用时，由对象的垃圾回收器调用此方法。
 * 			子类重写 finalize 方法，以配置系统资源或执行其他清除。 
 *		protected Object clone()
 *			创建并返回此对象的一个副本
 *		标记接口
 *		cloneable:此类实现了cloneable接口，指示object.clone()方法可以合法地对该类实例进行字段复制。
 *		克隆后，更改值不影响原来的值。
 */
public class StudentDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s = new Student();
		System.out.println(s.hashCode());
		System.out.println(s.getClass().getName());
		
		System.out.println(s.toString());
		
		// getClass().getName() + '@' + Integer.toHexString(hashCode())
		Student s1 = new Student("陈遵胜",22);
		Student s2 = new Student("陈遵胜",22);
		System.out.println(s1.equals(s2));
		//克隆学生对象
		Object obj = s.clone();
		Student s3 = (Student)obj;
		System.out.println(s.getAge() + s.getName());
		System.out.println(s3.getAge() + s3.getName());
	}
}
