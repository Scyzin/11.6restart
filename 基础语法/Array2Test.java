/*
	1.��ά�������
		��ѭ����Ϊ��ά����ĳ��ȣ���һά����ĸ�����
		��ѭ����Ϊ����ĳһ��һά����ĳ��ȣ�
	2.��˾�����۶����
		ĳ��˾���ռ��Ⱥ��·�ͳ�Ƶ��������£���λ(��Ԫ)
		��һ���ȣ�22,66,44
		�ڶ����ȣ�77,33,88
		�������ȣ�25,45,65
		���ļ��ȣ�11,66,99
	3.���������
		��������һ�к����һ�ж�Ϊ1
				�����п�ʼ�����е����ݵ�����һ�е�ǰ����������֮�͡�
	
*/
import java.util.Scanner;
class Array2Test{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("����������");
		int n = sc.nextInt();
		int [][]arr = new int [n][n];
		triangleArray(arr);
		printArray2(arr);
		}
	//���������
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
		
	//��ά�����ڲ�Ԫ�����
	public static int sumArray2(int [][]arr){
		int sum = 0;
		for(int j = 0;j <arr.length;j++){
		for(int i = 0;i <arr[j].length ;i++){
			sum += arr[j][i];
			}
		}
		return sum;	
	}	
	//��ά�������,б������
	public static void printArray2(int [][]arr){
		for(int j = 0;j <arr.length;j++){
		for(int i = 0;i <= j ;i++){
			System.out.print(arr[j][i] +" ");	
			}
		System.out.println();
		}
	}
	//��ά�������,n*n
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