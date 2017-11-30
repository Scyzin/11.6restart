package test需要多看;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/*
 * ArrayList集合中的字符串数据存储到文本文件s
 * 
 * 从文本文件中读取数据(每一行为一个字符串数据)到集合中，并遍历集合

 * 
 */
public class ArrayListToFile {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("c.txt"));
		ArrayList< String> ar = new ArrayList<String>();
		String line = null;
		while((line = br.readLine()) !=null) {
			ar.add(line);
		}
		br.close();
		for(String s : ar) {
			System.out.println(s);
		}
		
		/*ar.add("hello");
		ar.add("world");
		ar.add("java");
		BufferedWriter bw = new BufferedWriter(new FileWriter("c.txt"));
		for(String s :ar) {
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		bw.close();*/
	}
}
