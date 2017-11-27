package exception;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
 * try .. catch... finally
 * 
 * finally控制的语句一定会执行。
 * 就算之前有return 也会执行
 * 
 * 如果执行到finally前jvm退出了，就不能执行了。
 * 
 * 作用：用于释放资方，在IO和数据库中见。
 */

public class ExceptionDemo4 { 
	public static void main(String[] args) {
		String s = "2201-15-";
		SimpleDateFormat c = new SimpleDateFormat("yyyy-MM-dd");
		
		Date d = null;
		try {
			d =c.parse(s);
		}catch(ParseException e){
		 e.printStackTrace();
		}finally {
			System.out.println("这里有运行");
		}
		System.out.println(d);
	}
}
