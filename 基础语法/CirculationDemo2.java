/*
	while循环的基本格式：
		while(判断条件语句) {
			循环体语句;
		}
		
		初始化语句;
	    while(判断条件语句) {
			 循环体语句;
			 控制条件语句;
		}
		while循环和for循环的区别?
		使用区别：如果你想在循环结束后，继续使用控制条件的那个变量，用while循环，
		否则用for循环。不知道用for循环。
		          因为变量及早的从内存中消失，可以提高内存的使用效率。
				  
			如果是一个范围的，用for循环非常明确。
			如果是不明确要做多少次，用while循环较为合适。
*/
class CirculationDemo2{
	public static void main(String[] args){
		/*int sum = 0;
		int i = 1;
		while(i <=10){
			sum += i;
			i++;
		}
		System.out.println("和为" + sum);
		
		//for循环实现
		for(int x=0; x<10; x++) {
			System.out.println("112");
		}
		//这里不能在继续访问了
		//System.out.println(x);
		
		//while循环实现
		int y = 0;
		while(y<10) {
			System.out.println("112");
			y++;
		}
		//这里是可以继续访问的
		System.out.println(y);*/
		//0.1m厚纸张折叠，最后高度超过8848m。
		int count =0;
		int i =1;
		while(i <=884800){
			count ++;
			i *= 2;
			System.out.println("第" + count +"次叠加厚度为" + i);
		}
		System.out.println("折叠了" + count + "次，纸张的厚度不低于珠穆朗玛峰的高度");
	}
}