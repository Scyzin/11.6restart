package day22_Thread;
/*
 * 线程休眠	public static void sleep(long millis) 
 * 线程加入	public final void join()	my线程执行结束后，其它线程才能开始。
 * 线程礼让    public static void yield()	暂停当前正在执行的线程对象，并执行其他线程。
 * 后台线程    public final void setDaemon(boolean on)		将该线程标记为守护线程或用户线程。当正在运行的线程都是守护线程时，Java 虚拟机退出。 
					该方法必须在启动线程前调用。 
 * 中断线程	public final void stop()	让线程停止，过时了，但是可以用
 * 			public void interrupt()		中断线程，把线程状态终止，并抛出一个异常
 */
public class ThreadControlDemo {
	public static void main(String[] args) {
		
		MyThread my = new MyThread();
		MyThread my1 = new MyThread();
		MyThread my2 = new MyThread();

		//my.setName("陈遵");
		my1.setName("陈");
		my2.setName("陈遵守");
		
		//my.start();
		/*try {
			//my线程执行结束后，其它线程才能开始。
			//即时是 setDaemon 也要在这个后面开始的。
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
			System.out.println("线程终止了");
		}
		
		/*Thread.currentThread().setName("我先死啦");
		for(int x = 0 ; x <5;x++) {
			System.out.println(Thread.currentThread().getName() + " " + x);
		}*/
		
		
	}
}
