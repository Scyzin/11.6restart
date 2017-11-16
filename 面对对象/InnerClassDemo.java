/*
	内部类：
		在类定义在其他类的内部
		
	访问特点：
		内部类可以直接访问外部类的成员
		外部类要访问内部类的成员，必须创建对象
		
	成员内部类：
		类在成员变量的位置上
		调用：外部名.内部名  对象名 = 外部类对象.内部类对象
		
		private 保证数据的安全性
			static 为了方便访问数据
			注意：静态内部类访问的外部类数据必须用静态修饰。
	
	外部类和内部类没有继承关系。通过外部类名限定this对象。
		
		class Body {
			private class Heart {
				public void operator() {
					System.out.println("心脏搭桥");
				}
			}
			
			public void method() {
				if(如果你是外科医生) {
					Heart h = new Heart();
					h.operator();
				}
			}
		}
		
		Body b =  new Body();
		b.method();
		
		局部内部类
		A:可以直接访问外部类的成员
		B:在局部位置，可以创建内部类对象，通过对象调用内部类方法，来使用局部内部类功能
	
		局部内部类访问局部变量的注意事项?
		A:局部内部类访问局部变量必须用final修饰
		B:为什么呢?
			局部变量是随着方法的调用而调用，随着调用完毕而消失。
			而堆内存的内容并不会立即消失。所以，我们加final修饰。
			加入final修饰后，这个变量就成了常量。既然是常量。你消失了。
			我在内存中存储的是数据20，所以，我还是有数据在使用。
*/

class Outer{
	private static int num =2 ;
	
	public static class Inner{
		public void show(){
			System.out.println(num);
		}
		
		public static void show2() {
			//System.out.println(num);
			System.out.println(num);
		}
	}
	
	public void method(){
		//int num2 = 20;
		//final int num2 = 20;
		class Inner {
			public void show() {
				System.out.println(num);
				//从内部类中访问本地变量num2; 需要被声明为最终类型
				System.out.println(num2);//20
			}
		}
		
		//System.out.println(num2);
		Inner i = new Inner();
		i.show();
	}
}
class InnerClassDemo{
	public static void main(String[] args){
		//限定新静态类
		//Outer.Inner oi = new Outer().new Inner();
		//oi.show;
		
		//成员内部类被静态修饰后的访问方式是:
		//格式：外部类名.内部类名 对象名 = new 外部类名.内部类名();
		Outer.Inner oi = new Outer.Inner();
		oi.show();
		oi.show2();
		
		//show2()的另一种调用方式
		Outer.Inner.show2();
		
		Outer o = new Outer();
		o.method();
	}
}