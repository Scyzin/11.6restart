package integer;

/*
 * Integer��
 * 
 * ������������ת��
 * String toBinaryString(int i)  2����
 * static String toOctalString(int i) 8���� 
 * String toHexString(int i)  16����
 * 
 * static String toString(int i, int radix) //����ָ�����Ƶ����������Ʒ�Χ2~36.
 * 0-9,a-z�ܹ�36��
 * 
 *  static int parseInt(String s, int radix)  �������תΪָ������
 *  
 * �ж�����
 * �������������ͷ�װ�ɶ���ĺô����ڿ�����
 * �����ж������Ĺ��ܷ������������ݡ�
 * byte		Byte
 * short	Short
 * int		Integer
 * long		Long
 * float	Float
 * double	Double
 * char		Character
 * boolean	Boolean
 * 
 * ���ڻ��������������ַ���֮���ת��
 */
public class IntegerDemo {
	public static void main(String[] args) {
		int a = Integer.MAX_VALUE;
		int b = Integer.MIN_VALUE;
		System.out.println("��������" + a + ",��С������" + b);
		
		System.out.println("ת��Ϊ2���Ƶ�����" +Integer.toBinaryString(100));
		System.out.println("ת��Ϊ8���Ƶ�����" +Integer.toOctalString(100));
		System.out.println("ת��Ϊ16���Ƶ�����" +Integer.toHexString(100));
		
		
		System.out.println("ת��Ϊ9���Ƶ�����" +Integer.toString(100,9));
		System.out.println("8����תΪ10���ƣ�" +Integer.parseInt("17",8));
		
		
		
	}
}
