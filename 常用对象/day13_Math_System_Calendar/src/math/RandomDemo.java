package math;

import java.util.Random;

/*
 * Random() 
          ����һ���µ���������������ǵ�ǰʱ��ĺ���ֵ��
    Random(long seed) 
 * �õ��� long ���Ӵ���һ���µ��������������
 * �������Ӻ�ÿ�β��������������ͬ�ġ�
 * 
 * ��Ա������
 * public int nextInt()		int��Χ�ڵ������
 * public int nextInt(int n)	[0-n)

 * 
 */
public class RandomDemo {
	public static void main(String[] args) {
		Random r = new Random();
		//Random s = new Random(100);
		
		for(int x = 0 ; x < 10 ;x ++) {
			int num = r.nextInt();
			//int num = r.nextInt(100);
			System.out.println(num);
		}
		
	}
}
