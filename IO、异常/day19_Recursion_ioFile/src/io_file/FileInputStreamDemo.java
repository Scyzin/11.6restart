package io_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 字节输入流操作步骤：
 * 		创建字节输入流对象
 * 		调用read()方法读取数据
 * 		释放资源
 * 
 * read() 	如果已到达文件末尾，则返回数字-1。
 * 
 * 
 * read(byte[] b) 
 * 
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {

		FileInputStream a = new FileInputStream("fox.txt");

		//有换行  \r\n等于两个字节
		/*
		 * System.out.println(a.read()+" " + (char)a.read());
		 * System.out.println(a.read()+" " + (char)a.read());
		 * System.out.println(a.read()+" " + (char)a.read());
		 * System.out.println(a.read()+" " + (char)a.read());
		 * System.out.println(a.read()+" " + (char)a.read());
		 * System.out.println(a.read()+" " + (char)a.read());
		 */

		/*
		 * int by = a.read();
		 *  while (by != -1) 
		 *  { System.out.print((char) by);
		 *   by =a.read(); 
		 *   }
		 */
		
		//如果是读取java文件，里面有中文，读取会出错。所以采用字符流。
		int by = 0;
		while ((by = a.read()) != -1) {
			System.out.print((char) by);
		}

		a.close();
	}
}
