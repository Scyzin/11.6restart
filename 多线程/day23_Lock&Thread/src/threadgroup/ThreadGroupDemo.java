package threadgroup;

public class ThreadGroupDemo {
	public static void main(String[] args) {
		// method1();

		// ����һ���߳���
		// ���������̵߳�ʱ�򣬰������̵߳���ָ��Ϊ�����Լ��½��߳���
		method2();

		// t1.start();
		// t2.start();
	}

	private static void method2() {
		// ThreadGroup(String name)
		ThreadGroup tg = new ThreadGroup("����һ���µ���");

		MyRunnable my = new MyRunnable();
		// Thread(ThreadGroup group, Runnable target, String name)
		Thread t1 = new Thread(tg, my, "����ϼ");
		Thread t2 = new Thread(tg, my, "����");

		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());

		// ͨ�����������ú�̨�̣߳���ʾ������̶߳��Ǻ�̨�߳�
		tg.setDaemon(true);
	}

	private static void method1() {
		MyRunnable my = new MyRunnable();
		Thread t1 = new Thread(my, "����ϼ");
		Thread t2 = new Thread(my, "����");

		// �߳�������ķ�����public final ThreadGroup getThreadGroup()
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		// �߳�������ķ�����public final String getName()
		String name1 = tg1.getName();
		String name2 = tg2.getName();
		System.out.println(name1);
		System.out.println(name2);
		// �߳�Ĭ�����������main�߳���
		// Ĭ������£����е��̶߳�����ͬһ����
		System.out.println(Thread.currentThread().getThreadGroup().getName());
	}
}
