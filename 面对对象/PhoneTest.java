/*
	类：一个模板。
		成员变量：事物的外在特征描述。
				  和变量的定义时一样的格式，但是是在类方法外。
		成员方法：事物的行为
				  和方法的定义一样，去掉static。
		
	对象：是类的一个实例。
		要先创建对象，才能调用方法。
	如何创建对象使用：
				格式：类名 对象引用变量 = new 类名();	
				对象引用变量和对象是不一样的。但大多情况，这种差异是可以忽略
	使用成员变量？：	
				对象名.变量名
	使用成员方法？：
				对象名.方法(参数名：参数类型);
*/
//创建一个类
/*
class Class{
	//定义变量
	String name;
	int age;
	String address;
    //定义方法
	public void study{
		System.out.println("study");
	}
	public void eat{
		System.out.println("eat");
	}
}
*/
//创建一个类
class Phone{
	String brand;
	int price;
	String color;
	public void call(String name){
		System.out.println("给"+name+"打电话");
	}
	public void send(){
		System.out.println("群发短信");
	}
	public void play(){
		System.out.println("玩游戏");
	}
}
//测试类
class PhoneTest{
	public static void main(String[] args){
	//创建对象
	Phone p = new Phone();
	//输出成员变量
	System.out.println(p.brand + "-----" + p.price +"----" +p.color);
	//成员变量赋值
	p.brand = "华为";
	p.price = 2500;
	p.color = "yellow";
	System.out.println(p.brand + "-----" + p.price +"----" +p.color);
	//调用方法  对象名.方法
	p.call("老妈");
	p.send();
	p.play();
	}
}
