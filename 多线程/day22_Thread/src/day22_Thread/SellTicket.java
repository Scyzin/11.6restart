package day22_Thread;

/*
 * ����ͬ�����ơ�
 * A:ͬ����������������˭��?
 * 		�������
 * 
 * B:ͬ�������ĸ�ʽ������������?
 * 		��ͬ���ؼ��ּ��ڷ����ϡ�
 * 
 * 		ͬ��������˭��?
 * 			this
 * 
 * C:��̬����������������?
 * 		��̬��������������˭��?
 * 			����ֽ����ļ�����
 */
public class SellTicket implements Runnable {

	private static int ticket = 100;
	Object obj = new Object();
	private int x = 0;

	/*
	 * public void run() { while (true) { //˭��ִ��Ȩ��˭�ͽ�ȥ�� //����t1��cpu��ִ��Ȩ��t1��Ҫ��ȥ��
	 * synchronized (obj) {//����Ĵ��������ͻ����ϡ� if (ticket > 0) { try {
	 * Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }
	 * System.out.println(Thread.currentThread().getName() + "���˵�" + (ticket--) +
	 * "��Ʊ"); } } } }
	 */
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				synchronized (SellTicket.class) {
					if (ticket > 0) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + (ticket--) + "��Ʊ ");
					}
				}
			} else {
				sellTicket();
			}
			x++;
		}
	}

	private static synchronized void sellTicket() {
		if (ticket > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + (ticket--) + "��Ʊ ");
		}
	}
}
