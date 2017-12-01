package iodata;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/*
 * public SequenceInputStream(InputStream s1,InputStream s2)通过记住这两个参数来初始化新创建的 SequenceInputStream（将按顺序读取这两个参数，先读取 s1，然后读取 s2），
 * 			以提供从此 SequenceInputStream 读取的字节。 
 * 将两个文件的内容复制到第三个文件中
 * 
 * SequenceInputStream(Enumeration<? extends InputStream> e) 
 * 
 */
public class SequenceInputStreamDemo {
	public static void main(String[] args) throws IOException {
		
		/*InputStream s1 = new FileInputStream("ByteArrayStreamDemo.java");
		InputStream s2 = new FileInputStream("pw.txt");
		//传入的是两个inputstream类型
		SequenceInputStream sis = new SequenceInputStream(s1,s2);
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.txt"));
		
		byte[] bys = new byte[1024];
		int len = 0;
		//读取别忘了字符组。
		while((len = sis.read(bys)) != -1) {
			bos.write(bys,0,len);
		}
		bos.close();
		sis.close();*/
		
		//Enumeration 是vector中的一个方法的返回值。枚举
		Vector<InputStream> v = new Vector<InputStream>();
		
		InputStream s1 = new FileInputStream("ByteArrayStreamDemo.java");
		InputStream s2 = new FileInputStream("pw.txt");
		InputStream s3 = new FileInputStream("copy.txt");
		v.add(s1);
		v.add(s2);
		v.add(s3);
		Enumeration<InputStream> en = v.elements();
		SequenceInputStream sis = new SequenceInputStream(en);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy2.txt"));
		
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = sis.read(bys))!= -1) {
			bos.write(bys,0,len);
		}
		sis.close();
		bos.close();
		
	}
}
