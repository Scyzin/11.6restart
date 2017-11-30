package test需要多看;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
/*
 * 已知s.txt文件中有这样的一个字符串：“hcexfgijkamdnoqrzstuvwybpl”
 * 请编写程序读取数据内容，把数据排序后写入ss.txt中。
 */
public class SearchDemo {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
		
		//读取一行
		String line =br.readLine();
		
		br.close();
		//字符串转换成数组
		char[]chs = line.toCharArray();
		//数组排序
		Arrays.sort(chs);
		
		//数组转换成字符串
		String s = new String(chs);
		bw.write(s);
		bw.flush();
		bw.close();
		
		//如何确定字符是啥数值？
		// System.out.println('\r' + 0); // 13
		// System.out.println('\n' + 0);// 10
	}
}
