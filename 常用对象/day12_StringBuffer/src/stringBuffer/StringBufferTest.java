package stringBuffer;
/*
 * �ַ�����ת
 * ����ƴ�ӳ��ַ���
 * 
 */
public class StringBufferTest {
	public static void main(String[] args) {
	
		/*	�ַ�����ת
		 * String s = "Hello";
		StringBuffer s1 = new StringBuffer(s);
		s1.append("world");
		s1.reverse();

		// String s2 = new String(s1);
		// ͨ��String(StringBuffer)
		// ͨ��toString()
		String s2 = s1.toString();
		��������:s3 = new StringBuffer(s).reverse().toString();
		System.out.println("��ת����ַ���Ϊ" + s2);*/
		
		
		int [] arr = {'a','b','c','d'};
		String s = arrayToString(arr);
		System.out.println("����ƴ�ӳɵ��ַ���Ϊ" + s);
	}
		
		//����ƴ�ӳ��ַ���
		public static String arrayToString(int[]arr) {
			StringBuffer s =new StringBuffer();
			s.append("[");
			for (int i = 0; i < arr.length ; i++) {
				if (i == arr.length - 1) {
					s.append(arr[i]);
				} else {
					s.append(arr[i]).append(", ");
				}
			}
			s.append("]");
			return s.toString();
		}
}
