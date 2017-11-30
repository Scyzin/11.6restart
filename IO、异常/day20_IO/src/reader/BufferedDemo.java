package reader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * BufferedWriter  特殊功能：void newLine()	写入一个行分隔符。
 * BufferedReader	String readLine()	读取一个文本行。不包含终止符，到达末尾，则返回Null。
 */
public class BufferedDemo {
	public static void main(String[] args) throws IOException {
		write("c.txt");
		read("c.txt");
	}

	private static void read(String name) throws IOException{
		BufferedReader a = new BufferedReader(new FileReader(name));
		/*for(int x = 0; x<10; x++) {
			//一次读取一个文本行
			String line = a.readLine();
			System.out.println(line);
		}
		a.close();*/
		String line = null;
		while((line = a.readLine())!= null) {
			System.out.println(line);
		}
		a.close();
		
	}

	private static void write(String name) throws IOException {
		BufferedWriter a = new BufferedWriter(new FileWriter(name));

		for (int x = 0; x < 10; x++) {
			a.write("hello" + x);
			a.newLine();
			a.flush();
		}
		a.close();

	}

}
