package character;

/*
 * Character ���ڶ����а�װһ���������� char ��ֵ��Character ����
 * �Ķ����������Ϊ char �ĵ����ֶΡ������ṩ�˼��ַ�������ȷ���ַ�
 * �����Сд��ĸ�����֣��ȵȣ��������ַ��Ӵ�дת����Сд����֮��Ȼ�� 
 * 
 *  public static boolean isUpperCase(char ch)
	public static boolean isLowerCase(char ch)
	public static boolean isDigit(char ch)
	public static char toUpperCase(char ch)
	public static char toLowerCase(char ch)

 */
public class CharacterDemo {
	public static void main(String[] args) {
		Character c = new Character('a');
		System.out.println("c:"+c);
		
		//�ж��Ƿ�Ϊ��д
		System.out.println(Character.isUpperCase(c));
		
		//�ж��Ƿ�ΪСд
		System.out.println(Character.isLowerCase(c));
		
		//ת��ΪСд
		System.out.println(Character.toLowerCase(c));
		
		//ת��Ϊ��д
		System.out.println(Character.toUpperCase(c));
		
		//�ж��Ƿ�Ϊ����
		System.out.println(Character.isDigit(c));
	}
}
