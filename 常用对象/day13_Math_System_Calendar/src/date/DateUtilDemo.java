package date;

import java.text.ParseException;
import java.util.Date;

public class DateUtilDemo {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		String s = DateUtil.dateToString(d, "yyyy-MM-dd HH:mm:ss");
		System.out.println(s);
		
		String s1 = "2014-15-30 15:15:15";
		Date d1 = DateUtil.stringToDate(s1,"yyyy-MM-dd HH:mm:ss");
		System.out.println(d1);
	}
}
