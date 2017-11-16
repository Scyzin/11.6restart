/*
	成员变量与局部变量
		类中的位置不同：
		内存的位置不同；
		生命周期不同；
			成员：随对象创建而存在，随对象消失而消失
			局部：随方法调用而存在，随方法调用完毕而消失
		初始化值不同：
			成员变量：有默认初始化值；	是事物的外在特征
			局部变量：没有默认初始化值，要定义赋值；
		注意：
			成员变量和局部变量命名可以一样。就近使用调用
*/
class VariableDemo{
	int num = 10;//成员变量在类方法外，在堆内存中。
	public void show(){
		//要定义赋值才能使用
		int num2 = 20;//局部变量在方法定义或声明中，在栈内存中；
		System.out.println(num2);
	}
}
class VariableTest(){
	public static void main(String[] args){
		//创建成员对象
		Variable v = new Variable();
		System.out.println(v.num);//访问成员变量
		v.show();//访问成员方法
}