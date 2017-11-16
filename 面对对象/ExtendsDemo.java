/*	
	多个类中有相同属性和行为时，将这些内容抽取到单独一个类中，
	那么其他类无需重复定义，只要继承即可。
	 
	继承：避免重复的定义。提高代码的复用性。
		  还可以添加自己的心成员。
		
		public class 子类 extends 父类{}
	好处：
		提高代码复用性；提高代码的维护性；
		让类与类之间产生联系，是多态的前提。
	
	开发的原则：低耦合，高内聚
		耦合:类与类的关系
		内聚：自己完成某件事的能力
	java不支持多继承
		public class 子类 extends 父类{} 父类{}//错误
		但是支持多层继承
		public class 子类1 extends 父类{}
		public class 子类2 extends 子类1{}
		注意事项：
				只能继承非私有的成员。
				子类只能通过super去访问父类的构造方法
				不要为了部分功能去使用继承。
*/
class Student{
	public void eat(){
		System.out.println("eat");
	}
	public void sleep(){
		System.out.println("sleep");
	}
}
class Teacher extends Student{
	public void drink(){
		System.out.println("drink");
	}
}
class ExtendsDemo{
	public static void main(String[] args){
		Student s =new Student();
		s.eat();
		s.sleep();
		
		Teacher c = new Teacher();
		c.eat();
		c.sleep();
		c.drink();
	}
}