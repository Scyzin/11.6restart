package integer;

/*
 * Integer类
 * 
 * 将二进制数据转换
 * String toBinaryString(int i)  2进制
 * static String toOctalString(int i) 8进制 
 * String toHexString(int i)  16进制
 * 
 * static String toString(int i, int radix) //返回指定进制的整数，进制范围2~36.
 * 0-9,a-z总共36个
 * 
 *  static int parseInt(String s, int radix)  其余进制转为指定进制
 *  
 * 判断数据
 * 将基本数据类型封装成对象的好处在于可以在
 * 对象中定义更多的功能方法操作该数据。
 * byte		Byte
 * short	Short
 * int		Integer
 * long		Long
 * float	Float
 * double	Double
 * char		Character
 * boolean	Boolean
 * 
 * 用于基本数据类型与字符串之间的转换
 */
public class IntegerDemo {
	public static void main(String[] args) {
		int a = Integer.MAX_VALUE;
		int b = Integer.MIN_VALUE;
		System.out.println("最大的整数" + a + ",最小的整数" + b);
		
		System.out.println("转换为2进制的数：" +Integer.toBinaryString(100));
		System.out.println("转换为8进制的数：" +Integer.toOctalString(100));
		System.out.println("转换为16进制的数：" +Integer.toHexString(100));
		
		
		System.out.println("转换为9进制的数：" +Integer.toString(100,9));
		System.out.println("8进制转为10进制：" +Integer.parseInt("17",8));
		
		
		
	}
}
