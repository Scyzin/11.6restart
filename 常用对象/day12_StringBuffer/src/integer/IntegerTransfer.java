package integer;
/*
 * int������string���͵�ת��
 * 
 * int - String
 * String.valueOf()
 * 
 * String -int 
 * static int parseInt(String s)  ���ַ���������Ϊ�з��ŵ�ʮ�����������н�����
 * 
 * string-��������
 * static ���� parse����(String s)
 * 
 */
public class IntegerTransfer {
public static void main(String[] args) {
	int number =100;
	String s1 = String.valueOf(number);
	System.out.println(s1);
	
	String s = Integer.toString(2350);
	System.out.println(s);
	
	String s2 ="100";
	
	//��ʽ1
	Integer ii = new Integer(s2);
	int b = ii.intValue();
	System.out.println(b);
	
	//��ʽ2
	int a = Integer.parseInt(s2);
	System.out.println(s2);
	
}
}
