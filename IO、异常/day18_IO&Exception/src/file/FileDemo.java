package file;

import java.io.File;
import java.io.IOException;

/*
 * File:文件和目录路径名的抽象表示形式。 
 *构造方法:
 *		 File(String pathname) 根据一个路径得到file对象
 * 		 File(String parent, String child) 	根据目录和一个子文件/目录，得到file对象
 *		  File(File parent, String child)  根据一个父file对象和一个子文件/目录
 * 
 * 创建功能
	public boolean createNewFile()	创建指定文件
	public boolean mkdir() 创建抽象名路径指定目录，如果存在就不创建
 	public boolean mkdirs()  创建文件夹，创建多个目录，链式的。  不能创建文件。
 *
 *  要在某个地方创建某个文件、目录，那么必须先创建该目录。	
 */
public class FileDemo {
	public static void main(String[] args) throws IOException {
		
			//在e盘创建一个文件夹
			File file  = new File("E:\\java");
			System.out.println("mkdir:" + file.mkdir());
			
			//在目录下创建一个文件
			File file2  = new File("E:\\java\\a.text");
			System.out.println("creat:" +file2.createNewFile());
			
			//在e盘创建一个目录，在目录下创建一个目录
			File file3 = new File("E:\\java\\java\\jvaa");
			System.out.println("mkdirs:" + file3.mkdirs());
			
			
		// File file2 = new File("E:\\\\","java 视频");
		//
		// File file3 = new File(file2,"java视频");
	}	
}
