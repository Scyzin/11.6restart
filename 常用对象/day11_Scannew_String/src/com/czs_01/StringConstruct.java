package com.czs_01;

/*
 * �ַ������ַ�����
 * 		'abc'�ַ�������ֵҲ���Կ������ַ�����
 * 		�ǳ�����һ������ֵ���Ͳ��ܸı䡣
 * 		���췽��:
 * 
 * 		public String()���޲ι���
		public String(byte[] bytes)���ֽ�����ת��Ϊ�ַ���		
		public String(byte[] bytes,int offset,int length)���ֽ������һ����ת��Ϊ�ַ���
		public String(char[] value)���ַ�����ת��Ϊ�ַ���
		public String(char[] value,int offset,int count)
		public String(String original)���ַ�����ת��Ϊ�ַ���
	������	
		public int length()���ش��ַ����ĳ��ȡ�	
 */
public class StringConstruct {
	public static void main(String[] args) {
		//�ַ�������ֵҲ����ת��Ϊ�ַ���
		String s = "abc";
		System.out.println("s:"+s+",s.length():"+s.length());
		System.out.println("-------");
		// �޲ι���
		String s1 = new String();
		System.out.println("s1:" + s1 + ",s1.length():" + s1.length());
		System.out.println("-------");
		// ���ֽ�����ת��Ϊ�ַ���
		byte[] bys = { 97, 98, 99, 100 };
		String s2 = new String(bys);
		System.out.println("s2:" + s2 + ",s2.length():" + s2.length());
		System.out.println("-------");
		// ���ֽ������һ����ת��Ϊ�ַ���
		String s3 = new String(bys, 1, 3);
		System.out.println("s3:" + s3 + ",s3.length():" + s3.length());
		System.out.println("-------");
		// ���ַ�������ת��Ϊ�ַ���
		char[] chars = { 'a', 'b', 'c', 'd' };
		String s4 = new String(chars);
		System.out.println("s4:" + s4 + ",s4.length():" + s4.length());
		System.out.println("-------");
		//���ַ�����һ����ת��Ϊ�ַ���
		String s5 = new String(chars,2,1);
		System.out.println("s5:"+s5+",s5.length():"+s5.length());
		System.out.println("-------");
	}
}
