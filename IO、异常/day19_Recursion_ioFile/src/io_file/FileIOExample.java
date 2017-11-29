package io_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * 复制文本文件。	图片和MP4也可以复制的。
 * 
 * 数据来源：读入数据		fileinputstream
 * 目的地：写入数据		fileoutputstream
 * 
 * 为啥中文字的写入不会出错？
 * 		将英文和中文转换成了相应的ascii码，中文第一个字节为负数，
 * 		负数拼接成中文。英文为正数。
 * 
 *如果是从一个盘飞到另一个盘，创建文件对象时候，需要加上盘符。
 *
 *字节流 复制，  循环太多次了，很慢，占资源。
 */
public class FileIOExample {
	public static void main(String[] args) throws IOException {
		FileInputStream a = new FileInputStream("E:\\java 视频\\11.6 java\\数组的静态初始化及内存图.bmp");
		FileOutputStream b = new FileOutputStream("m.bmp");
		
		int by =0;
		while((by = a.read())!= -1){
			b.write(by);
		}
		
		a.close();
		b.close();
	}
}
