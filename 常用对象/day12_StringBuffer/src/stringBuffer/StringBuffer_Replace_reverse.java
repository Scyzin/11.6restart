package stringBuffer;
/*
 * �滻���ܺͷ�ת����
 *
 * public StringBuffer replace(int start,int end,String str)
 * public StringBuffer reverse()
 * 
 * ��ȡ����(����ֵ����Ϊstring)
 * public String substring(int start)
 * public String substring(int start,int end)
 * 
 */
public class StringBuffer_Replace_reverse {
public static void main(String[] args) {
	
	//�����ַ�������������
	StringBuffer s = new StringBuffer();
	
	s.append("helloworld");
	
	//public StringBuffer replace(int start,int end,String str)
	//���ַ����滻ָ��λ�á�
	s.replace(5, 10, "����ʤ");
	System.out.println("s:" + s);
	
	//public StringBuffer reverse()
	//��ת�ַ���
	s.reverse();
	System.out.println("s: " + s);
	
	//public String substring(int start)
	//����ֵ��string����ָ��λ�ÿ�ʼ��ȡ
	String s1 = s.substring(1);
	System.out.println("s1: " + s1);	
	
	//public String substring(int start,int end)
	//��ȡָ����
	String s2 = s.substring(0, 3);
	System.out.println("s2: " + s2);
}
}
