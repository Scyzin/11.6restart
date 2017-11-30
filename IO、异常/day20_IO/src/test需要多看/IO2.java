package test需要多看;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * 常见的操作都是使用本地默认编码，所以，不用指定编码。
 * 而转换流的名称有点长，所以，Java就提供了其子类供我们使用。
 * OutputStreamWriter = FileOutputStream + 编码表(GBK)
 * FileWriter = FileOutputStream + 编码表(GBK)
 * 
 * InputStreamReader = FileInputStream + 编码表(GBK)
 * FileReader = FileInputStream + 编码表(GBK)
 * 
 * FileReader(File file) 
 * FileReader(String fileName) 
 * 
 * 	file reader  22毫秒
 /*
 */
public class IO2 {
public static void main(String[] args) throws IOException{
	long start = System.currentTimeMillis();
	FileReader ir = new FileReader("a.txt");
	FileWriter ow = new FileWriter("b.txt");
	
	//方式1
	int ch = 0;
	while((ch=ir.read()) !=-1){
		ow.write((char)ch);
	}
	/*
	char[] a = new char[1024];
	int len = 0;
	while((len =isr.read(a))!= -1) {
		osw.write(a,0,len);
		osw.flush();
	}*/
	ir.close();
	ow.close();
	long end = System.currentTimeMillis();
	System.out.println("持续时间：" + (end - start ) +"毫秒");
}
}
