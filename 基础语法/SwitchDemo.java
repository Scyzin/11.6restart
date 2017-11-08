/*
	switch语句：
		switch(表达式){
			case 值1：语句体1；break;
			case 值2：语句体2；break;
			case 值3：语句体3；break;
			default:	语句体n；
			break;
			}
		格式解释：
				switch选择结构。
				表达式 取值可以是byte ,short ,int ,char。
				JDK1.7以后现在可以是枚举和string。
			break;中断结束switch语句。
			default:默认值。所有值都不匹配时。等if语句的else。
		注意：	case的值得是常量。不能是变量。
				case后面的值不能是重复的。
				default可以省略。也可以出现在任意位置。
				switch语句运行到break位置，或者是程序末尾。
				
					
*/
import java.util.Scanner;
//判断周几
class SwitchDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字1-7");
		int a = sc.nextInt();
		switch(a){
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期七");
				break;
			default:System.out.println("输入的数字错误");
				break;//break可以省略
		}
		
	}
}
