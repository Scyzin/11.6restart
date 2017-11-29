package io_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
/*
 * 复制文件要写入
 *
 * 数据来源：读入数据		fileinputstream
 * 目的地：写入数据		fileoutputstream
 * 
 */
public class FileaIOExample2 {
	public static void main(String[] args) throws Exception{
		FileInputStream a = new FileInputStream("E:\\java 视频\\11.6 java\\数组的静态初始化及内存图.bmp");
		FileOutputStream b = new FileOutputStream("mx.bmp");
		
		byte [] c = new byte[1024];
		int len = 0;
		while((len = a.read(c)) != -1) {
			//要写入
			b.write(c,0,len);
			System.out.println(new String(c,0,len));
		}
		a.close();
		b.close();
	}
}
