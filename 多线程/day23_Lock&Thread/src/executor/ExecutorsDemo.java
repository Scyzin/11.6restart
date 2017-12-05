package executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * �̳߳صĺô����̳߳����ÿһ���̴߳�������󣬲����������������ٴλص��̳߳��г�Ϊ����״̬���ȴ���һ��������ʹ�á�
 * 
 * ���ʵ���̵߳Ĵ�����?
 * 		A:����һ���̳߳ض��󣬿���Ҫ���������̶߳���
 * 			public static ExecutorService newFixedThreadPool(int nThreads)
 * 		B:�����̳߳ص��߳̿���ִ�У�
 * 			����ִ��Runnable�������Callable���������߳�
 * 			��һ����ʵ��Runnable�ӿڡ�
 * 		C:�������·�������			���Է���ֵ
 * 			Future<?> submit(Runnable task)
 *			<T> Future<T> submit(Callable<T> task)
 *		D:���Խ�����
 *			pool.shutdown();
 *			
 */
public class ExecutorsDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// ����һ���̳߳ض��󣬿���Ҫ���������̶߳���
		// public static ExecutorService newFixedThreadPool(int nThreads)
		// �õ��Ƿ���2
		ExecutorService pool = Executors.newFixedThreadPool(2);

		// ����ִ��Runnable�������Callable���������߳�
		//pool.submit(new MyRunnable());
		//pool.submit(new MyCallable());
		//pool.submit(new MyRunnable());
		
		Future<Integer> f1 = pool.submit(new MyCallable(100));
		Integer i1 = f1.get();
		System.out.println(i1);
		
		//�����̳߳�
		pool.shutdown();
	}
}
