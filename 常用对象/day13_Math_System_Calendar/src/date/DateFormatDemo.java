package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date --
 * 
 * 
 * Date	 --	 String(��ʽ��)
 * 		public final String format(Date date)
 * 
 * String -- Date(����)
 * 		public Date parse(String source)
 * 
 * DateForamt:���Խ������ں��ַ����ĸ�ʽ���ͽ�����
 * ���������ǳ����࣬����ʹ�þ�������SimpleDateFormat��
 * 
 * SimpleDateFormat():Ĭ��ģʽ
 * 		SimpleDateFormat(String pattern):������ģʽ
 * 			���ģʽ�ַ��������д��?
 * 			ͨ���鿴API�����Ǿ��ҵ��˶�Ӧ��ģʽ
 * 			�� y
 * 			�� M	
 * 			�� d
 * 			ʱ H
 * 			�� m
 * 			�� s
 */
public class DateFormatDemo {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		//Ĭ��ģʽ
		//SimpleDateFormat sd = new SimpleDateFormat();
		
		//ָ��ģʽ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		// public final String format(Date date)
		String s = sdf.format(d);
		System.out.println(s);
		
		String str = "2009-08-08 12:12:12";
		//��ʽҪƥ�� 
		SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date dd =sdf.parse(str);
		System.out.println(dd);
		
	}
}
