package writer;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * �ֽ����������Ĳ����㣬�����ַ����ͳ�����
 * �ַ���=�ֽ���+�����
 * 
 * ��������ַ������Ӧ����ֵ��ɵ�һ�ű�
 * 
 * GBK���й���
 * ASCII�������ģ���һ���ֽڵ�7λ��ʾ��
 * Unicode�����ʱ�׼�룬�ں��˶������֡�
 * 
 * ÿ�����������Լ���Ӧ�ı����UTF-8 ӵ�й���ͨ�õĵ����ı�
 * �����3���ֽڱ�ʾһ���ַ���
 * 
 * String(byte[] bytes, String charsetName) 
          ͨ��ʹ��ָ���� charset ����ָ���� byte ���飬����һ���µ� String��
 * byte[] getBytes(Charset charset) 
          ʹ�ø����� charset ���� String ���뵽 byte ���У���������洢���µ� byte ���顣 
 *        ���룺�ѿ��Ķ��ı�ɿ�������	string - byte[]
 *        ���룺�ѿ������ı�ɿ��Ķ���	byte[] - string
 *      ֻҪ���롢����ĸ�ʽһ�£��Ͳ�������⡣
 */
public class StringStreamDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = new String("���");
		byte[]a = s.getBytes();
		//byte[]a = s.getBytes("GBK");
		//byte[]a = s.getBytes("UTF-8");
		System.out.println(Arrays.toString(a));
		
		//String ss = new String(a);
		String ss = new String(a,"GBK");
		//String ss = new String(a,"UTF-8");
		System.out.println(ss);
		
	}
}
