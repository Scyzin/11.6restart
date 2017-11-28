package file;

import java.io.File;

/*
 * public boolean isDirectory()  是否是目录
	public boolean isFile()  是否是文件
	public boolean exists()	是否存在
	public boolean canRead()  可以读？
	public boolean canWrite()	可以写？
	public boolean isHidden()	是否隐藏？
 * 
 */
public class FileBooleanDemo {
	public static void main(String[] args) {
		
		 File file = new File("a.text");
		 
		 System.out.println("isDirectory: " + file.isDirectory());
		 System.out.println("isFile:" + file.isFile());
		 System.out.println("exitsts:" + file.exists());
		 System.out.println("canRead:" +file.canRead());
		 System.out.println("canWrite:" +file.canWrite());
		 System.out.println("isHidden:" +file.isHidden());
	}
}
