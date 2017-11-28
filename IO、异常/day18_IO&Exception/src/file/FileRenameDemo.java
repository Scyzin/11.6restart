package file;

import java.io.File;
import java.io.IOException;

/*
 * public boolean renameTo(File dest)  重新命名此抽象路径名表示的文件。
 * 
 * 		路径名相同，则为改名。   不同则为改名+剪切。
 * 
 * 		路径以盘符开始：  绝对路径 c:\\a.text
 * 		不以盘符开始：   a.text
 */
public class FileRenameDemo {
	public static void main(String[] args) throws IOException {

		File file = new File("a.text");
		File file2 = new File("e:\\b.text");

		System.out.println("creat" + file.createNewFile());
		System.out.println("rename:" + file.renameTo(file2));

	}
}
