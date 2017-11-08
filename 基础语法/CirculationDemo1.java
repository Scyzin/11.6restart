/*
	循环语句：for循环,while循环,do...while循环。
	
	for循环格式：
		for(初始化语句;判断条件语句;控制条件语句) {
			循环体语句;
		}
		执行流程：
			执行初始化语句
			执行判断条件语句,看其返回值是true还是false
				如果是true，就继续执行
				如果是false，就结束循环
			执行循环体语句;
			执行控制条件语句
			回到B继续。
			
	注意事项：
		判断条件语句无论简单还是复杂结果是boolean类型。
		循环体语句如果是一条语句，大括号可以省略；如果是多条语句，大括号不能省略。建议永远不要省略。
		一般来说：有左大括号就没有分号，有分号就没有左大括号
		
	水仙花数
	所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
	举例：153就是一个水仙花数。
	153 = 1*1*1 + 5*5*5 + 3*3*3

*/
class CirculationDemo1{
	public static void main(String[] args){
		/*int sum = 0 ;
		for(int i = 1;i <= 10; i++){
			sum += i; 
			}
			System.out.println("sum = " + sum);*/
			
			//求出1-100之间偶数和
			/*int sum = 0 ;
			for(int i = 1;i <= 10; i++){
				if(i % 2==0){
				sum += i; }
			}
			System.out.println("1-100之间偶数和sum = " + sum);
			//5的阶乘
			int sum = 1 ;
			for (int i = 1; i <=5; i++){
				sum *= i;
			}
			System.out.println("5的阶乘" +sum);	*/
		/*输出水仙花数，并且统计个数	
			int n =0;
		for(int x = 100; x < 1000; x++){
			int ge = x %10;
			int shi= x/10%10;
			int bai= x/100%10;
			
			if(x ==(ge*ge*ge + shi*shi*shi + bai*bai*bai)){
				System.out.println(x);
				n++;
			}
		}
			System.out.println("水仙花数为" + n);
		/*	回文数	
		for(int x=10000; x<100000; x++) {
			
			int ge = x%10;
			int shi = x/10%10;
			int bai  = x/10/10%10;
			int qian = x/10/10/10%10;
			int wan = x/10/10/10/10%10;
			
			if((ge==wan) && (shi==qian) && (ge+shi+qian+wan==bai)) {
				System.out.println(x);
			}
		}*/
		/*统计1-1000之间满足如下条件的数据有多少个:
			对3整除余2
			对5整除余3
			对7整除余2*/
			int count = 0;
			for (int x = 0; x <=1000; x++){
				if((x%3==2) && (x % 5 ==3) && (x % 7 ==2)){
					System.out.println("满足条件的数:" + x);
					count ++;
				}
			}
			System.out.println(count);

		
	}
}

