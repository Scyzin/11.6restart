package io_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * ʵ�����ݻ��У�
 * 			windows \r\n    mac \r	linux \n
 * 
 * 		ϵͳֻ��ʶ���Դ��Ļ��б�ʶ�������߼���� �Ƕ����Եġ�
 * 
 * ׷��д�롣
 * 		FileOutputStream(File file, boolean append) 

 */
public class FileOutputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		//�����ֽ����������
		//����һ����ָ�� File �����ʾ���ļ���д�����ݵ��ļ��������
		//�ڶ���������true����ʾд���ļ�ĩβ����������ļ���ͷд��
		FileOutputStream a = new FileOutputStream("fox.txt",true);
		
		for(int x =0; x <10;x++) {
			a.write(("hello" +x).getBytes());
			a.write(("\r\n").getBytes());
		}
		a.close();
			
	}
}
