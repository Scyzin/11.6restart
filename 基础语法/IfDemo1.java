/*
	顺序结构
		从上到下依次执行
	选择结构	
		if语句
			if (关系表达系){
				语句体；
			}
		if语句的注意事项：
		比较表达式无论简单还是复杂，结果必须是boolean类型
		if语句控制的语句体如果是一条语句，大括号可以省略；
		  如果是多条语句，就不能省略。建议永远不要省略。
		一般来说：有左大括号就没有分号，有分号就没有左大括号
		
			if (关系表达式){
				语句体1；
			}
			else{
				语句体2；
			}
			先计算比较表达式的值，看返回值是true或者false。true执行1，false执行2
		
*/
import java.util.Scanner;
class IfDemo1{
	public static void main(String[] args){
		System.out.println("程序开始");
		System.out.println("我爱java");
		System.out.println("程序结束");
		
		int x = 10;
		if (x == 10){
			System.out.println("x等于10");
		}
		int b =100;
		if(b != 100);  //这里其实是有语句体的，只不过是空语句体。
		
		if (x == 20){
			System.out.println("x不等于10");
		}
		else{
			System.out.println("x等于20");
		}
		//获取两个数据中较大的值
		Scanner sc = new Scanner(System.in);
		System.out.println("第一个数：")；
		int a = sc.nextInt();
		System.out.println("第二个数：")；
		int b = sc.nextInt();
		if (a > b){
			System.out.println("较大的数：" + a)；
		}else{
			System.out.println("较大的数：" + b)；
		}
		
		int max = a > b ? a : b;//三元运算符可以实现的，都可以用if语句实现。
		System.out.println("较大的数:" +max);
		
		
		
		
	}
}