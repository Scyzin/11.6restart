package test需要多看;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFoldersDemo {
	public static void main(String[] args) throws IOException{
		// 封装数据域和目的地
		File srcFile = new File("E:\\java 视频\\传智播客_2015年Java基础视频-深入浅出精华版\\day21\\day21\\code\\demos");
		//如果是自己指定了一个文件夹，则要先判断文件夹是否存在。不存在，要先
		//创建，否则会出错。
		File destFile = new File("e:\\");

		copyFolder(srcFile, destFile);
	}

	private static void copyFolder(File srcFile, File destFile) throws IOException{
		if (srcFile.isDirectory()) {
			//如果file是文件夹，则要创建目录。
			File newFolder = new File(destFile, srcFile.getName());
			newFolder.mkdir();

			File[] fileArray = srcFile.listFiles();
			for (File file : fileArray) {
				copyFolder(file, newFolder);
			}
		} else {
			File newFile = new File(destFile, srcFile.getName());
			copyFile(srcFile, newFile);
		}
	}

	private static void copyFile(File srcFile, File newFile)throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream bos  = new BufferedOutputStream(new FileOutputStream(newFile));
		
		byte [] a = new byte[1024];
		int len = 0;
		while((len=bis.read(a)) != -1) {
			bos.write(a,0,len);
			bos.flush();
		}
		bis.close();
		bos.close();
	}
}
