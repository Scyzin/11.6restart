package file;

import java.io.File;

/*
 * public boolean isDirectory()  �Ƿ���Ŀ¼
	public boolean isFile()  �Ƿ����ļ�
	public boolean exists()	�Ƿ����
	public boolean canRead()  ���Զ���
	public boolean canWrite()	����д��
	public boolean isHidden()	�Ƿ����أ�
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
