package day16_Set;
/*
 * 键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),
 * 按照总分从高到低输出到控制台
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
				// 总分由高到低
				int num = s2.getSum() - s1.getSum();
				// 总分相同不一定语文相同
				int num1 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
				// 总分相同不一定数学相同
				int num2 = num1 == 0 ? s1.getMath() - s2.getMath() : num1;
				// 总分相同不一定语文相同
				int num3 = num2 == 0 ? s1.getEnglish() - s2.getEnglish() : num2;
				return num3;
			}
		});

		for (int x = 1; x <= 5; x++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入第" + x + "个学生的姓名：");
			String name = sc.nextLine();
			System.out.println("请输入第" + x + "个学生的语文成绩：");
			String chineseString = sc.nextLine();
			System.out.println("请输入第" + x + "个学生的数学成绩：");
			String mathString = sc.nextLine();
			System.out.println("请输入第" + x + "个学生的英语成绩：");
			String englishString = sc.nextLine();

			StudentScore s = new StudentScore();
			s.setName(name);
			s.setChinese(Integer.parseInt(chineseString));
			s.setMath(Integer.parseInt(mathString));
			s.setEnglish(Integer.parseInt(englishString));

			ts.add(s);
		}
		System.out.println("学生信息录入完毕");

		System.out.println("学生信息从高到底排序如下：");
		System.out.println("姓名\t+语文成绩\t+数学成绩\t+英语成绩\t");

		for (StudentScore a : ts) {
			System.out.println(a.getName() + "\t" + a.getChinese() + "\t" + a.getMath() + "\t" + a.getEnglish());
		}
	}
}
