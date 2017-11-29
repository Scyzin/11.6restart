package io_file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 字节缓冲输出流	写数据
 * BufferedOutputStream
 * 字节缓冲输入流	读数据
 * BufferedInputStream
 *
 * 缓冲区可以指定大小.
 * 这个缓冲区只是为了高效而设计的，真正的读写操作，还得依靠流对象实现。
 * 
 * 一个文件，只能用一种方式读取，因为读取了一次后，就到了末尾。
 */
public class BufferOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		
		//匿名对象调用
		BufferedOutputStream a = new BufferedOutputStream(
				new FileOutputStream("c.txt"));
		
		a.write("hellojava".getBytes());
		
		a.close();
		
		BufferedInputStream b= new BufferedInputStream(new FileInputStream("a.txt"));
		byte [] bys = new byte[1024];
		int len = 0;
		while((len = b.read(bys)) != -1) {
			System.out.println(new String(bys,0,len));
		}
	}
}
