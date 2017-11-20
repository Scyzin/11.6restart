package date;

import java.util.Date;

/*
 * Date:表示特定的瞬间，精确到毫秒。
 * 
 * 构造方法：
 * 			Date() 分配 Date 对象并初始化此对象，以表示分配它的时间（精确到毫秒）。
 * 			Date(long date) 根据给定毫秒创建日期对象
 * 方法：
 * 		public long getTime()
 *      public void setTime(long time)
 * 		从Date得到一个毫秒值
 * 		getTime()
 * 		把一个毫秒值转换为Date
 * 		构造方法
 * 		setTime(long time)
 */
public class DateDemo {
	public static void main(String[] args) {
		Date a = new Date();
		System.out.println("d" + a);

		long time = 1000 * 60 * 60;
		Date a2 = new Date(time);// 东八区开始算，8.起
		System.out.println("a2:" + a2);

		// 创建对象
		Date d = new Date();

		// 获取时间
		long time1 = d.getTime();
		System.out.println(time1);
		// System.out.println(System.currentTimeMillis());

		System.out.println("d:" + d);
		// 设置时间
		d.setTime(1000);
		System.out.println("d:" + d);
	}
}
