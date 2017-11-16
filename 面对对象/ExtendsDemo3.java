/*
	方法覆盖（重写）：
		子类中出现和父类中方法声明一样的方法。
		原因： 
		子类对象调用方法的时候：
		先找子类本身，再找父类。
	
	注意：A:父类中私有方法不能被重写
			因为父类私有方法子类根本就无法继承
		  B:子类重写父类方法时，访问权限不能更低	public private
			最好就一致
	      C:父类静态方法，子类也必须通过静态方法进行重写
			其实这个算不上方法重写，
			
		子类重写父类方法的时候，最好声明一模一样。
	
	方法重载：
			本类中出现的方法，参数类型不同，与返回值无关。
		静态方法也能被继承。 	但不能被覆盖。
		
	方法覆盖override：
	在子类中，出现和父类中一模一样的方法声明的现象。
	
	方法重载overload：
		同一个类中，出现的方法名相同，参数列表不同的现象。

		方法重载能改变返回值类型，因为它和返回值类型无关。
*/
class Phone{
	public void call(String name){
		System.out.println("给" + name +"打电话");
	}
}
class NewPhone extends Phone{
	public void call(String name){
		super.call(name);
		System.out.println("今天天气晴");
	}
}
class ExtendsDemo3{
	public static void main(String[] args){
		 NewPhone p = new NewPhone();
		 p.call("你");
		 
	}
}
