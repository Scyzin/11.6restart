package day22_Thread;
/*
 * �߳�����	public static void sleep(long millis) 
 * �̼߳���	public final void join()	my�߳�ִ�н����������̲߳��ܿ�ʼ��
 * �߳�����    public static void yield()	��ͣ��ǰ����ִ�е��̶߳��󣬲�ִ�������̡߳�
 * ��̨�߳�    public final void setDaemon(boolean on)		�����̱߳��Ϊ�ػ��̻߳��û��̡߳����������е��̶߳����ػ��߳�ʱ��Java ������˳��� 
					�÷��������������߳�ǰ���á� 
 * �ж��߳�	public final void stop()	���߳�ֹͣ����ʱ�ˣ����ǿ�����
 * 			public void interrupt()		�ж��̣߳����߳�״̬��ֹ�����׳�һ���쳣
 */
public class ThreadControlDemo {
	public static void main(String[] args) {
		
		MyThread my = new MyThread();
		MyThread my1 = new MyThread();
		MyThread my2 = new MyThread();

		//my.setName("����");
		my1.setName("��");
		my2.setName("������");
		
		//my.start();
		/*try {
			//my�߳�ִ�н����������̲߳��ܿ�ʼ��
			//��ʱ�� setDaemon ҲҪ��������濪ʼ�ġ�
			my1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		/*my1.setDaemon(true);
		my2.setDaemon(true);*/
		
		my1.start();
		my2.start();
		try {
			Thread.sleep(3000);
			// ts.stop();
			my.interrupt();
		} catch (InterruptedException e) {
			System.out.println("�߳���ֹ��");
		}
		
		/*Thread.currentThread().setName("��������");
		for(int x = 0 ; x <5;x++) {
			System.out.println(Thread.currentThread().getName() + " " + x);
		}*/
		
		
	}
}
