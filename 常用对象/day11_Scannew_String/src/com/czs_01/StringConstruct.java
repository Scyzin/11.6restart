package com.czs_01;

/*
 * 字符串：字符数组
 * 		'abc'字符串字面值也可以看作上字符串。
 * 		是常量，一旦被赋值，就不能改变。
 * 		构造方法:
 * 
 * 		public String()：无参构造
		public String(byte[] bytes)把字节数组转换为字符串		
		public String(byte[] bytes,int offset,int length)将字节数组的一部分转化为字符串
		public String(char[] value)将字符数组转化为字符串
		public String(char[] value,int offset,int count)
		public String(String original)将字符常量转换为字符串
	方法：	
		public int length()返回此字符串的长度。	
 */
public class StringConstruct {
	public static void main(String[] args) {
		//字符串字面值也可以转换为字符串
		String s = "abc";
		System.out.println("s:"+s+",s.length():"+s.length());
		System.out.println("-------");
		// 无参构造
		String s1 = new String();
		System.out.println("s1:" + s1 + ",s1.length():" + s1.length());
		System.out.println("-------");
		// 将字节数组转化为字符串
		byte[] bys = { 97, 98, 99, 100 };
		String s2 = new String(bys);
		System.out.println("s2:" + s2 + ",s2.length():" + s2.length());
		System.out.println("-------");
		// 将字节数组的一部分转化为字符串
		String s3 = new String(bys, 1, 3);
		System.out.println("s3:" + s3 + ",s3.length():" + s3.length());
		System.out.println("-------");
		// 将字符串数组转化为字符串
		char[] chars = { 'a', 'b', 'c', 'd' };
		String s4 = new String(chars);
		System.out.println("s4:" + s4 + ",s4.length():" + s4.length());
		System.out.println("-------");
		//将字符串的一部分转换为字符串
		String s5 = new String(chars,2,1);
		System.out.println("s5:"+s5+",s5.length():"+s5.length());
		System.out.println("-------");
	}
}
