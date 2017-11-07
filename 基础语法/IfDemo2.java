/*
	if语句的格式3：
		if(比较表达式1) {
			语句体1;
		}else if(比较表达式2) {
			语句体2;
		}else if(比较表达式3) {
			语句体3;
		}
		...
		else {
			语句体n+1;
		}
*/
import java.util.Scanner;
class IfDemo2{
	public static void main(String[] args){
		//需求：键盘录入一个成绩，判断并输出成绩的等级。
		/*
			90-100 优秀
			80-90  好
			70-80  良
			60-70  及格
			0-60   不及格
		*/
		
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的成绩,0-100分之间");
		//读入成绩
		int a = sc.nextInt();
		if(a < 0 && a > 100){
			System.out.println("输入成绩有误");
		}else if (a > 90 && a < 100){
			System.out.println("优秀");
		}else if (a > 80&& a < 90){
			System.out.println("好");
		}else if (a > 70 && a < 80){
			System.out.println("良");
		}else if (a > 60 && a < 70){
			System.out.println("及格");
		}else{
			System.out.println("不及格");
		}
		//需求：键盘录入x的值，计算出y的并输出；
/*		x>=3	y = 2x + 1;
		-1<=x<3	y = 2x;
		x<=-1	y = 2x – 1;
		
		分析：要录入,scanner
				多个判断，用if else */
		int x = sc.nextInt();
		int y;
		if (x <= -1){
			 y =2*x + 1;
		}else if(-1 < x && x <3 ){
			 y = 2*x;
		}else{
			 y =2*x + 1;
		}
		System.out.println("y=" + y);
			
		
	}
}