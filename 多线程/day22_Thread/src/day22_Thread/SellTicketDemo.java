package day22_Thread;
/*
 * 加入延迟后，产生了问题
 * 		1.相同票卖多次     		操作原子性
 * 		2.出现负数票			随机性和延迟导致的
 * 
 * 为什么出现问题？
 * 		是否是多线程环境
 * 		是否有共享数据
 * 		是否有多条语句操作共享数据
 * 
 * 如何解决安全问题？
 * 		只能修改第三步，把多个语句操作共享数据的代码锁起来，让任何时刻只能
 * 		有一个线程执行。
 * 
 * 运用到同步机制。
 * 		synchronized(对象){需要同步的代码}
 * 		同步可以解决安全问题的根本原因就在于该对象如同锁的功能。
 * 
 * 同步的特点：
 * 		多线程
 * 		多个线程使用的是同一个对象
 * 好处：
 * 		同步的出现解决了多线程的安全网
 * 弊端：
 * 		线程多时，每个线程都会去判断同步上的锁，降低效率。
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		SellTicket st = new SellTicket();
		
		Thread t1 = new Thread(st,"窗口1");
		Thread t2 = new Thread(st,"窗口2");
		Thread t3 = new Thread(st,"窗口3");
		
		t1.start();
		t2.start();
		t3.start();
		
		/*
		 * // 线程安全的类 StringBuffer sb = new StringBuffer(); 
		 * Vector<String> v = new Vector<String>(); 
		 * Hashtable<String, String> h = new Hashtable<String, String>();
		 * // Vector是线程安全的时候才去考虑使用也不用你
		 *  // 那么到底用谁呢? // public static <T>
		 * List<T> synchronizedList(List<T> list) List<String> list1 = new
		 * ArrayList<String>();// 线程不安全
		 *  List<String> list2 = Collections
		 * .synchronizedList(new ArrayList<String>()); // 线程安全
		 */	
		}
}
