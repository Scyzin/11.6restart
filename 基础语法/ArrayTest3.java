/*	
	¿ìËÙÅÅĞò
*/
class ArrayTest3{
	public static void main(String[] args){
		int [] arr ={3,5,35,1,32,6};
		selctionSort(arr);
		printArray(arr);
	}
	public static void selctionSort(int [] arr){
		for(int i = 0; i < arr.length- 1; i ++){
			int min = arr[i];
			int minIndex = i;
			for(int j = i +1; j < arr.length; j++){
				if(min > arr[j]){
					min = arr[j];
					minIndex = j;
				}	
			}
			if(minIndex != i){
				arr[minIndex] = arr[i];
				arr[i] = min;
			}
		}
		
	}
	public static void printArray(int []arr){
		System.out.print("[");
		for(int x = 0;x <arr.length;x++){
			if(x == arr.length-1) {
				System.out.println(arr[x]+"]");
			}else {
				System.out.print(arr[x]+", ");
		}
	}
	}
}