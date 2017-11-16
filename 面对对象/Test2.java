/*
	变量什么时候定义为成员变量：
		变量用来描述这个类的信息的时候
		
	变量到底定义在哪里好？
		变量的范围是越小越好，能及时的被回收。
	import 须出现在所有的class前面
*/
import java.util.Scanner;
class Demo{
	/*private int a;
	private int b;
	public int getNumber(){
		return a + b;
	}
	public int setNumber(int a ,int b){
		this.a = a;
		this.b = b;
	}
	*/
	public int sum(int a,int b){
		return a + b;
	}
}
//两个数据和
/*
class Test{
	public static void main(String[] args){
		Demo s = new Demo();
		int a =10;
		int b = 20;
		System.out.println("两个数据的和为: " + s.sum(a,b));
	}
}
*/
//定义举行类，定义周长和面积的方法
class Demo2{
	private int a;
	private int b;
	public void setLength(int a){
		this.a = a;
	}
	public void setWidth(int b){
		this.b = b;
	}
	public int Zhouc(int a,int b){
		return (a + b)*2;
	}
	public int Area(int a,int b){
		return a * b;
	}
}

class Test2{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入矩形的长:");
	int a =sc.nextInt();
	System.out.println("请输入矩形的宽:");
	int b =sc.nextInt();
	Demo2 s =new Demo2();
	s.setLength(a);
	s.setWidth(b);
	System.out.println("矩形的面积:" +s.Area(a,b));
	System.out.println("矩形的周长:" +s.Zhouc(a,b));
	}
}