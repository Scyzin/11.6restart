package io_file;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 字节输入流操作步骤：
 * 		创建字节输入流对象
 * 		调用read()方法读取数据
 * 		释放资源
 * 
 * 一次读取一个数组：
 * 		int read(byte[] b)  从此输入流中将最多 b.length 个
 * 					字节的数据读入一个 byte 数组中。		到达文件末尾，则-1
 * 		int的值为实际读取的字节数。
 * 
 * 每次读取多个数据，比开始的效率高很多倍。
 * 
 */

public class FileInputStreamDemo2 {
	public static void main(String[] args) throws IOException {

		FileInputStream a = new FileInputStream("b.txt");

		/*byte[] bys = new byte[5];
		int len = a.read(bys);
		System.out.print(new String(bys,0,len));
		
		len = a.read(bys);

		System.out.print(new String(bys,0,len));

		len = a.read(bys);
		System.out.print(new String(bys,0,len));
		
		len = a.read(bys);
		System.out.print(new String(bys,0,len));*/
		/*
		 * 5 hello 5 0 wo 5 rld
		 * 0后面是\r\n    最后一次读取时，最后5个字节读取，从头开始，
		 * 			有的地方则覆盖倒数第二次的。 
		 */
		
		//多用1024，因为刚好等于1K。
		byte [] bts = new byte[1024];
		int len = 0;
		while((len = a.read(bts)) != -1) {
			System.out.println(new String(bts,0,len));
		}
		
		a.close();
	}
}
