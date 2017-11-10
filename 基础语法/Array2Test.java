/*
	1.二维数组遍历
		外循环，为二维数组的长度，即一维数组的个数；
		内循环：为具体某一个一维数组的长度；
	2.公司年销售额求和
		某公司按照季度和月份统计的数据如下：单位(万元)
		第一季度：22,66,44
		第二季度：77,33,88
		第三季度：25,45,65
		第四季度：11,66,99
	3.杨辉三角形
		分析：第一列和最后一列都为1
				第三行开始，该行的数据等于上一行的前后两列数字之和。
	
*/
import java.util.Scanner;
class Array2Test{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入行数");
		int n = sc.nextInt();
		int [][]arr = new int [n][n];
		triangleArray(arr);
		printArray2(arr);
		}
	//杨辉三角形
	public static void triangleArray(int [][]arr){
		for(int i =0; i<arr.length;i++){
			arr[i][0] = 1;
			arr[i][i] = 1;
		}
		for(int i =2; i < arr.length;i++){
			for(int j = 1;j < i;j++){
				arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
			}
		}
	}
		
	//二维数组内部元素求和
	public static int sumArray2(int [][]arr){
		int sum = 0;
		for(int j = 0;j <arr.length;j++){
		for(int i = 0;i <arr[j].length ;i++){
			sum += arr[j][i];
			}
		}
		return sum;	
	}	
	//二维数组遍历,斜三角形
	public static void printArray2(int [][]arr){
		for(int j = 0;j <arr.length;j++){
		for(int i = 0;i <= j ;i++){
			System.out.print(arr[j][i] +" ");	
			}
		System.out.println();
		}
	}
	//二维数组遍历,n*n
	/*
	public static void printArray2(int [][]arr){
		for(int j = 0;j <arr.length;j++){
		for(int i = 0;i <arr[j].length ;i++){
			System.out.print(arr[j][i] +" ");	
			}
		System.out.println();
		}
	}
	*/
}