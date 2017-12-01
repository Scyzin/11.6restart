package iodata;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/*
 * �ڴ�����������ڴ�����ʱ�洢��Ϣ�ģ�������������ݾʹ��ڴ�����ʧ��
 * 			����Ҫclose���鿴Դ���Ѿ�֪��close����û����
 * �����ֽ�����
 *		ByteArrayInputStream
 *		ByteArrayOutputStream
 *�����ַ�����
 *		CharArrayReader
 *		CharArrayWriter		�����洢���ĵ�
 *�����ַ���
 *		StringReader	
 *		StringWriter
 */
public class ByteArrayStreamDemo {
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		for(int x= 0; x < 10; x++) {
			baos.write(("hello" +x).getBytes());
		}
		
		byte[] bys =baos.toByteArray();
		
		ByteArrayInputStream bais = new ByteArrayInputStream(bys);
		int by = 0;
		while((by=bais.read())!=-1) {
			System.out.print((char)by);
			System.out.println();
		}
		
	}
}