package day22_Thread;

/*
 * ���ʵ�ֶ��̵߳ĳ���
 * 		ͨ��Thread
 * ����1��
 * 		�Զ���Thread�������
 * 		��дrun()����
 * 		��������
 * 		��������
 * ��ȡ�̵߳�����
 * 		public final String getName()
 * ��������̶߳����������?
 * public final void setName(String name):�����̵߳�����
 * 
 * ��Բ���Thread�����������λ�ȡ�̶߳���������?
 * public static Thread currentThread():���ص�ǰ����ִ�е��̶߳���
 * Thread.currentThread().getName()
 */
public class MyThreadDemo {
	public static void main(String[] args) {

		MyThread my = new MyThread();
		// ֱ�ӵ���run()���������ǵ��߳�Ч��

		// run():�����Ƿ�װ�߳�ִ�еĴ��룬ֱ�ӵ���ʱ��ͨ����
		// start():�����������̣߳�Ȼ������jvmȥ���ø��̵߳�run()����

		// my.start(); my.start();
		// ��my�̵߳��������Σ������������߳�����,�߳̿��Զ������
		MyThread my1 = new MyThread();

		// my1.setName("111"); �޲�+setName
		// my2.setName("222");
		// MyThread my1 = new MyThread("111");���ι��췽�����߳�������

		my.start();
		my1.start();

		// public static Thread currentThread():���ص�ǰ����ִ�е��̶߳���
		System.out.println(Thread.currentThread().getName());

	}
}
/*
 * ����Ϊʲô�ǣ�Thread-? ���
 * 
 * class Thread { private char name[];
 * 
 * public Thread() { init(null, null, "Thread-" + nextThreadNum(), 0); }
 * 
 * private void init(ThreadGroup g, Runnable target, String name, long
 * stackSize) { init(g, target, name, stackSize, null); }
 * 
 * private void init(ThreadGroup g, Runnable target, String name, long
 * stackSize, AccessControlContext acc) { //�󲿷ִ��뱻ʡ���� this.name =
 * name.toCharArray(); }
 * 
 * public final void setName(String name) { this.name = name.toCharArray(); }
 * 
 * 
 * private static int threadInitNumber; //0,1,2 private static synchronized int
 * nextThreadNum() { return threadInitNumber++; //return 0,1 }
 * 
 * public final String getName() { return String.valueOf(name); } }
 * 
 * class MyThread extends Thread { public MyThread() { super(); } }
 * 
 */
