/*
	匿名内部类：
		就是内部类的简化写法
		
	
	new 类名或接口名{
		重写方法；
	}			这个本质就是继承类或者是该接口的子类匿名对象。
	
*/

interface Inter{
	public abstract void show();
}

class Outer{
	public void method(){
		
		Inter i = new Inter(){		//多态   父 f = new 子 ()
			public void show(){
				System.out.println("show");
			}
		};
		i.show(); 
	}
}
/*匿名内部类在开发中的使用
class InnerClassDemo2{
	public static void main(String[] args){
		Outer o = new Outer();
		o.method();
	}
}

interface Person{
	public abstract void study();
}

class PersonDemo{
	public void method(Person p){
		p.study();
	}
}

class Student implements Person{
	public void study(){
		System.out.println("好好学习，天天向上")；
	}
}

class InnerClassDemo3{
	PersonDemo pd = new PersonDemo();//创建对象
	Person p = new Student();//多态
	pd.method(p);
	System.out.println("------");
	
	PersonDemo ps = new PersonDemo();
	pd.method(new Person {
		public void study(){
			System.out.println("好好学习，天天向上");
		}
	})
}
*/
