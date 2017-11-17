package integer;

/*
 * Integer(int value) 
 * Integer(String s) 
 * 	这个字符串必须是数字。
 * 
 */
public class IntegerConstruct {
	public static void main(String[] args) {
		int a = 100;
		Integer i = new Integer(a);
		System.out.println(i);
		
		String s ="1000";
		Integer ii = new Integer(s);
		System.out.println(ii);
		
	}
}
