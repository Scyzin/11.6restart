package file;

import java.io.File;import java.io.FileFilter;
import java.io.FilenameFilter;

/*
 * 判断文件夹下是否有后缀名为.bmp的文件，并输出
 * 
 * 1.
 * 2.
 * 
 * public String[] list(FilenameFilter filter)	文件名称过滤器
   public File[] listFiles(FilenameFilter filter)
 *
 */
public class FileTestDemo {
	public static void main(String[] args) {
		// 封装e判断目录
		File file = new File("E:\\java 视频\\11.6 java");

		// 获取该目录下所有文件或者文件夹的file数组
		File[] fi = file.listFiles();

		// 遍历file数组，得到每一个File对象，然后判断
		for (File s : fi) {
			if (s.isFile()) {

				// 判断是否以.bmp结尾
				if (s.getName().endsWith(".bmp")) {
					System.out.println(s.getName());
				}
			}
		}
		System.out.println("-----");
		
		String[] f2 = file.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {

				return new File(dir, name).isFile() && name.endsWith(".bmp");
			}
		});
		//遍历
		for (String s1 : f2) {
			System.out.println(s1);
		}
		
	
		
	}
}
