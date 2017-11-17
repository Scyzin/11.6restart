package stringBuffer;
/*
 * 字符串反转
 * 数组拼接成字符串
 * 
 */
public class StringBufferTest {
	public static void main(String[] args) {
	
		/*	字符串反转
		 * String s = "Hello";
		StringBuffer s1 = new StringBuffer(s);
		s1.append("world");
		s1.reverse();

		// String s2 = new String(s1);
		// 通过String(StringBuffer)
		// 通过toString()
		String s2 = s1.toString();
		简易做法:s3 = new StringBuffer(s).reverse().toString();
		System.out.println("反转后的字符串为" + s2);*/
		
		
		int [] arr = {'a','b','c','d'};
		String s = arrayToString(arr);
		System.out.println("数组拼接成的字符串为" + s);
	}
		
		//数组拼接成字符串
		public static String arrayToString(int[]arr) {
			StringBuffer s =new StringBuffer();
			s.append("[");
			for (int i = 0; i < arr.length ; i++) {
				if (i == arr.length - 1) {
					s.append(arr[i]);
				} else {
					s.append(arr[i]).append(", ");
				}
			}
			s.append("]");
			return s.toString();
		}
}
