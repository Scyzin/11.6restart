package stringBuffer;
/*
 * 
 * �ַ����е��ַ���������
 * 
 * 
 */
public class StringSort {
	public static void main(String[] args) {
		String s= "dacgebf";
		
		char[] chs = s.toCharArray();

		maopaoArray(chs);
		System.out.println(String.valueOf(chs));
	}
	//ð������
	public static void maopaoArray(char []arr) {
		for(int j =0;j<arr.length-1;j++) {
			for(int i = 0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					char temp= arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
}
