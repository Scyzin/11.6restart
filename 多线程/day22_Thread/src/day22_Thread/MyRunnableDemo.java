package day22_Thread;

/*
 * 方式2：实现runnable接口,多用这种方式。
 * 步骤：
 * 		自定义类实现runnale接口
 * 		重写run方法
 * 		创建myrunnable类的对象
 * 		创建thread的对象，并将上面的接口对象作为构造参数传递。
 * 
 * Thread(Runnable target) 
 * Thread(Runnable target, String name) 
 * 
 * 为啥有一个方式1，还要来一个方式：
 * 		1.可以避免单继承的局限性。
 * 		2.适合多个相同程序的代码去处理同一个资源的情况，把线程相同程序的代码，
 * 		数据有效分离
 */
public class MyRunnableDemo {
	public static void main(String[] args) {
		MyRunnable my = new MyRunnable();

		// Thread t1 = new Thread(my);
		Thread t1 = new Thread(my, "陈胜");
		Thread t2 = new Thread(my);

		t1.start();
		t2.start();
	}
}
