/*
	某个公司采用公用电话传递数据信息，数据是小于8位的整数，为了确保安全，
	在传递过程中需要加密，加密规则如下：
		首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字，
		最后将第一位和最后一位数字交换。 请任意给定一个小于8位的整数，
		然后，把加密后的结果在控制台打印出来。 
		
	下列做法出现了错误，数组转换时，有些数组是空的，它的默认值是0;	
*/
import java.util.Scanner;
class JiamiDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入需要加密的电话，");
		int a = sc.nextInt();
		if(a >= 100000000 || a < 0){
			System.out.println("输入的电话号码有错");
		}
		int arr[] = TransformArray(a);
		Jiami(arr);
		printArray(arr);
	}
	//数转换为数组,并且倒序了
	public static int[] TransformArray(int a){
 		int arr[] = new int [8];
		int index = 0;
		while(a > 0){
			arr[index] = a % 10;
			index++;
			a /= 10;
		}
		return arr;
	}
	//加密算法	
	public static void Jiami(int []arr){
		for(int i = 0; i < arr.length;i ++){
			arr[i] += 5;
			arr[i] %= 10;
		}
		int temp = arr[0];
		arr[0] = arr[arr.length-1];
		arr[arr.length-1] = temp; 	
	}
	//数组遍历
	public static void printArray(int [] arr){
		System.out.println("你要加密的号码为:");
		for(int i = 0;i < arr.length;i ++){
			System.out.println(arr[i]);
		}
	}
	/*正确做法
	//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//请输入一个数据
		System.out.println("请输入一个数据(小于8位)：");
		int number = sc.nextInt();
		
		//写功能实现把number进行加密
		//调用
		String result = jiaMi(number);
		System.out.println("加密后的结果是："+result);
	}
	
	
		需求：写一个功能，把数据number实现加密。
		两个明确：
			返回值类型：String 做一个字符串的拼接。
			参数列表：int number
	
	public static String jiaMi(int number) {
		//定义数组
		int[] arr = new int[8];
		
		//定义索引
		int index = 0;
		
		//把number中的数据想办法放到数组中
		while(number > 0) {
			arr[index] = number%10;
			index++;
			number /= 10;
		}
		
		//把每个数据加5，然后对10取得余数
		for(int x=0; x<index; x++) {
			arr[x] += 5;
			arr[x] %= 10;
		}
		
		//把第一位和最后一位交换
		int temp = arr[0];
		arr[0] = arr[index-1];
		arr[index-1] = temp;
		
		//把数组的元素拼接成一个字符串返回
		//定义一个空内容字符串
		String s = "";
		
		for(int x=0; x<index; x++) {
			s += arr[x];
		}
		
		return s;
		*/
}
