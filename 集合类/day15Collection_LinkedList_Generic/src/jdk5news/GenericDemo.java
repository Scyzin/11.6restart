package jdk5news;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ��string��integer����ͳһ��string����ת��������
 * 
 * ����ģ��������������ڴ��������ʱ����ȷԪ�ص��������ͣ�
 * ��ͽ���   ���͡�
 * 
 * ���ͣ���������͡���������ȷ�Ĺ����Ƴٵ�����������ߵ��÷�����ʱ���ȡ
 * 		��ȷ �����͡����������ͣ������͵�������һ���Ĵ���
 * 
 * 	<��������>		���������ֻ������������
 * 
 *  <E>  ���ʱ���÷���
 *  
 * 	��ʱ����õ�ʱ�򣬾Ͳ�������ת���ˡ�
 * 	�ŵ㣺	
 * 			������ʱ���������ǰ���˱����ڼ�
 * 			��String��it.next() �����ˣ�������ǿ��ת��
 * 			�Ż�������ƣ����پ������⡣
 * 			
 * 	���ڣ�object���Խ�������Ķ������ͣ�����ʵ�������У���������ת������
 * 		JDK5������ģ���߳���İ�ȫ��
 * 
 * JDK7����:�����ƶ�.
 * 			ArrayList<String> arr = new ArrayList<>();
 * 
 */
public class GenericDemo {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("hello");
		arr.add("hlo");		
		arr.add("helo");
		
		//�Զ�����
		//�ȼ���arr.add(Integer.valueOf(10));
		arr.add("10");
		
		for(Iterator<String> it = arr.iterator();it.hasNext();) {
			System.out.println(it.next());
		}
	}
}
