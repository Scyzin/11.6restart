package iodata;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 *  ��׼���������
 * System���е�������Ա������
 *		public static final InputStream in ����׼����������
 * 		public static final PrintStream out ����׼���������
 * 	
 * 		InputStream is =System.in
 * 		OutputStream os = System.out	
 * 
 * 		������IO�����������������������̨��
 *		System.out.println("helloworld");
 *		�ȼ�������ģ�
 *				PrintStream ps = System.out;
 *				ps.println("helloworld");
 *	
 *	System.out.print();�����ڵġ�
 *
 *	System.in ��׼���������Ӽ���¼������
 *			1. main������args���ղ���
 *			2.Scanner(JDK5)
 *					Scanner sc = new Scanner(System.in);
 *					String s = sc.nextLine();
 * 
 */
public class SystemOutDemo {
	public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("������һ���ַ�����");
			String line = br.readLine();
			System.out.println("��������ַ�����:" + line);
			
			System.out.println("������һ��������" );
			line = br.readLine();
			int i = Integer.parseInt(line);
			System.out.println("������������ǣ�" + i);
			
			// // PrintStream ps = System.out;
			// // OutputStream os = ps;
			// OutputStream os = System.out; // ��̬
			// OutputStreamWriter osw = new OutputStreamWriter(os);
			// BufferedWriter bw = new BufferedWriter(osw);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
						System.out));
			bw.write("hello");
			bw.newLine();
			// bw.flush();
			bw.write("world");
			bw.newLine();
			// bw.flush();
			bw.write("java");
			bw.newLine();
			bw.flush();
			bw.close();
			
	}
}
