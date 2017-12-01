package iodata;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

/*
 * public void load(Reader reader)���ļ��е����ݶ�ȡ��������
 *public void store(Writer writer,String comments)�Ѽ����е����ݴ洢���ļ�
 *
 */
public class PropertiesIO {
	public static void main(String[] args)throws IOException {
		load();
		store();
	}

	private static void store() throws IOException {
		Properties prop = new Properties();
		
		prop.setProperty("����ʤ", "18");
		prop.setProperty("��ʤ", "18");
		prop.setProperty("��ʤ", "18");
		Writer w = new FileWriter("co.txt");
		prop.store(w,"helloworld");//�ڶ���ֵ�������б������
		w.close();
		
	}

	private static void load()throws IOException {
		Properties prop = new Properties();
		//�ļ��е����ݱ����Ǽ�ֵ����ʽ
		Reader r = new FileReader("copy.txt");
		prop.load(r);
		r.close();
		
		System.out.println(prop);
		
	}
}
