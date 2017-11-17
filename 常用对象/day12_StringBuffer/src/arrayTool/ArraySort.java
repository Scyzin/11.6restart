package arrayTool;
/*
 * 数组遍历
 * 冒泡排序
 * 快速排序
 */
public class ArraySort {
	public static void main(String[] args) {
		int[] arr = { 24, 60, 80, 57, 13 };
		
		System.out.println("排序前");
		printArray(arr);
		
		//maopaoArray(arr);
		selectArray(arr);
		System.out.println("排序后");
		printArray(arr);
	}
	//快速排序
	public static void selectArray(int[] arr) {
			for(int i = 0;i<arr.length-1;i++) {
				for(int j =i+1;j<arr.length;j++) {
					if(arr[i]>arr[j]) {
						int temp = arr[j];
						arr[j]=arr[i];
						arr[i]= temp;
					}
				}
			}
	}

	//冒泡排序
	public static void maopaoArray(int[] arr) {
		for(int j =0;j<arr.length -1;j++)
			for(int i = 0;i<arr.length-1-j;i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] =temp;
				}
			}
	}
	//数组遍历
	public static void printArray(int [] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			if(i!=arr.length-1) {
			System.out.print(arr[i]+",");
		}else {
			System.out.println(arr[i]+"]");}
		}
	}
}
