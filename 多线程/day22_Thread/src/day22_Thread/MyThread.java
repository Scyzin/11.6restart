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
		// ��д����
		// for(int x = 0;x<100 ;x++){
		// System.out.println(getName() +":"+x);
		// System.out.println(getName() + " " + new Date());

		/*
		 * try { //�߳�����1s Thread.sleep(1000); } catch (InterruptedException e) {
		 * e.printStackTrace(); } Thread.yield();
		 */
		System.out.println("��ʼִ�У�" + new Date());

		// ��Ҫ��Ϣ10���ӣ��ף���Ҫ������Ŷ
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// e.printStackTrace();
			System.out.println("�̱߳���ֹ��");
		}

		System.out.println("����ִ�У�" + new Date());
	}
}
