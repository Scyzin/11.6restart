package test��Ҫ�࿴;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * ������ַ��������ļ�
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
