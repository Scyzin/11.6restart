package test需要多看;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

/*
 * 需求：复制指定目录下的指定文件，并修改后缀名。
 * 指定的文件是：.java文件。
 * 指定的后缀名是：.jad
 * 指定的目录是：jad
 * 
 * 数据源：e:\\java\\A.java
 * 目的地：e:\\jad\\A.jad
 * 
 * 分析：
 * 		A:封装目录
 * 		B:获取该目录下的java文件的File数组
 * 		C:遍历该File数组，得到每一个File对象
 * 		D:把该File进行复制
 * 		E:在目的地目录下改名
 */
public class CopyAndRenameDemo {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		File srcFolder = new File("e:\\java");
		File destFolder = new File("e:\\jad");
		if (!destFolder.exists()) {
			destFolder.mkdir();
		}
		// 获取该目录下的java文件的File数组
		File[] file = srcFolder.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return new File(dir, name).isFile() && name.endsWith(".java");
			}
		});
		
		//遍历文件对象
		for (File f : file) {
			File newFile = new File(destFolder, f.getName());
			copyFile(f, newFile);
		}
		//文件重命名
		File[] destFileArray = destFolder.listFiles();
		for (File destFile : destFileArray) {
			String name = destFile.getName();
			String newName = name.replace(".java", ".jad");
			File newFile = new File(destFolder, newName);
			destFile.renameTo(newFile);
		}

		long end = System.currentTimeMillis();
		System.out.println("共耗时" + (end - start) + "毫秒");

	}

	private static void copyFile(File f, File newFile) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}
		bos.close();
		bis.close();

	}
}
