package day22_Thread;

/*
 * 如何实现多线程的程序？
 * 		通过Thread
 * 方法1：
 * 		自定义Thread类的子类
 * 		重写run()方法
 * 		创建对象
 * 		启动进程
 * 获取线程的名称
 * 		public final String getName()
 * 如何设置线程对象的名称呢?
 * public final void setName(String name):设置线程的名称
 * 
 * 针对不是Thread类的子类中如何获取线程对象名称呢?
 * public static Thread currentThread():返回当前正在执行的线程对象
 * Thread.currentThread().getName()
 */
public class MyThreadDemo {
	public static void main(String[] args) {

		MyThread my = new MyThread();
		// 直接调用run()方法，就是单线程效果

		// run():仅仅是封装线程执行的代码，直接调用时普通方法
		// start():首先启动了线程，然后再由jvm去调用该线程的run()方法

		// my.start(); my.start();
		// 是my线程调用了两次，而不是两个线程启动,线程可以多次启动
		MyThread my1 = new MyThread();

		// my1.setName("111"); 无参+setName
		// my2.setName("222");
		// MyThread my1 = new MyThread("111");带参构造方法给线程起名字

		my.start();
		my1.start();

		// public static Thread currentThread():返回当前正在执行的线程对象
		System.out.println(Thread.currentThread().getName());

	}
}
/*
 * 名称为什么是：Thread-? 编号
 * 
 * class Thread { private char name[];
 * 
 * public Thread() { init(null, null, "Thread-" + nextThreadNum(), 0); }
 * 
 * private void init(ThreadGroup g, Runnable target, String name, long
 * stackSize) { init(g, target, name, stackSize, null); }
 * 
 * private void init(ThreadGroup g, Runnable target, String name, long
 * stackSize, AccessControlContext acc) { //大部分代码被省略了 this.name =
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
