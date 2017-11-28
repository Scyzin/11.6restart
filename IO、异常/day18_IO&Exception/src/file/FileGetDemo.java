package file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/*
 *  public String getAbsolutePath()	获取绝对路径
	public String getPath()  获取相对路径
	public String getName()  获取名称
	public long length()  获取文件长度？ 大小
	public long lastModified()	获取最后一次修改的时间  返回毫秒值 
 * 
 * public String[] list()	获取指定目录所有文件名字组成的数组
 * public File[] listFiles()	获取指定目录下所有文件的文件对象
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
