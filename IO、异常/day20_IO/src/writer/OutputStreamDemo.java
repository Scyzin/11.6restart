package writer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 *	 public OutputStreamWriter(OutputStream out,
                          String charsetName)	����ʹ��ָ���ַ����ġ�
 *	 public OutputStreamWriter(OutputStream out)
 *		����ʹ��Ĭ���ַ������ OutputStreamWriter�� 
 *�ַ���=�ֽ���+�����
 * 
 */
public class OutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"));
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"),"GBK");
		
		osw.write("�й����");
		
		//��д�������ͬһ�������
		osw.close();
	}
}
 