/*
	�������	������.length	���ڻ�ȡ���鳤�ȡ�
	�����ȡ��ֵ
	��������
*/
class ArrayTest{
	public static void main(String[] args){
		int [] arr = {1,2,3,4,6};
		
		//�������
		
		reverseArr(arr);
		printArray(arr);
}

		/*��ȡ������ֵ
	public static int getMax(int []arr){
		int max = arr[0];
		for (int i = 0;i < arr.length; i++){
			if (max < arr[i]){
				max = arr[i];
			}
		}
		return max;
		}
	}*/
	
	public static void reverseArr(int []arr){
		for(int i=0, j =arr.length -1;i < j; i++, j--){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printArray(int []arr){
		for(int x = 0;x <arr.length;x++){
			System.out.println(arr[x]);
		}
	}
}