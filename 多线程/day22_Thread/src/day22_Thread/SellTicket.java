package day22_Thread;

/*
 * 调入同步机制。
 * A:同步代码块的锁对象是谁呢?
 * 		任意对象。
 * 
 * B:同步方法的格式及锁对象问题?
 * 		把同步关键字加在方法上。
 * 
 * 		同步方法是谁呢?
 * 			this
 * 
 * C:静态方法及锁对象问题?
 * 		静态方法的锁对象是谁呢?
 * 			类的字节码文件对象。
 */
public class SellTicket implements Runnable {

	private static int ticket = 100;
	Object obj = new Object();
	private int x = 0;

	/*
	 * public void run() { while (true) { //谁捡到执行权，谁就进去。 //假设t1捡到cpu的执行权，t1就要进去。
	 * synchronized (obj) {//这里的代码进来后就会锁上。 if (ticket > 0) { try {
	 * Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }
	 * System.out.println(Thread.currentThread().getName() + "卖了第" + (ticket--) +
	 * "张票"); } } } }
	 */
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				synchronized (SellTicket.class) {
					if (ticket > 0) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName() + "正在出售第" + (ticket--) + "张票 ");
					}
				}
			} else {
				sellTicket();
			}
			x++;
		}
	}

	private static synchronized void sellTicket() {
		if (ticket > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "正在出售第" + (ticket--) + "张票 ");
		}
	}
}
