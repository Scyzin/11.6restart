package io_file;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * �ֽ��������������裺
 * 		�����ֽ�����������
 * 		����read()������ȡ����
 * 		�ͷ���Դ
 * 
 * һ�ζ�ȡһ�����飺
 * 		int read(byte[] b)  �Ӵ��������н���� b.length ��
 * 					�ֽڵ����ݶ���һ�� byte �����С�		�����ļ�ĩβ����-1
 * 		int��ֵΪʵ�ʶ�ȡ���ֽ�����
 * 
 * ÿ�ζ�ȡ������ݣ��ȿ�ʼ��Ч�ʸߺܶ౶��
 * 
 */

public class FileInputStreamDemo2 {
	public static void main(String[] args) throws IOException {

		FileInputStream a = new FileInputStream("b.txt");

		/*byte[] bys = new byte[5];
		int len = a.read(bys);
		System.out.print(new String(bys,0,len));
		
		len = a.read(bys);

		System.out.print(new String(bys,0,len));

		len = a.read(bys);
		System.out.print(new String(bys,0,len));
		
		len = a.read(bys);
		System.out.print(new String(bys,0,len));*/
		/*
		 * 5 hello 5 0 wo 5 rld
		 * 0������\r\n    ���һ�ζ�ȡʱ�����5���ֽڶ�ȡ����ͷ��ʼ��
		 * 			�еĵط��򸲸ǵ����ڶ��εġ� 
		 */
		
		//����1024����Ϊ�պõ���1K��
		byte [] bts = new byte[1024];
		int len = 0;
		while((len = a.read(bts)) != -1) {
			System.out.println(new String(bts,0,len));
		}
		
		a.close();
	}
}
