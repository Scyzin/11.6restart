package test��Ҫ�࿴;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * ����¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),�����ִܷӸߵ��ʹ����ı��ļ�
 * 
 * ������
 * 		A:����ѧ����
 * 		B:�������϶���
 * 			TreeSet<Student>
 * 		C:����¼��ѧ����Ϣ�洢������
 * 		D:�������ϣ�������д���ı��ļ�
 */
public class StudentScoreTest {
	public static void main(String[] args) throws IOException {
		
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				int num = s2.getSum() - s1.getSum();
				// �ܷ���ͬ�������ķ���
				int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
				int num3 = num2 == 0 ? s1.getMath() - s2.getMath() : num2;
				int num4 = num3 == 0 ? s1.getEnglish() - s2.getEnglish() : num3;
				return num4;
			}
		});

		for (int x = 1; x < 5; x++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("��¼��ѧ����Ϣ");
			System.out.println("������������");
			String name = sc.nextLine();
			System.out.println("���������ĳɼ���");
			int chinese = sc.nextInt();
			System.out.println("��������ѧ�ɼ���");
			int math = sc.nextInt();
			System.out.println("������Ӣ��ɼ���");
			int english = sc.nextInt();

			Student s = new Student();
			s.setName(name);
			s.setChinese(chinese);
			s.setMath(math);
			s.setEnglish(english);
			
			//�����˽�������ӵ�������
			ts.add(s);
		}
		
		//�������ϣ�������д���ı��ļ��С�
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
		bw.write("ѧ����Ϣ����");
		bw.newLine();
		bw.flush();
		bw.write("���������ĳɼ�����ѧ�ɼ���Ӣ��ɼ�");
		bw.newLine();
		bw.flush();
		for (Student s : ts) {
			StringBuilder sb = new StringBuilder();
			sb.append(s.getName()).append(",").append(s.getChinese()).append(",").append(s.getMath()).append(",")
					.append(s.getEnglish());
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		bw.close();
		System.out.println("ѧ����Ϣ¼�����");
	}
}
