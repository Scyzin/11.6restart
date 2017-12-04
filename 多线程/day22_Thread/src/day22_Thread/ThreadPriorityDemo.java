package day22_Thread;

/*
 * 线程调度，java使用d是抢占调度模型。 	还有另外一种分时调度模型。
 * 
 * 线程有默认优先级:5
 * 		最小优先级1   最大优先级10
 * 如何获取线程优先级：
 * 		public final int getPriority():返回线程对象的优先级
 * 如何设置线程对象的优先级呢?
 * 		public final void setPriority(int newPriority)：更改线程的优先级。
 * 线程优先级高仅仅表示线程获取的 CPU时间片的几率高，但是要在次数比较多，
 * 		或者多次运行的时候才能看到比较好的效果。
 * 
 */
public class ThreadPriorityDemo {
	public static void main(String[] args) {
		MyThread my = new MyThread();
		MyThread my1 = new MyThread();
		MyThread my2 = new MyThread();

		my.setName("陈遵");
		my1.setName("陈");
		my2.setName("陈遵守");

		System.out.println(my.getPriority());

		// my.setPriority(100000);错误的，优先值有上下限。
		my1.setPriority(10);
		my2.setPriority(1);

		my.start();
		my1.start();
		my2.start();
	}
}
