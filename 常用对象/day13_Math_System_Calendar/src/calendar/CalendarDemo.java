package calendar;

import java.util.Calendar;

/*
 * Calendar 类是一个抽象类，它为特定瞬间与一组诸如 YEAR、MONTH、
 * DAY_OF_MONTH、HOUR 等 日历字段之间的转换提供了一些方法，并为操作
 * 日历字段（例如获得下星期的日期）提供了一些方法。
 * 
 * calendar是获取所有的时间字段
 * 
 * public static Calendar getInstance():返回一个子类对象
 * 
 * public int get(int field):返回给定日历字段的值
 * 
 * public void add(int field,int amount)
 * 根据日历字段和对应时间，来对当前日历进行操作
 * 
 * public final void set(int year,int month,int date)
 * 设定当前的年月日
 * 
 */
public class CalendarDemo {
	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();

		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH);
		int date = rightNow.get(Calendar.DATE);
		// 月份从0开始的
		System.out.println(year + "年" + (month + 1) + "月" + date + "日");

		rightNow.add(Calendar.YEAR, -3);
		year = rightNow.get(Calendar.YEAR);
		month = rightNow.get(Calendar.MONTH);
		date = rightNow.get(Calendar.DATE);

		System.out.println(year + "年" + (month + 1) + "月" + date + "日");

		// 设置时间
		rightNow.set(2011, 11, 11);
		year = rightNow.get(Calendar.YEAR);
		month = rightNow.get(Calendar.MONTH);
		date = rightNow.get(Calendar.DATE);

		System.out.println(year + "年" + (month + 1) + "月" + date + "日");

	}
}
