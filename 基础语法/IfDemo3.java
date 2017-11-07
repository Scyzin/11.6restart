/*
	键盘录入月份的值，输出对应的季节。
	
	春	3,4,5
	夏	6,7,8
	秋	9,10,11
	冬	12,1,2
	
	if语句是可以嵌套，嵌套的时候千万别丢了大括号。想对应的大括号也对应错了
	
*/
import java.util.Scanner;
class IfDemo3{
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		System.out.println("输入月份");
		int  a = sc.nextInt();
		if(a < 1 && a > 12){
			System.out.println("输入的月份有错");
		}else if (a == 3 || a == 4 || a ==5){//( a <= 5 && a>=3)
			System.out.println("是春季");
		}else if (a == 6 || a == 7 || a ==8){
			System.out.println("是夏季");
		}else if (a == 9 || a == 10 || a ==11){
			System.out.println("是秋季");
		}else{
			System.out.println("是冬季");
		}
	//获取三个数据中的最大值	
		int b = 30;
		int c = 20;
		int d = 10;
		int max;

		if(b > c){
			if(b > d){
				max = b;
			}else{
				max = d;
			}
		}else{
			if(c > d){
				max = c;
			}else{
				max = d;
				}
			}
		System.out.println("max=" + max);			
		
	}
}