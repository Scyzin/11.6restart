package producer;

public class GetThread1 implements Runnable {
	private Student s;

	public GetThread1(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
	
		while (true) {
			synchronized (s) {
				if(!s.flag) {
					try {
						s.wait();//t2就等待了，立即释放锁，将来从这里醒过来的。
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			System.out.println(s.name + "----" + s.age);
			//修改标记
			s.flag = false;
			//唤醒线程
			s.notify();
		}
	}}
}
