package com.czs_01;
/*
 *String���ת�����ܣ�
 *
 *byte[] getBytes()
 *char[] toCharArray()
 *static String valueOf(char[] chs)
 *static String valueOf(int i)
 *		string���valueOf ���԰��������͵�����ת��Ϊ�ַ���
 *String toLowerCase()
 *String toUpperCase()
 *String concat(String str)

 */
public class StringTransfer {
public static void main(String[] args) {
	String s = "HelloWorld";

	//byte[] getBytes()ʹ��ָ�����ַ������� String ����Ϊ byte ���У���������洢��һ���µ� byte �����С�
	byte[] bys = s.getBytes();
	System.out.println(bys[3]);
	
	//char[] toCharArray()ʹ��ָ�����ַ������� String ����Ϊ char���顣
	System.out.println(s.toCharArray());	
	
	//static String valueOf(char[] chs) �ַ�����ת��Ϊ�ַ���
	char[]chs = {'b','s','s'};
	System.out.println(String.valueOf(chs));
	
	//static String valueOf(int i) ��int����ת��Ϊ�ַ���
	System.out.println(String.valueOf(320));
	
	//String toLowerCase()������һ�����ַ��������ַ��������ַ�תΪСд��
	System.out.println("toLowerCase:" + s.toLowerCase());//ԭ�е��ַ�������
	
	//String toUpperCase()�����ַ��������ַ�תΪ��д
	System.out.println("toUpperCase:" + s.toUpperCase());
	
	//String concat(String str),�õĶ�Ļ����ַ���ֱ��ƴ��
	System.out.println("concat" + s.concat("Hello"));
}
}
