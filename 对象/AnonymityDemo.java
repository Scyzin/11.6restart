/*	
	匿名对象：没有名字的对象
	应用：
		仅仅只调用一次，不适合调用多次。
		调用完，就被当成垃圾回收。效率更高。
		可以当做实际参数使用。
	
*/
class Student{
	public void shouw(){
		System.out.println("我喜欢你");
	}
}
class AnonymityDemo{
	public static void main(String[] args){
		Student s = new Student();
		s.show;
		s.show;
		//匿名对象调用方法
		new Student().show();
		new Student().show();
	}
}