/*
	�������ͣ�Java��һ��ǿ���͵����ԣ����ÿһ�����ݶ���������ȷ����������
	
	�������ͷֱ�
			������������
			�����������ͣ��࣬�ӿڣ���ֵ��
			
	�����������ͣ�4��8��
			����		ռ���ֽ���
				byte 		1
				short 		2	
				int 		4			
				long 		8
			������
				float		4
				double		8
				
			�ַ�
				char		2
			����
				boolean		1
			����Ĭ����int���ͣ�������Ĭ����double���ͣ�
			�����κ�׺��l����L�������ȸ������ݼ�f��ʾ��
*/	
class DataType{
	public static void main(String[] args){
		//��������ĸ�ʽ��
		//��������	������	= 	��ʼ��ֵ��
		byte b = 10;
		System.out.println(10);
		System.out.println(b);
		
		//����һ�������α���
		short s = 100;
		System.out.println(s);
		
		//����һ�����α���
		int i = 100;
		System.out.println(i);
		
		//����һ�������α���
		long j = 100000000L;
		System.out.println(j);
		
		//���帡�����ݱ���
		float f = 12.354F;
		System.out.println(f);
		double g = 123.434;
		System.out.println(g);
		
		//�����ַ�
		char a ='A';
		System.out.println(a);
		
		
	}
}