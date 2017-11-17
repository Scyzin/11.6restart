package character;

/*
 * Character 类在对象中包装一个基本类型 char 的值。Character 类型
 * 的对象包含类型为 char 的单个字段。该类提供了几种方法，以确定字符
 * 的类别（小写字母，数字，等等），并将字符从大写转换成小写，反之亦然。 
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
		
		//判断是否为大写
		System.out.println(Character.isUpperCase(c));
		
		//判断是否为小写
		System.out.println(Character.isLowerCase(c));
		
		//转换为小写
		System.out.println(Character.toLowerCase(c));
		
		//转换为大写
		System.out.println(Character.toUpperCase(c));
		
		//判断是否为数字
		System.out.println(Character.isDigit(c));
	}
}
