package io_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * IO流的分类：
 * 数据类型：
 * 			字节流
 * 				字节输入流	读取数据	InputStream
 * 				字节输出流	写出数据	OutputStream
 * 			字符流
 * 				字符输入流	读取数据	Reader
 * 				字符输出流	写出数据	Writer
 * 
 * 		XxxOutputStream
 * 		XxxInputStream
 * 		XxxReader
 * 		XxxWriter
 * 
 * 		FileOutputStream(File file) 
 *		FileOutputStream(String name)
 *	//字节流
 *		write(byte[] b) 
 *		write(byte[] b, int off, int len) 
 *		write(int b) 
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {

		// File file = new File("fos.txt");
		// FileOutputStream fo = new FileOutputStream(file);
		//上面两部等价于下面这个。
		//写的时候会直接创建这个文件
		FileOutputStream fos = new FileOutputStream("fos.txt");
		/*	字节输出流
		 *  系统创建文件，创建对象，将对象指向这个文件
		 */
		
		//写数据。
		byte[] bys = {97,98,98,99,100,111};
		fos.write(bys,1,3);
		
		fos.write("hello.java".getBytes());
		//关闭文件输出流，释放资源。    不关闭，则会发生错误。
		fos.close();
		//让对象变成垃圾，这样可以被垃圾回收器回收
		//通知系统去释放跟文件相关的资源
		
		
		
	}
}
