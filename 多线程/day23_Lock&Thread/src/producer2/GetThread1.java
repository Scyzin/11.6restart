package producer2;

public class GetThread1 implements Runnable {
	private Student s;

	public GetThread1(Student s) {
		this.s = s;
	}

	@Override
	public void run() {

		while (true) {
			s.get();
		}
	}
}
