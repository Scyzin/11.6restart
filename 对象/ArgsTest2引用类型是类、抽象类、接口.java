/*
	��ʽ������
		��������
		��������
			����:��Ҫ���Ǹ���Ķ���
			������:��Ҫ���Ǹó�������������
			�ӿ�:��Ҫ���Ǹýӿڵ�ʵ�������
*/
class Student {
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
}

class StudentDemo {
	public void method(Student s) { //ss; ss = new Student();  Student s = new Student();
		s.study();
	}
}

class StudentTest {
	public static void main(String[] args) {
		//������Ҫ����Student���study()����
		Student s = new Student();
		s.study();
		System.out.println("----------------");
		
		//����2����Ҫ����StudentDemo���е�method()����
		StudentDemo sd = new StudentDemo();
		Student ss = new Student();
		sd.method(ss);
		System.out.println("----------------");
		
		//���������÷�
		new StudentDemo().method(new Student());
	}
}
//����һ�����õĽӿ�
interface Love {
	public abstract void love();
}

class LoveDemo {
	public void method(Love l) { //l; l = new Teacher();  Love l = new Teacher(); ��̬
		l.love();
	}
}

//���������ʵ�ֽӿ�
class Teacher implements Love {
	public void love() {
		System.out.println("��ʦ��ѧ��,��Java,������ϼ");
	}
}

class TeacherTest {
	public static void main(String[] args) {
		//������Ҫ����LoveDemo���е�love()����
		LoveDemo ld = new LoveDemo();
		Love l = new Teacher();
		ld.method(l);
	}
}