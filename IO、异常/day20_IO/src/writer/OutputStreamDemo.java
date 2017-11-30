package writer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 *	 public OutputStreamWriter(OutputStream out,
                          String charsetName)	创建使用指定字符集的。
 *	 public OutputStreamWriter(OutputStream out)
 *		创建使用默认字符编码的 OutputStreamWriter。 
 *字符流=字节流+编码表
 * 
 */
public class OutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"));
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"),"GBK");
		
		osw.write("中国你好");
		
		//读写程序得用同一个编码表。
		osw.close();
	}
}
 