package regex;

import java.util.Arrays;

public class RegexTest {
public static void main(String[] args) {
	String s ="91 27 46 38 50";
	String[]arr = s.split(" ");
	
	int[]ar=new int[arr.length];
	
	//���ַ�������ת��Ϊint����
	for(int x = 0;x<arr.length;x++) {
		ar[x]=Integer.parseInt(arr[x]);
	}
	Arrays.sort(ar);
	
	//������int��������װ��һ���ַ���
	StringBuilder sb = new StringBuilder();
	for(int x = 0;x<ar.length;x++) {
		sb.append(ar[x]).append(" ");
	}
	String result = sb.toString().trim();
	System.out.println(result);
	
}
}
