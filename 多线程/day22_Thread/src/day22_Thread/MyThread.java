package day22_Thread;

import java.util.Date;

public class MyThread extends Thread {

	public MyThread() {

	}

	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		// 重写代码
		// for(int x = 0;x<100 ;x++){
		// System.out.println(getName() +":"+x);
		// System.out.println(getName() + " " + new Date());

		/*
		 * try { //线程休眠1s Thread.sleep(1000); } catch (InterruptedException e) {
		 * e.printStackTrace(); } Thread.yield();
		 */
		System.out.println("开始执行：" + new Date());

		// 我要休息10秒钟，亲，不要打扰我哦
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// e.printStackTrace();
			System.out.println("线程被终止了");
		}

		System.out.println("结束执行：" + new Date());
	}
}
