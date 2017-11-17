package stringBuffer;
/*
 * ��ӹ��ܺ�ɾ������
 * 
 * public StringBuffer append();
 * ��������������͵��ַ����������У��������ַ�������������
 * 
 * public StringBuffer insert(int offset,String str)
 * ��ָ��λ��������ݣ��������ַ�������
 * 
 * public StringBuffer deleteCharAt(int index)

 * public StringBuffer delete(int start,int end)
 * 
 */

public class StringBuffer_insert {
	public static void main(String[] args) {

		// �����ַ�������������
		StringBuffer sb = new StringBuffer();
		StringBuffer s = new StringBuffer();
		/*
		 * StringBuffer sb2 = sb.append("hello"); System.out.println(sb == sb2);
		 */

		// public StringBuffer append();
		// ��������������͵��ַ����������У��������ַ�������������
		// û�����¿��ռ�
		sb.append("hello");

		sb.append("hello").append(true).append(12);
		System.out.println("sb:" + sb);

		// public StringBuffer insert(int offset,String str)
		// ��ָ��λ�ú�������ݣ��������ַ�������
		sb.insert(5, "world");
		System.out.println("sb��" + sb);
		
		s.append("helloworld");
		
		//public StringBuffer deleteCharAt(int index)
		//ɾ��ָ������λ�õ�һ���ַ�
		s.deleteCharAt(0);
		System.out.println("s:" +s);
		
		// public StringBuffer delete(int start,int end)
		//�Ƴ������е����ַ����е��ַ�������������λ��
		s.delete(1, 3);
		System.out.println("s:" + s);
		
		//�Ƴ����е�����
		s.delete(0, s.length());
		System.out.println("s:" + s);

	}
}
