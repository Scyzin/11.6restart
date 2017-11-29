package io_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * 实现数据换行：
 * 			windows \r\n    mac \r	linux \n
 * 
 * 		系统只能识别自带的换行标识符，而高级软件 是都可以的。
 * 
 * 追加写入。
 * 		FileOutputStream(File file, boolean append) 

 */
public class FileOutputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		//创建字节输出流对象
		//创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
		//第二个参数是true，表示写入文件末尾，否则则从文件开头写起。
		FileOutputStream a = new FileOutputStream("fox.txt",true);
		
		for(int x =0; x <10;x++) {
			a.write(("hello" +x).getBytes());
			a.write(("\r\n").getBytes());
		}
		a.close();
			
	}
}
