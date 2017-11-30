package test��Ҫ�࿴;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���Ƶ����ļ���
 * 
 * ��װĿ¼����ȡĿ¼������file���飬��������õ�file���󣬰�file���и��ơ�
 * 
 */
public class CopyFolderDemo {
	public static void main(String[] args) throws IOException{
		long start = System.currentTimeMillis();
		File srcFolder = new File("e:\\demo");
		File destFolder = new File("e:\\test");
		if(!destFolder.exists()) {
			destFolder.mkdir();
		}
		File[] file = srcFolder.listFiles();
		for(File f:file) {
			File newFile = new File(destFolder, f.getName());
			copyFile(f,newFile);
		}
		long end = System.currentTimeMillis();
		System.out.println("����ʱ" + (end - start) + "����");
		//����ʱ217����
	}
	private static void copyFile(File f, File newFile)throws IOException {
		BufferedInputStream br = new BufferedInputStream(new FileInputStream(f));
		BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream(newFile));
		
		byte[] a = new byte[1024];
		int len = 0;
		while((len = br.read(a))!= -1) {
			bw.write(a,0,len);
		}
		br.close();
		bw.close();
	}
}
