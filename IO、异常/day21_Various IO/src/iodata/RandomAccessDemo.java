package iodata;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * �����������
 * 		RandomAccessFile�಻����������Object������ࡣ
 * 		�����ں���InputStream��OutputStream�Ĺ��ܡ�
 * 		֧�ֶ��ļ���������ʶ�ȡ��д�롣
 * 
 * public RandomAccessFile(String name,String mode)����һ���������ļ�·�����ڶ��������ǲ����ļ���ģʽ��
 * 		ģʽ�����֣�������õ�һ�ֽ�"rw",���ַ�ʽ��ʾ�Ҽȿ���д���ݣ�Ҳ���Զ�ȡ���� 
 *		
 *		�ļ�ָ�����ͨ�� getFilePointer������ȡ����ͨ�� seek �������á�
 */
public class RandomAccessDemo {
	public static void main(String[] args) throws IOException{
		write();
		read();
	}

	private static void read() throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");

		int i = raf.readInt();
		System.out.println(i);
		// ���ļ�ָ�����ͨ�� getFilePointer������ȡ����ͨ�� seek �������á�
		//4��int ������4���ֽ�
		System.out.println("��ǰ�ļ���ָ��λ���ǣ�" + raf.getFilePointer());

		char ch = raf.readChar();
		System.out.println(ch);
		//6��char  2���ֽ�
		System.out.println("��ǰ�ļ���ָ��λ���ǣ�" + raf.getFilePointer());

		String s = raf.readUTF();
		System.out.println(s);
		// 6 + 2 +2*3 =14 
		System.out.println("��ǰ�ļ���ָ��λ���ǣ�" + raf.getFilePointer());

		// �Ҳ�����ͷ��ʼ�ˣ��Ҿ�Ҫ��ȡa����ô����?
		raf.seek(4);
		ch = raf.readChar();
		System.out.println(ch);
		
	}

	private static void write() throws IOException{
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
		
		raf.writeInt(100);
		raf.writeChar('a');
		raf.writeUTF("�й�");

		raf.close();
	}
}
