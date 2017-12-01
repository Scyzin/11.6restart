package iodata;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

public class PropertiesTest2 {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		Reader r = new FileReader("count.txt");
		prop.load(r);
		r.close();

		String value = prop.getProperty("count");
		int number = Integer.parseInt(value);

		if (number >5) {
			System.out.println("游戏已经结束，请付费");
			System.exit(0);
		} else {
			number++;
			prop.setProperty("count", String.valueOf(number));
			Writer w = new FileWriter("count.txt");
			prop.store(w, null);
			w.close();
			GuessNumber.start();
		}
	}
}
