package reader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * BufferedWriter  ���⹦�ܣ�void newLine()	д��һ���зָ�����
 * BufferedReader	String readLine()	��ȡһ���ı��С���������ֹ��������ĩβ���򷵻�Null��
 */
public class BufferedDemo {
	public static void main(String[] args) throws IOException {
		write("c.txt");
		read("c.txt");
	}

	private static void read(String name) throws IOException{
		BufferedReader a = new BufferedReader(new FileReader(name));
		/*for(int x = 0; x<10; x++) {
			//һ�ζ�ȡһ���ı���
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
