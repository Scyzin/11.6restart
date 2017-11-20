package calendar;

import java.util.Calendar;

/*
 * Calendar ����һ�������࣬��Ϊ�ض�˲����һ������ YEAR��MONTH��
 * DAY_OF_MONTH��HOUR �� �����ֶ�֮���ת���ṩ��һЩ��������Ϊ����
 * �����ֶΣ������������ڵ����ڣ��ṩ��һЩ������
 * 
 * calendar�ǻ�ȡ���е�ʱ���ֶ�
 * 
 * public static Calendar getInstance():����һ���������
 * 
 * public int get(int field):���ظ��������ֶε�ֵ
 * 
 * public void add(int field,int amount)
 * ���������ֶκͶ�Ӧʱ�䣬���Ե�ǰ�������в���
 * 
 * public final void set(int year,int month,int date)
 * �趨��ǰ��������
 * 
 */
public class CalendarDemo {
	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();

		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH);
		int date = rightNow.get(Calendar.DATE);
		// �·ݴ�0��ʼ��
		System.out.println(year + "��" + (month + 1) + "��" + date + "��");

		rightNow.add(Calendar.YEAR, -3);
		year = rightNow.get(Calendar.YEAR);
		month = rightNow.get(Calendar.MONTH);
		date = rightNow.get(Calendar.DATE);

		System.out.println(year + "��" + (month + 1) + "��" + date + "��");

		// ����ʱ��
		rightNow.set(2011, 11, 11);
		year = rightNow.get(Calendar.YEAR);
		month = rightNow.get(Calendar.MONTH);
		date = rightNow.get(Calendar.DATE);

		System.out.println(year + "��" + (month + 1) + "��" + date + "��");

	}
}
