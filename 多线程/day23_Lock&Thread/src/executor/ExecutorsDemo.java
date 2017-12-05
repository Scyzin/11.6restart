package executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * 线程池的好处：线程池里的每一个线程代码结束后，并不会死亡，而是再次回到线程池中成为空闲状态，等待下一个对象来使用。
 * 
 * 如何实现线程的代码呢?
 * 		A:创建一个线程池对象，控制要创建几个线程对象。
 * 			public static ExecutorService newFixedThreadPool(int nThreads)
 * 		B:这种线程池的线程可以执行：
 * 			可以执行Runnable对象或者Callable对象代表的线程
 * 			做一个类实现Runnable接口。
 * 		C:调用如下方法即可			可以返回值
 * 			Future<?> submit(Runnable task)
 *			<T> Future<T> submit(Callable<T> task)
 *		D:可以结束。
 *			pool.shutdown();
 *			
 */
public class ExecutorsDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// 创建一个线程池对象，控制要创建几个线程对象。
		// public static ExecutorService newFixedThreadPool(int nThreads)
		// 用的是方法2
		ExecutorService pool = Executors.newFixedThreadPool(2);

		// 可以执行Runnable对象或者Callable对象代表的线程
		//pool.submit(new MyRunnable());
		//pool.submit(new MyCallable());
		//pool.submit(new MyRunnable());
		
		Future<Integer> f1 = pool.submit(new MyCallable(100));
		Integer i1 = f1.get();
		System.out.println(i1);
		
		//结束线程池
		pool.shutdown();
	}
}
