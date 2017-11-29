package io_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * IO���ķ��ࣺ
 * �������ͣ�
 * 			�ֽ���
 * 				�ֽ�������	��ȡ����	InputStream
 * 				�ֽ������	д������	OutputStream
 * 			�ַ���
 * 				�ַ�������	��ȡ����	Reader
 * 				�ַ������	д������	Writer
 * 
 * 		XxxOutputStream
 * 		XxxInputStream
 * 		XxxReader
 * 		XxxWriter
 * 
 * 		FileOutputStream(File file) 
 *		FileOutputStream(String name)
 *	//�ֽ���
 *		write(byte[] b) 
 *		write(byte[] b, int off, int len) 
 *		write(int b) 
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {

		// File file = new File("fos.txt");
		// FileOutputStream fo = new FileOutputStream(file);
		//���������ȼ������������
		//д��ʱ���ֱ�Ӵ�������ļ�
		FileOutputStream fos = new FileOutputStream("fos.txt");
		/*	�ֽ������
		 *  ϵͳ�����ļ����������󣬽�����ָ������ļ�
		 */
		
		//д���ݡ�
		byte[] bys = {97,98,98,99,100,111};
		fos.write(bys,1,3);
		
		fos.write("hello.java".getBytes());
		//�ر��ļ���������ͷ���Դ��    ���رգ���ᷢ������
		fos.close();
		//�ö������������������Ա���������������
		//֪ͨϵͳȥ�ͷŸ��ļ���ص���Դ
		
		
		
	}
}
