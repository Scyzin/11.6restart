package iodata;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

/*
 * public void load(Reader reader)把文件中的数据读取到集合中
 *public void store(Writer writer,String comments)把集合中的数据存储到文件
 *
 */
public class PropertiesIO {
	public static void main(String[] args)throws IOException {
		load();
		store();
	}

	private static void store() throws IOException {
		Properties prop = new Properties();
		
		prop.setProperty("陈遵胜", "18");
		prop.setProperty("陈胜", "18");
		prop.setProperty("遵胜", "18");
		Writer w = new FileWriter("co.txt");
		prop.store(w,"helloworld");//第二个值是属性列表的描述
		w.close();
		
	}

	private static void load()throws IOException {
		Properties prop = new Properties();
		//文件中的数据必须是键值对形式
		Reader r = new FileReader("copy.txt");
		prop.load(r);
		r.close();
		
		System.out.println(prop);
		
	}
}
