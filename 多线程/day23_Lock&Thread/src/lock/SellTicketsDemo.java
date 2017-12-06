package lock;

/*
 * 	同步弊端
		效率低
		如果出现了同步嵌套，就容易产生死锁问题
	死锁问题及其代码
		是指两个或者两个以上的线程在执行的过程中，因争夺资源产生的一种互相等待现象
 */
public class SellTicketsDemo {
	public static void main(String[] args) {
		SellTickets st = new SellTickets();

		Thread t1 = new Thread(st, "窗口1");
		Thread t2 = new Thread(st, "窗口2");
		Thread t3 = new Thread(st, "窗口3");

		t1.start();
		t2.start();
		t3.start();
	}
}
