/*
	��Ŀ�������
		�Ƚϱ��ʽ?���ʽ1:���ʽ2;
		
		�Ƚϱ��ʽ:�����һ��boolean����!

			���ݱȽϱ��ʽ�ļ��㷵��һ��true����false��
			�����true���Ͱѱ��ʽ1��Ϊ�����
			�����false���Ͱѱ��ʽ2��Ϊ�����
			
		��ȡ���������е����ֵ
		��ȡ���������е����ֵ
		�Ƚ����������Ƿ���ͬ	
*/
class OperatorDemo6 {
	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		
		//����
		//int z = ((x = y)? x : y);
		//���������е����ֵ
		int max = ((x > y)? x: y);	
		System.out.println("max=" + max);
		
		//���������е����ֵ
		int a = 10;
		int b = 30;
		int c = 20;
		int temp = (a > b) ? a : b ;
		int max1 = (temp > c) ? temp : c;
		System.out.println("max1=" + max1);
		
		//�Ƚ����������Ƿ���ͬ
		boolean flag = (a == b);
		System.out.println(flag);
		
	}
}
