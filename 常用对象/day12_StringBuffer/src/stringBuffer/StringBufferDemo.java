 package stringBuffer;
/*
 *public StringBuffer() 
 *public StringBuffer(int capacity)
 *public StringBuffer(String str)

 *public int capacity():
 *public int length();
 *
 *public String toString() �����������ַ����ı�����ʽ
 *
 */
public class StringBufferDemo {
public static void main(String[] args) {
	//�޲ι��췽�����������������һ��������
	StringBuffer sb = new StringBuffer();
	//�����ַ���������������ֵ,Ĭ��16
	System.out.println("sb.capacity" + sb.capacity());
	//���س��ȣ��ַ�������ʵ��ֵ
	System.out.println("sb.length" + sb.length());
	
	//ָ���������ַ���������
	StringBuffer sb2 = new StringBuffer(50);
	//�����ַ���������������ֵ
	System.out.println("sb2.capacity" + sb2.capacity());
	//���س��ȣ��ַ�������ʵ��ֵ
	System.out.println("sb2.length" + sb2.length());
	
	//ָ���ַ������ݵ��ַ���������
	StringBuffer sb3 = new StringBuffer("hello");
	//�����ַ���������������ֵ
	System.out.println("sb3.capacity" + sb3.capacity());
	//���س��ȣ��ַ�������ʵ��ֵ
	System.out.println("sb3.length" + sb3.length());
	
}
}
