package producer;

/*
 * 生产者  set类
 * 消费者  get类
 * 
 * 设置线程和获取线程的资源应该是同一个，通过构造方法传递给其他类。
 * 
 * cpu的一个小片段就能运行很多操作，产生很多数据。
 * 姓名年龄肯能因为线程的随机性，而不匹配。
 * 
 * 这是线程安全问题。
 * 通过加锁：
 * 			不同种类的线程都要加锁
 * 			加的锁必须是同一把。
 * 
 * 有可能有这个问题？			消费者先抢到CPU的执行权，先消费数据。但是数据没有意义。
 * 			生产者抢到，就会产生数据。产生完继续产生，没有消费。无意义。
 * 
 * JAVA提供一种   		等待唤醒机制。
 * 		生产者：是否有数据，有就等待，没有就生产。生产完后等消费者来消费
 * 		消费者：是否有数据，有酒消费，没有就等待，通知生产者生产。
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();
		
		SetThread1 s1 = new SetThread1(s);
		GetThread1 g1 = new GetThread1(s);
		
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(g1);
		
		t1.start();
		t2.start();
		
	}
}
