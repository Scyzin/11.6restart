package writer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * 写数据方法
 *public void write(int c)
 *public void write(char[] cbuf)
 *public void write(char[] cbuf,int off,int len)
 *public void write(String str)
 *public void write(String str,int off,int len)
 * 
 */
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException{
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"));
		
		//第一个写不进去，因为一个字符等于2个字节/文件数据储存的基本单位是字节。
		osw.write(97);
		
		char[] a = {'a','b','c','d','\n'};
		osw.write(a);
		osw.write(a,1,2);
		osw.write("我是字符串\n");
		osw.write("我是字符串\n",1,3);
		
		//刷新缓冲区，流对象可以继续使用。
		osw.flush();
		
		//关闭流，但先刷新一次缓冲区。关闭后，流对象无法再使用了。
		osw.close();
	}
}
