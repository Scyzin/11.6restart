package file;

import java.io.File;
import java.io.IOException;

/*
 * File:�ļ���Ŀ¼·�����ĳ����ʾ��ʽ�� 
 *���췽��:
 *		 File(String pathname) ����һ��·���õ�file����
 * 		 File(String parent, String child) 	����Ŀ¼��һ�����ļ�/Ŀ¼���õ�file����
 *		  File(File parent, String child)  ����һ����file�����һ�����ļ�/Ŀ¼
 * 
 * ��������
	public boolean createNewFile()	����ָ���ļ�
	public boolean mkdir() ����������·��ָ��Ŀ¼��������ھͲ�����
 	public boolean mkdirs()  �����ļ��У��������Ŀ¼����ʽ�ġ�  ���ܴ����ļ���
 *
 *  Ҫ��ĳ���ط�����ĳ���ļ���Ŀ¼����ô�����ȴ�����Ŀ¼��	
 */
public class FileDemo {
	public static void main(String[] args) throws IOException {
		
			//��e�̴���һ���ļ���
			File file  = new File("E:\\java");
			System.out.println("mkdir:" + file.mkdir());
			
			//��Ŀ¼�´���һ���ļ�
			File file2  = new File("E:\\java\\a.text");
			System.out.println("creat:" +file2.createNewFile());
			
			//��e�̴���һ��Ŀ¼����Ŀ¼�´���һ��Ŀ¼
			File file3 = new File("E:\\java\\java\\jvaa");
			System.out.println("mkdirs:" + file3.mkdirs());
			
			
		// File file2 = new File("E:\\\\","java ��Ƶ");
		//
		// File file3 = new File(file2,"java��Ƶ");
	}	
}
