package writer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * д���ݷ���
 *public void write(int c)
 *public void write(char[] cbuf)
 *public void write(char[] cbuf,int off,int len)
 *public void write(String str)
 *public void write(String str,int off,int len)
 * 
 */
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException{
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"));
		
		//��һ��д����ȥ����Ϊһ���ַ�����2���ֽ�/�ļ����ݴ���Ļ�����λ���ֽڡ�
		osw.write(97);
		
		char[] a = {'a','b','c','d','\n'};
		osw.write(a);
		osw.write(a,1,2);
		osw.write("�����ַ���\n");
		osw.write("�����ַ���\n",1,3);
		
		//ˢ�»���������������Լ���ʹ�á�
		osw.flush();
		
		//�ر���������ˢ��һ�λ��������رպ��������޷���ʹ���ˡ�
		osw.close();
	}
}
