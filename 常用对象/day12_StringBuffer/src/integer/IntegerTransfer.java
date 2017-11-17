package integer;
/*
 * int类型与string类型的转换
 * 
 * int - String
 * String.valueOf()
 * 
 * String -int 
 * static int parseInt(String s)  将字符串参数作为有符号的十进制整数进行解析。
 * 
 * string-其它类型
 * static 类型 parse类型(String s)
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
	
	//方式1
	Integer ii = new Integer(s2);
	int b = ii.intValue();
	System.out.println(b);
	
	//方式2
	int a = Integer.parseInt(s2);
	System.out.println(s2);
	
}
}
