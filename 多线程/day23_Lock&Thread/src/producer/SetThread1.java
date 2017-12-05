package producer;

public class SetThread1 implements Runnable {
	private Student s;
	private int x = 1;

	public SetThread1(Student s) {
		this.s = s;
	}

	public void run() {

		while (true) {
			synchronized (s) {
				if (s.flag) {
					try {
						s.wait();// t1等着，释放锁。
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if (x % 2 == 0) {
					s.name = "cz";
					s.age = 18;
				} else {
					s.name = "zs";
					s.age = 30;
				}

				x++;
				// 修改标记
				s.flag = true;
				// 唤醒t2,唤醒不代表可以马上执行，必须还得抢cpu的执行权。
				s.notify();
			}
		}
	}
}
