package file;

import java.io.File;
import java.io.IOException;

/*
 * public boolean renameTo(File dest)  ���������˳���·������ʾ���ļ���
 * 
 * 		·������ͬ����Ϊ������   ��ͬ��Ϊ����+���С�
 * 
 * 		·�����̷���ʼ��  ����·�� c:\\a.text
 * 		�����̷���ʼ��   a.text
 */
public class FileRenameDemo {
	public static void main(String[] args) throws IOException {

		File file = new File("a.text");
		File file2 = new File("e:\\b.text");

		System.out.println("creat" + file.createNewFile());
		System.out.println("rename:" + file.renameTo(file2));

	}
}
