package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date --
 * 
 * 
 * Date	 --	 String(格式化)
 * 		public final String format(Date date)
 * 
 * String -- Date(解析)
 * 		public Date parse(String source)
 * 
 * DateForamt:可以进行日期和字符串的格式化和解析，
 * 但是由于是抽象类，所以使用具体子类SimpleDateFormat。
 * 
 * SimpleDateFormat():默认模式
 * 		SimpleDateFormat(String pattern):给定的模式
 * 			这个模式字符串该如何写呢?
 * 			通过查看API，我们就找到了对应的模式
 * 			年 y
 * 			月 M	
 * 			日 d
 * 			时 H
 * 			分 m
 * 			秒 s
 */
public class DateFormatDemo {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		//默认模式
		//SimpleDateFormat sd = new SimpleDateFormat();
		
		//指定模式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		// public final String format(Date date)
		String s = sdf.format(d);
		System.out.println(s);
		
		String str = "2009-08-08 12:12:12";
		//格式要匹配 
		SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date dd =sdf.parse(str);
		System.out.println(dd);
		
	}
}
