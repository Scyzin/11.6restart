package stencil;
/*
 * ģ�����ģʽ��
 * 			�ó����ඨ��һ���㷨�ĹǼܣ����㷨�ӳٵ�������ʵ��
 * �ŵ㣺
 * 		�����㷨�Ǽܵ�ͬʱ��������ʵ�־�����㷨�������û���������
 * ȱ�㣺
 * 		�㷨�Ǽ��иı�ʱ����Ҫ�ı������
 * 
 * 
 */
public abstract class GetTime {
	public long GetTime() {
		long start = System.currentTimeMillis();
		
		code();
		long end = System.currentTimeMillis();
		return end - start;
		
	}
	public abstract void code();
}

