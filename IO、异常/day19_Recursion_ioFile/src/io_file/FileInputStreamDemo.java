package io_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * �ֽ��������������裺
 * 		�����ֽ�����������
 * 		����read()������ȡ����
 * 		�ͷ���Դ
 * 
 * read() 	����ѵ����ļ�ĩβ���򷵻�����-1��
 * 
 * 
 * read(byte[] b) 
 * 
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {

		FileInputStream a = new FileInputStream("fox.txt");

		//�л���  \r\n���������ֽ�
		/*
		 * System.out.println(a.read()+" " + (char)a.read());
		 * System.out.println(a.read()+" " + (char)a.read());
		 * System.out.println(a.read()+" " + (char)a.read());
		 * System.out.println(a.read()+" " + (char)a.read());
		 * System.out.println(a.read()+" " + (char)a.read());
		 * System.out.println(a.read()+" " + (char)a.read());
		 */

		/*
		 * int by = a.read();
		 *  while (by != -1) 
		 *  { System.out.print((char) by);
		 *   by =a.read(); 
		 *   }
		 */
		
		//����Ƕ�ȡjava�ļ������������ģ���ȡ��������Բ����ַ�����
		int by = 0;
		while ((by = a.read()) != -1) {
			System.out.print((char) by);
		}

		a.close();
	}
}
