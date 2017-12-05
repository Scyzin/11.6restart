package lock;
/*
 * 运用同步代码块和同步方法，可以解决锁对象问题，但是无法看到在哪加锁和释放锁。
 * JDK5提供新的  锁对象
 * 	Lock是个接口，他的子类有，ReentrantLock
 *  lock、unlock。
 */
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTickets implements Runnable {
	private int tickets = 100;

	private Lock lock = new ReentrantLock();

	@Override
	public void run() {

		while (true) {
			try {
				lock.lock();
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "正在卖" + (tickets--) + "张票");

				}
			} finally {
				lock.unlock();
			}
		}
	}
}
