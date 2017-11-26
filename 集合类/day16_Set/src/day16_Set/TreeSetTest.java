package day16_Set;
/*
 * ����¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),
 * �����ִܷӸߵ������������̨
 * 
 */
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public abstract class TreeSetTest {
	public static void main(String[] args) {

		TreeSet<StudentScore> ts = new TreeSet<StudentScore>(new Comparator<StudentScore>() {

			@Override
			public int compare(StudentScore s1, StudentScore s2) {
				// �ܷ��ɸߵ���
				int num = s2.getSum() - s1.getSum();
				// �ܷ���ͬ��һ��������ͬ
				int num1 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
				// �ܷ���ͬ��һ����ѧ��ͬ
				int num2 = num1 == 0 ? s1.getMath() - s2.getMath() : num1;
				// �ܷ���ͬ��һ��������ͬ
				int num3 = num2 == 0 ? s1.getEnglish() - s2.getEnglish() : num2;
				return num3;
			}
		});

		for (int x = 1; x <= 5; x++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�������" + x + "��ѧ����������");
			String name = sc.nextLine();
			System.out.println("�������" + x + "��ѧ�������ĳɼ���");
			String chineseString = sc.nextLine();
			System.out.println("�������" + x + "��ѧ������ѧ�ɼ���");
			String mathString = sc.nextLine();
			System.out.println("�������" + x + "��ѧ����Ӣ��ɼ���");
			String englishString = sc.nextLine();

			StudentScore s = new StudentScore();
			s.setName(name);
			s.setChinese(Integer.parseInt(chineseString));
			s.setMath(Integer.parseInt(mathString));
			s.setEnglish(Integer.parseInt(englishString));

			ts.add(s);
		}
		System.out.println("ѧ����Ϣ¼�����");

		System.out.println("ѧ����Ϣ�Ӹߵ����������£�");
		System.out.println("����\t+���ĳɼ�\t+��ѧ�ɼ�\t+Ӣ��ɼ�\t");

		for (StudentScore a : ts) {
			System.out.println(a.getName() + "\t" + a.getChinese() + "\t" + a.getMath() + "\t" + a.getEnglish());
		}
	}
}
