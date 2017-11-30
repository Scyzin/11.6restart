package writer;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * 字节流操作中文不方便，于是字符流就出来了
 * 字符流=字节流+编码表。
 * 
 * 编码表由字符及其对应的数值组成的一张表。
 * 
 * GBK：中国的
 * ASCII：美国的，用一个字节的7位表示。
 * Unicode：国际标准码，融合了多种文字。
 * 
 * 每个地区都有自己相应的编码表，UTF-8 拥有国际通用的的最广的表。
 * 最多用3个字节表示一个字符。
 * 
 * String(byte[] bytes, String charsetName) 
          通过使用指定的 charset 解码指定的 byte 数组，构造一个新的 String。
 * byte[] getBytes(Charset charset) 
          使用给定的 charset 将此 String 编码到 byte 序列，并将结果存储到新的 byte 数组。 
 *        编码：把看的懂的变成看不懂的	string - byte[]
 *        解码：把看不懂的变成看的懂的	byte[] - string
 *      只要编码、解码的格式一致，就不会出问题。
 */
public class StringStreamDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = new String("你好");
		byte[]a = s.getBytes();
		//byte[]a = s.getBytes("GBK");
		//byte[]a = s.getBytes("UTF-8");
		System.out.println(Arrays.toString(a));
		
		//String ss = new String(a);
		String ss = new String(a,"GBK");
		//String ss = new String(a,"UTF-8");
		System.out.println(ss);
		
	}
}
