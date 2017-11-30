package test��Ҫ�࿴;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

/*
 * ���󣺸���ָ��Ŀ¼�µ�ָ���ļ������޸ĺ�׺����
 * ָ�����ļ��ǣ�.java�ļ���
 * ָ���ĺ�׺���ǣ�.jad
 * ָ����Ŀ¼�ǣ�jad
 * 
 * ����Դ��e:\\java\\A.java
 * Ŀ�ĵأ�e:\\jad\\A.jad
 * 
 * ������
 * 		A:��װĿ¼
 * 		B:��ȡ��Ŀ¼�µ�java�ļ���File����
 * 		C:������File���飬�õ�ÿһ��File����
 * 		D:�Ѹ�File���и���
 * 		E:��Ŀ�ĵ�Ŀ¼�¸���
 */
public class CopyAndRenameDemo {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		File srcFolder = new File("e:\\java");
		File destFolder = new File("e:\\jad");
		if (!destFolder.exists()) {
			destFolder.mkdir();
		}
		// ��ȡ��Ŀ¼�µ�java�ļ���File����
		File[] file = srcFolder.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return new File(dir, name).isFile() && name.endsWith(".java");
			}
		});
		
		//�����ļ�����
		for (File f : file) {
			File newFile = new File(destFolder, f.getName());
			copyFile(f, newFile);
		}
		//�ļ�������
		File[] destFileArray = destFolder.listFiles();
		for (File destFile : destFileArray) {
			String name = destFile.getName();
			String newName = name.replace(".java", ".jad");
			File newFile = new File(destFolder, newName);
			destFile.renameTo(newFile);
		}

		long end = System.currentTimeMillis();
		System.out.println("����ʱ" + (end - start) + "����");

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
