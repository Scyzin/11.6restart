package io_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
/*
 * �����ļ�Ҫд��
 *
 * ������Դ����������		fileinputstream
 * Ŀ�ĵأ�д������		fileoutputstream
 * 
 */
public class FileaIOExample2 {
	public static void main(String[] args) throws Exception{
		FileInputStream a = new FileInputStream("E:\\java ��Ƶ\\11.6 java\\����ľ�̬��ʼ�����ڴ�ͼ.bmp");
		FileOutputStream b = new FileOutputStream("mx.bmp");
		
		byte [] c = new byte[1024];
		int len = 0;
		while((len = a.read(c)) != -1) {
			//Ҫд��
			b.write(c,0,len);
			System.out.println(new String(c,0,len));
		}
		a.close();
		b.close();
	}
}
