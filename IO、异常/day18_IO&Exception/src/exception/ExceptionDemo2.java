package exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 	编译期异常：java程序必须显示处理，否则程序会发生错误，无法通过编译。
 * 	运行期异常:无显示处理，可以和编译时异常一起处理。
 * 
 * 	try里发现问题，jvm会生成一个异常对象，将这个对象抛出，和catch里的匹配。
 * 	如果该对象是某个类型的，就会执行catch里面的处理信息。
 * 
 *  异常中的几个方法：
 * 		public String getMessage():返回此 throwable 的详细消息字符串。 
 * 		public String toString()返回此 throwable 的简短描述。
 * 			结果是以下字符串的串联：此对象的类的 name  ": "（冒号和一个空格） 
 * 				调用此对象 getLocalizedMessage() 方法的结果 
 * 		public String getLocalizedMessage()创建此 throwable 的本地化描述。
 * 		默认实现返回与 getMessage() 相同的结果。子类有重写，就按子类的。
 * 		public void printStackTrace()
 * 获取异常类名和异常信息，以及异常出现在程序中的位置。返回值void。把信息输出在控制台。
 * public void printStackTrace(PrintStream s)
 * 将此 throwable 及其追踪输出到指定的输出流。
 * 
 * 		B	声明异常 throws
 * 格式：
 * 		throws 异常类名	也可以跟多个异常名
 * 		注意：这个格式必须跟在方法的括号后面。
 * 
 * 注意：
 * 		尽量不要在main方法上抛出异常。
 * 		但是我讲课为了方便我就这样做了。
 * 
 * 小结：
 * 		编译期异常抛出，将来调用者必须处理。
 * 		运行期异常抛出，将来调用可以不用处理。
 * 			
 */
public class ExceptionDemo2 {
	public static void main(String[] args) {

		System.out.println("今天天气很好");
		try {
			method();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("但是就是不该有雾霾");

		String s = "2201-15-";
		SimpleDateFormat c = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d = c.parse(s);// 创建一个ParseException对象，然后抛出，和catch里面的进行匹配
			System.out.println(d);
		} catch (ParseException e) {// ParseException e = new ParseException();
			// e.printStackTrace();
			System.out.println("出问题了");
			// getMessage()
			System.out.println(e.getMessage());// Unparseable date: "2201-15-"

			// toString()
			System.out.println(e.toString());
			// java.text.ParseException: Unparseable date: "2201-15-"
		}
	}

	// 编译期异常的抛出
	// 在方法声明上抛出，是为了告诉调用者，注意，我有问题。
	public static void method() throws ParseException {
		String s = "2014-11-20";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(s);
		System.out.println(d);
	}
}
