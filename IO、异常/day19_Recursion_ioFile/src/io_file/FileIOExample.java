package io_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * �����ı��ļ���	ͼƬ��MP4Ҳ���Ը��Ƶġ�
 * 
 * ������Դ����������		fileinputstream
 * Ŀ�ĵأ�д������		fileoutputstream
 * 
 * Ϊɶ�����ֵ�д�벻�����
 * 		��Ӣ�ĺ�����ת��������Ӧ��ascii�룬���ĵ�һ���ֽ�Ϊ������
 * 		����ƴ�ӳ����ġ�Ӣ��Ϊ������
 * 
 *����Ǵ�һ���̷ɵ���һ���̣������ļ�����ʱ����Ҫ�����̷���
 *
 *�ֽ��� ���ƣ�  ѭ��̫����ˣ�������ռ��Դ��
 */
public class FileIOExample {
	public static void main(String[] args) throws IOException {
		FileInputStream a = new FileInputStream("E:\\java ��Ƶ\\11.6 java\\����ľ�̬��ʼ�����ڴ�ͼ.bmp");
		FileOutputStream b = new FileOutputStream("m.bmp");
		
		int by =0;
		while((by = a.read())!= -1){
			b.write(by);
		}
		
		a.close();
		b.close();
	}
}
