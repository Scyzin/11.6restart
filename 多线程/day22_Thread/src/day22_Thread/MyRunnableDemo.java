package day22_Thread;

/*
 * ��ʽ2��ʵ��runnable�ӿ�,�������ַ�ʽ��
 * ���裺
 * 		�Զ�����ʵ��runnale�ӿ�
 * 		��дrun����
 * 		����myrunnable��Ķ���
 * 		����thread�Ķ��󣬲�������Ľӿڶ�����Ϊ����������ݡ�
 * 
 * Thread(Runnable target) 
 * Thread(Runnable target, String name) 
 * 
 * Ϊɶ��һ����ʽ1����Ҫ��һ����ʽ��
 * 		1.���Ա��ⵥ�̳еľ����ԡ�
 * 		2.�ʺ϶����ͬ����Ĵ���ȥ����ͬһ����Դ����������߳���ͬ����Ĵ��룬
 * 		������Ч����
 */
public class MyRunnableDemo {
	public static void main(String[] args) {
		MyRunnable my = new MyRunnable();

		// Thread t1 = new Thread(my);
		Thread t1 = new Thread(my, "��ʤ");
		Thread t2 = new Thread(my);

		t1.start();
		t2.start();
	}
}
