package solo;
/*
 *����ģʽ��	ȷ������ֻ��һ������ʵ�������Զ����������Ҷ����ṩ��
 *			�񺺣���һ���ؾʹ�������
 *			�������õ�ʱ�򣬲�ȡ��������
 *
 *���ʵ�֣�
 *			���췽��˽�У���Աλ���Լ�����һ������ͨ��һ�������ķ����ṩ���ʡ�
 * 
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student s = Student.getStudent();
		Student s1= Student.getStudent();
		System.out.println(s1==s);
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		Teacher t1 = Teacher.getTeacher();
		//Teacher t2 = Teacher.getTeacher();
		//System.out.println(t2==t1);
		System.out.println(t1);
	}
}
