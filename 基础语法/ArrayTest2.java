/*
	������
		String [] arr ={"����һ","���ڶ�"}
	���ҵ�һ��Ԫ�س��ֵ�λ�á�	
*/
import java.util.Scanner;
class ArrayTest2{
	public static void main(String[] args){
		/*String []arr = {"����һ","���ڶ�","������","������","������","������","������"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����������0-6");
		int a = sc.nextInt();
		System.out.println("��Ҫ���ҵ���" + arr[a]);*/
		int [] arr ={1,2,3,4,5,6};
		IndexOfFirst(arr);	
	}
	//����ĳԪ�أ��������±������
	public static void IndexOfFirst(int[] arr){
		int index = -1;
		for(int i =0; i < arr.length -1;i++){
			if(arr[i] == 5){
				index = i;
				System.out.println("��Ҫ�ҵ�Ԫ�ص��±�Ϊ" + index);
				break;
			}
		} 	
	}
}