/*
	控制跳转语句：
		break:中断	在选择语句中和循环语句中
				跳出单层循环。要跳多层循环：要带标签:  标签名: 语句
		continue:继续
				跳出一次循环，继续执行下次循环。
		return:返回		结束方法的。


*/
class CirculationDemo5{
	public static void main(String[] args){
		/*//break的使用：跳出单层循环
		for(int i =0; i<10;i++){
			if(i==3){
				break;
			}System.out.print("*");
		}
		//跳出指定的多层循环
		wc:for(int i =0; i <10;i++){
			nc :for(int j = 0;j < 10;j++){
				if(j == 2){
					break wc;
				}
				System.out.print("*");
			}
			System.out.println();
		}*/
		//continue的使用：跳出一个循环
		for(int i =1;i < 10;i++){
			if(i==2){
				continue;
			}
			System.out.println(i);
		}
		//比较break,continue,return的区别。
		for(int x=0; x<10; x++) {
			if(x == 2) {
				System.out.println("退出");
				//break;
				//continue;
				return;//直接就结束程序了。 0 1 退出
			}
			
			System.out.println(x);
		}	
		System.out.println("over");
	}
}