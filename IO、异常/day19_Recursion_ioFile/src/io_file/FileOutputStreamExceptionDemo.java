package io_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExceptionDemo {
	public static void main(String[] args) {

		FileOutputStream a = null;

		try {
			a = new FileOutputStream("z:\\fox.txt");
			a.write("java".getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			if (a != null) {
				try {
					a.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
