package day22_Thread;

/*
 * �̵߳��ȣ�javaʹ��d����ռ����ģ�͡� 	��������һ�ַ�ʱ����ģ�͡�
 * 
 * �߳���Ĭ�����ȼ�:5
 * 		��С���ȼ�1   ������ȼ�10
 * ��λ�ȡ�߳����ȼ���
 * 		public final int getPriority():�����̶߳�������ȼ�
 * ��������̶߳�������ȼ���?
 * 		public final void setPriority(int newPriority)�������̵߳����ȼ���
 * �߳����ȼ��߽�����ʾ�̻߳�ȡ�� CPUʱ��Ƭ�ļ��ʸߣ�����Ҫ�ڴ����Ƚ϶࣬
 * 		���߶�����е�ʱ����ܿ����ȽϺõ�Ч����
 * 
 */
public class ThreadPriorityDemo {
	public static void main(String[] args) {
		MyThread my = new MyThread();
		MyThread my1 = new MyThread();
		MyThread my2 = new MyThread();

		my.setName("����");
		my1.setName("��");
		my2.setName("������");

		System.out.println(my.getPriority());

		// my.setPriority(100000);����ģ�����ֵ�������ޡ�
		my1.setPriority(10);
		my2.setPriority(1);

		my.start();
		my1.start();
		my2.start();
	}
}
