/*
	����ֵ����
		��������:(��������̫�򵥣��Ҳ�׼������)
		�������ͣ�
			��:���ص��Ǹ���Ķ���
			������:���ص��Ǹó�������������
			�ӿ�:���ص��Ǹýӿڵ�ʵ����Ķ���
*/
abstract class Person {
	public abstract void study();
}

class PersonDemo {
	public Person getPerson() {
		//Person p = new Student();
		//return p;
		
		return new Student();
	}
}

class Student extends Person {
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
}

class PersonTest2 {
	public static void main(String[] args) {
		//������Ҫ����Person���е�study()����
		PersonDemo pd = new PersonDemo();
		Person p = pd.getPerson(); //new Student();  Person p = new Student(); ��̬
		p.study();
	}
}

class Student {
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
}

class StudentDemo {
	public Student getStudent() {
		//Student s = new Student();
		//Student ss = s;
		
		//Student s = new Student();
		//return s;
		return new Student();
	}
}

class StudentTest2 {
	public static void main(String[] args) {
		//������Ҫʹ��Student���е�study()����
		//���ǣ���һ���ҵ�Ҫ���ǣ���Ҫֱ�Ӵ���Student�Ķ���
		//����ʹ��StudentDemo���㴴������
		StudentDemo sd = new StudentDemo();
		Student s = sd.getStudent(); //new Student(); Student s = new Student();
		s.study();
	}
}
//����һ�����õĽӿ�
interface Love {
	public abstract void love();
}

class LoveDemo {
	public Love getLove() {
		//Love l = new Teacher();
		//return l;
		
		return new Teacher();
	}
}

//���������ʵ�ֽӿ�
class Teacher implements Love {
	public void love() {
		System.out.println("��ʦ��ѧ��,��Java,������ϼ");
	}
}

class TeacherTest2 {
	public static void main(String[] args) {
		LoveDemo ld = new LoveDemo();
		//Love l = ld.getLove(); //new Teacher(); Love l = new Teacher(); ��̬
		//l.love();
		ld.getLove().love();//��ʽ���:ÿ�ε�����Ϸ����󣬷��ص���һ������
	}
}