package regex;

import java.util.Arrays;

public class RegexTest {
public static void main(String[] args) {
	String s ="91 27 46 38 50";
	String[]arr = s.split(" ");
	
	int[]ar=new int[arr.length];
	
	//把字符串数组转换为int数组
	for(int x = 0;x<arr.length;x++) {
		ar[x]=Integer.parseInt(arr[x]);
	}
	Arrays.sort(ar);
	
	//排序后的int数组再组装成一个字符串
	StringBuilder sb = new StringBuilder();
	for(int x = 0;x<ar.length;x++) {
		sb.append(ar[x]).append(" ");
	}
	String result = sb.toString().trim();
	System.out.println(result);
	
}
}
