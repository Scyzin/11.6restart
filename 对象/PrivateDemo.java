/*
	封装概述
		是指隐藏对象的属性和实现细节，仅对外提供公共访问方式。
	好处：
		隐藏实现细节，提供公共的访问方式
		提高了代码的复用性
		提高安全性。
	封装原则：
		将不需要对外提供的内容都隐藏起来。
		把属性隐藏，提供公共方法对其访问。
	private关键字：
		是一个权限修饰符。
		可以修饰成员(成员变量和成员方法)
		被private修饰的成员只在本类中才能访问。
	封装和private的应用：
		A:把成员变量用private修饰
		B:提高对应的getXxx()和setXxx()方法		方法千万别忘记加()
	可以保护数据域，防止数据域被修改。	
*/
class Demo{
	private String name = "林";
	private int age;
	public String getName() {
		return name;
	}
	
	//姓名设置值
	public void setName(String n) {
		name = n;
	}
	//年龄获取值
	public int getAge() {
		return age;
	}
	
	//年龄赋值
	public void setAge(int a) {
		age = a;
	}
}
//测试类
class PrivateDemo{
	public static void main(String[] args){
		Demo d = new Demo ();
		System.out.println(d.getName());
		//通过调用方法来修改值，不修改原先数据域。
		//
		d.setName("你好");
		d.setAge(5);
		System.out.println(d.getAge() + d.getName());
	}
}