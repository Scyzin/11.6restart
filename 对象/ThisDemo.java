/*
	见名知意：单独的n和a 不知道什么意思。
	关键字this是指调用方法的对象。
		随着对象的创建而存在
		当前类的对象引用，简单就代表当前类的一个对象。
		注意：方法被哪个对象调用，this就代表哪个对象。
	应用：	
		解决局部变量隐藏成员变量。
*/
class Demo{
	private String name = "林";
	private int age;
	
	public String getName() {
		return name;//隐藏了this
	}
	
	public void setName(String name) {
		//name = name;//就近原则，把自己赋给自己。
		//这里调用只能通过对象名；
		//java就提供了一个关键字:this
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
class ThisDemo{
	public static void main(String[] args){
		Demo d = new Demo();
		
		d.setAge(10); 
		d.setName("林"); 
		System.out.println(d.getAge() + d.getName());
	}
}