/*
	数组查表
		String [] arr ={"星期一","星期二"}
	查找第一个元素出现的位置。	
*/
import java.util.Scanner;
class ArrayTest2{
	public static void main(String[] args){
		/*String []arr = {"星期一","星期二","星期三","星期四","星期五","星期六","星期天"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字0-6");
		int a = sc.nextInt();
		System.out.println("你要查找的是" + arr[a]);*/
		int [] arr ={1,2,3,4,5,6};
		IndexOfFirst(arr);	
	}
	//查找某元素，并将其下标输出。
	public static void IndexOfFirst(int[] arr){
		int index = -1;
		for(int i =0; i < arr.length -1;i++){
			if(arr[i] == 5){
				index = i;
				System.out.println("你要找的元素的下标为" + index);
				break;
			}
		} 	
	}
}