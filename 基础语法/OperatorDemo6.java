/*
	三目运算符：
		比较表达式?表达式1:表达式2;
		
		比较表达式:结果是一个boolean类型!

			根据比较表达式的计算返回一个true或者false。
			如果是true，就把表达式1作为结果。
			如果是false，就把表达式2作为结果。
			
		获取两个整数中的最大值
		获取三个整数中的最大值
		比较两个整数是否相同	
*/
class OperatorDemo6 {
	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		
		//报错
		//int z = ((x = y)? x : y);
		//两个整数中的最大值
		int max = ((x > y)? x: y);	
		System.out.println("max=" + max);
		
		//三个整数中的最大值
		int a = 10;
		int b = 30;
		int c = 20;
		int temp = (a > b) ? a : b ;
		int max1 = (temp > c) ? temp : c;
		System.out.println("max1=" + max1);
		
		//比较两个整数是否相同
		boolean flag = (a == b);
		System.out.println(flag);
		
	}
}
