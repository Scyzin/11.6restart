/**
* �������������в����Ĺ�����
* @author ����ʤ
* @version 1.0
*/
public class ArrayTool{
	//���췽��˽�У����Ͳ��ܴ��������ˡ�
	/**
	* ����˽�й���
	*/
	private ArrayTool(){};
	/**
	* ���Ǳ�������ķ�����������ĸ�ʽ�ǣ�[Ԫ��1, Ԫ��2, Ԫ��3, ...]
	* @param arr ����Ҫ������������
	*/
	public static void printArray(int []arr){
		for(int i = 0 ; i < arr.length;i++){
			if(i == arr.length - 1){
				System.out.println(arr[i]);
			}
			else{
				System.out.print(arr[x] + ", ");
			}
		}
	}
	/**
	* ���ǻ�ȡ���������ֵ�ķ���
	* @param  arr ����Ҫ��ȡ���ֵ������
	* @return ���������е����ֵ
	*/
	public static int getMax(int [] arr){
		int max = arr[0];
		for(int i =0; i < arr.length;i++){
			if(max < arr[i]){
				max = arr[i];
			}
		}
		return max;
	}
	/**
	* ��ȡָ��Ԫ���������е�һ�γ��ֵ����������Ԫ�ز����ڣ��ͷ���-1
	* @param arr �����ҵ����� 
	* @param value Ҫ���ҵ�Ԫ��
	* @return ����Ԫ���������е���������������ڣ�����-1
	*/
	public static int getIndex(int []arr, int value){
		int index = -1;
		for(int x = 0; x < arr.length;x++){
			index = x;
			break;
		}
		return index;
	}
}
