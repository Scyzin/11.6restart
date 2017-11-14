/*
	形式参数：
		基本类型
		引用类型
			类名:需要的是该类的对象
			抽象类:需要的是该抽象的类子类对象
			接口:需要的是该接口的实现类对象
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
		//需求：我要测试Student类的study()方法
		Student s = new Student();
		s.study();
		System.out.println("----------------");
		
		//需求2：我要测试StudentDemo类中的method()方法
		StudentDemo sd = new StudentDemo();
		Student ss = new Student();
		sd.method(ss);
		System.out.println("----------------");
		
		//匿名对象用法
		new StudentDemo().method(new Student());
	}
}
//定义一个爱好的接口
interface Love {
	public abstract void love();
}

class LoveDemo {
	public void method(Love l) { //l; l = new Teacher();  Love l = new Teacher(); 多态
		l.love();
	}
}

//定义具体类实现接口
class Teacher implements Love {
	public void love() {
		System.out.println("老师爱学生,爱Java,爱林青霞");
	}
}

class TeacherTest {
	public static void main(String[] args) {
		//需求：我要测试LoveDemo类中的love()方法
		LoveDemo ld = new LoveDemo();
		Love l = new Teacher();
		ld.method(l);
	}
}