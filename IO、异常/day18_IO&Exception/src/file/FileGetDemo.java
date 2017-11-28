package file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/*
 *  public String getAbsolutePath()	��ȡ����·��
	public String getPath()  ��ȡ���·��
	public String getName()  ��ȡ����
	public long length()  ��ȡ�ļ����ȣ� ��С
	public long lastModified()	��ȡ���һ���޸ĵ�ʱ��  ���غ���ֵ 
 * 
 * public String[] list()	��ȡָ��Ŀ¼�����ļ�������ɵ�����
 * public File[] listFiles()	��ȡָ��Ŀ¼�������ļ����ļ�����
 */
public class FileGetDemo {
	public static void main(String[] args) throws IOException {
		
		File file = new File("demo\\a.txt");
		
		System.out.println("getAbsolutePath:" +file.getAbsolutePath());
		System.out.println("getPath:" +file.getPath());
		System.out.println("getName:" + file.getName());
		System.out.println("length:" + file.length());
		System.out.println("lastModified:" + file.lastModified());
		
		Date d = new Date(1511834945606L);
		SimpleDateFormat c = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(c.format(d));
		
		File file2 = new File("e:\\");
		String[]a = file2.list();
		
		File[] b = file2.listFiles();
		
		System.out.println(Arrays.toString(a));
		for (String s : a) {
			System.out.println(s);
		}
		
		//
		for (File s1 : b) {
			System.out.println(s1);
		}
		
		
	}
}
