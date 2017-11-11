/*
	方法：完成特定功能代码块。
		就是其他语言中的函数。
		
	格式：
		修饰符 返回值类型 方法名（参数类型 参数1, 参数类型 参数名2）{
			函数体；
			return返回值；
		}
	格式解释：
		修饰符： public priate protect
		返回值类型：int	boolean
		方法名：符合命名规则
		参数：
			形式参数：方法上定义的，用于接收实际参数的
			实际参数：实际参与运算的
		参数类型：参数的数据类型	参数名：就是变量
		方法体语句：完成功能的代码
		return：结束方法
		返回值：程序返回结果，返回给调用者。
	调用：
		单独调用无意义。输入调用，不够好。赋值调用最好。
	括号一定不能忘了。
*/
import java.util.Scanner;
class FunctionDemo{
	/*public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入两个整数");
	int i = sc.nextInt();
	int j = sc.nextInt();
	boolean max = Sum(i,j);
	System.out.println( max);
	}

	public static boolean Sum(int a, int b){
		return a == b;
		*/
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据:");
		int a = sc.nextInt();		
		System.out.println("请输入第二个数据:");
		int b = sc.nextInt();
		System.out.println("请输入第三个数据:");
		int c = sc.nextInt();
		
		int max = getMax(a,b,c);
		System.out.println("三个数据中的最大值是："+max);
	}
	
	/*
		需求；返回三个数中的最大值
		
		两个明确：
			返回值类型：int
			参数列表：int a,int b,int c
	*/
	public static int getMax(int a,int b,int c) {
		//if嵌套
		/*
		if(a > b) {
			if(a > c) {
				return a;
			}else {
				return c;
			}
		}else {
			if(b > c) {
				return b;
			}else {
				return c;
			}
		}
		*/
		
		//用三元改
		/*
		if(a > b) {
			return (a>c? a: c);
		}else {
			return (b>c? b: c);
		}
		*/
		
		//继续改进
		//return (a>b)? (a>c? a: c): (b>c? b: c);
		int temp = ((a>b)? a: b);
		int max = ((temp>c)? temp: c);
		return max;
	}
	}
}