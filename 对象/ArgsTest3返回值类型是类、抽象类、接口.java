/*
	返回值类型
		基本类型:(基本类型太简单，我不准备讲解)
		引用类型：
			类:返回的是该类的对象
			抽象类:返回的是该抽象类的子类对象
			接口:返回的是该接口的实现类的对象
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
		//需求：我要测试Person类中的study()方法
		PersonDemo pd = new PersonDemo();
		Person p = pd.getPerson(); //new Student();  Person p = new Student(); 多态
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
		//需求：我要使用Student类中的study()方法
		//但是，这一次我的要求是，不要直接创建Student的对象
		//让你使用StudentDemo帮你创建对象
		StudentDemo sd = new StudentDemo();
		Student s = sd.getStudent(); //new Student(); Student s = new Student();
		s.study();
	}
}
//定义一个爱好的接口
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

//定义具体类实现接口
class Teacher implements Love {
	public void love() {
		System.out.println("老师爱学生,爱Java,爱林青霞");
	}
}

class TeacherTest2 {
	public static void main(String[] args) {
		LoveDemo ld = new LoveDemo();
		//Love l = ld.getLove(); //new Teacher(); Love l = new Teacher(); 多态
		//l.love();
		ld.getLove().love();//链式编程:每次调用完毕方法后，返回的是一个对象
	}
}