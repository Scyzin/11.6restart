package calendar;

/*
 * ��ѯ��һ���2���м���
 * 
 */
import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("������Ҫ��ѯ����");
			int a = sc.nextInt();
			
			Calendar c = Calendar.getInstance();
			
			c.set(a,2,1);
			c.add(Calendar.DATE, -1);
			int year = c.get(Calendar.YEAR);
			int date = c.get(Calendar.DATE);
			System.out.println(date);
	}
}
