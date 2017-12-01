package iodata;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/*
 * 内存操作流：用于处理临时存储信息的，程序结束，数据就从内存中消失。
 * 			不需要close，查看源码已经知道close里面没东西
 * 操作字节数组
 *		ByteArrayInputStream
 *		ByteArrayOutputStream
 *操作字符数组
 *		CharArrayReader
 *		CharArrayWriter		用来存储中文的
 *操作字符串
 *		StringReader	
 *		StringWriter
 */
public class ByteArrayStreamDemo {
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		for(int x= 0; x < 10; x++) {
			baos.write(("hello" +x).getBytes());
		}
		
		byte[] bys =baos.toByteArray();
		
		ByteArrayInputStream bais = new ByteArrayInputStream(bys);
		int by = 0;
		while((by=bais.read())!=-1) {
			System.out.print((char)by);
			System.out.println();
		}
		
	}
}