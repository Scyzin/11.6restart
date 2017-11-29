package recursion;

import java.io.File;
/*
 * 遍历某个目录下的所有java文件。 
 * 
 */
public class RecursionFileDemo {
	public static void main(String[] args) {

		File file = new File("E:\\java 视频\\11.6 java");

		getAllJavaFilePaths(file);
	}

	public static void getAllJavaFilePaths(File file) {
		File[] a = file.listFiles();
		for (File s : a) {
			// 判断file是否为文件夹
			if (s.isDirectory()) {
				getAllJavaFilePaths(s);
			} else {
				// 判断是否以java结尾
				if (s.getName().endsWith(".java")) {
					// 输出文件夹的绝对路径
					System.out.println(s.getAbsolutePath());
				}
			}
 		}
	}
}
