/*
	方法重载：
		（因为需求不同，方法的功能相同，参数列表不同的情况
		但是方法的的命名又要做到见名知意。
		java允许他们起相同的名字。
		这就是方法重载。）
		
		在同一个类中，允许存在一个以上的同名方法，只
		要它们的参数个数或者参数类型不同即可。
	特点：
		与返回值类型无关，只看方法名和参数列表
		在调用时，虚拟机通过参数列表的不同来区分同名方法。
		也就是参数类型和参数个数来分别方法。

*/
class FunctionDemo2 {
	public static void main(String[] args) {
		//jvm会根据不同的参数去调用不同的功能
		System.out.println(sum(10,20));
		System.out.println(sum(10,20,30));
		System.out.println(sum(10,20,30,40));
		
		System.out.println(sum(10.5f,20f));
	}
	
	public static int sum(int a,int b) {
		System.out.println("int");
		return a + b;
	}
	
	public static int sum(int a,int b,int c) {
		return a + b + c;
	}
	
	public static int sum(int a,int b,int c,int d) {
		return a + b + c + d;
	}
	
	public static float sum(float a,float b) {
		System.out.println("float");
		return a + b;
	}
}