package test��Ҫ�࿴;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
/*
 * ��֪s.txt�ļ�����������һ���ַ�������hcexfgijkamdnoqrzstuvwybpl��
 * ���д�����ȡ�������ݣ������������д��ss.txt�С�
 */
public class SearchDemo {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
		
		//��ȡһ��
		String line =br.readLine();
		
		br.close();
		//�ַ���ת��������
		char[]chs = line.toCharArray();
		//��������
		Arrays.sort(chs);
		
		//����ת�����ַ���
		String s = new String(chs);
		bw.write(s);
		bw.flush();
		bw.close();
		
		//���ȷ���ַ���ɶ��ֵ��
		// System.out.println('\r' + 0); // 13
		// System.out.println('\n' + 0);// 10
	}
}
