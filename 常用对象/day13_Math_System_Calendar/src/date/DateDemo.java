package date;

import java.util.Date;

/*
 * Date:��ʾ�ض���˲�䣬��ȷ�����롣
 * 
 * ���췽����
 * 			Date() ���� Date ���󲢳�ʼ���˶����Ա�ʾ��������ʱ�䣨��ȷ�����룩��
 * 			Date(long date) ���ݸ������봴�����ڶ���
 * ������
 * 		public long getTime()
 *      public void setTime(long time)
 * 		��Date�õ�һ������ֵ
 * 		getTime()
 * 		��һ������ֵת��ΪDate
 * 		���췽��
 * 		setTime(long time)
 */
public class DateDemo {
	public static void main(String[] args) {
		Date a = new Date();
		System.out.println("d" + a);

		long time = 1000 * 60 * 60;
		Date a2 = new Date(time);// ��������ʼ�㣬8.��
		System.out.println("a2:" + a2);

		// ��������
		Date d = new Date();

		// ��ȡʱ��
		long time1 = d.getTime();
		System.out.println(time1);
		// System.out.println(System.currentTimeMillis());

		System.out.println("d:" + d);
		// ����ʱ��
		d.setTime(1000);
		System.out.println("d:" + d);
	}
}
