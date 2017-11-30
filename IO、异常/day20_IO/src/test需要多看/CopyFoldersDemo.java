package test��Ҫ�࿴;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFoldersDemo {
	public static void main(String[] args) throws IOException{
		// ��װ�������Ŀ�ĵ�
		File srcFile = new File("E:\\java ��Ƶ\\���ǲ���_2015��Java������Ƶ-����ǳ��������\\day21\\day21\\code\\demos");
		//������Լ�ָ����һ���ļ��У���Ҫ���ж��ļ����Ƿ���ڡ������ڣ�Ҫ��
		//��������������
		File destFile = new File("e:\\");

		copyFolder(srcFile, destFile);
	}

	private static void copyFolder(File srcFile, File destFile) throws IOException{
		if (srcFile.isDirectory()) {
			//���file���ļ��У���Ҫ����Ŀ¼��
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
