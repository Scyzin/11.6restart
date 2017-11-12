/*
	阅读文档，学习math类
	随机数，猜数字
*/
import java.util.Scanner;
public class MathTest2{
	public static void main(String[] args){
	
	//1~100之间的随机数；
	//double a = Math.random()*100 ;
	int b = (int)(Math.random()*100) +1;
	while(true){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个1~100之间的数");
		int a = sc.nextInt();
	if(a < b){
		System.out.println("你猜的数" + a + "小了");
	}else if(a > b){
	System.out.println("你猜的数" + a + "大了");
	}else{
		System.out.println("恭喜你猜对了");
		break;
	}
	}
	System.out.println(b);
	}
}