package test需要多看;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * 特殊的字符流复制文件
 * 
 */
public class IO4 {
	public static void main(String[] args) throws IOException {
		BufferedReader a = new BufferedReader(new FileReader("a.txt"));
		BufferedWriter b = new BufferedWriter(new FileWriter("c.txt"));

		String line = null;
		while ((line = a.readLine()) != null) {
			b.write(line);
			b.newLine();
			b.flush();

		}
		a.close();
		b.close();
	}
}
