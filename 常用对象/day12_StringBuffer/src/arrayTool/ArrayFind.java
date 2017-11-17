package arrayTool;

/*
 * ���ң��������ң�����Ԫ������
 * 
 * 		 ���ֲ��ң�����Ԫ������
 * 			�����Ƚ����������������ٽ��ж��ֲ��ҡ�
 * 		
 * 
 */
public class ArrayFind {
	public static void main(String[] args) {
		int[] arr = { 11, 23, 67, 453, 7754, 453 };
		int a = 11;
		int x = BinarySearch(arr, a);
		System.out.println(x);
	}

	public static int BinarySearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;

		int mid = (low + high) / 2;

		while (arr[mid] != key) {
			if (key == arr[mid]) {
				return mid;
			} else if (key < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
			mid = (high+low)/2;
			if (high < low) {
				return  - 1;
			}
			
		}
		return mid;
	}
}
