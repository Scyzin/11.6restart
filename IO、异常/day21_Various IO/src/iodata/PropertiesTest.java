package iodata;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

/*
 * 我有一个文本文件(user.txt)，我知道数据是键值对形式的，但是不知道内容是什么。
 * 请写一个程序判断是否有“lisi”这样的键存在，如果有就改变其实为”100”
 * 
 * 加载
 * 遍历
 * 保存
 */
public class PropertiesTest {
	public static void main(String[] args) throws IOException{
		Properties prop = new Properties();
		Reader r = new FileReader("co.txt");
		prop.load(r);
		r.close();
		
		Set<String> set = prop.stringPropertyNames();
		for(String key :set) {
			if("lisi".equals(key)) {
				prop.setProperty(key, "100");
				break;
			}
		}
		
		Writer w = new FileWriter("co.txt");
		prop.store(w, null);
		w.close();
	}
}
