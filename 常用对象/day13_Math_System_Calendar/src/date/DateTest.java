package date;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/*
 * �������������
 * 
 */
public class DateTest {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("��������ĳ���������");
			String line = sc.nextLine();

			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
			Date d = sd.parse(line);

			long myTime = d.getTime();

			long end = System.currentTimeMillis();

			long time = end - myTime;

			long day = time / 1000 / 60 / 60 / 24;
			System.out.println("����������" + day + "����");
		}
	}
}
