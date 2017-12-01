package iodata;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

/*
 * ����һ���ı��ļ�(user.txt)����֪�������Ǽ�ֵ����ʽ�ģ����ǲ�֪��������ʲô��
 * ��дһ�������ж��Ƿ��С�lisi�������ļ����ڣ�����о͸ı���ʵΪ��100��
 * 
 * ����
 * ����
 * ����
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
