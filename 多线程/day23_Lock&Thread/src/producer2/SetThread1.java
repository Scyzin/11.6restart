package producer2;

public class SetThread1 implements Runnable {
	private Student s;
	private int x = 1;

	public SetThread1(Student s) {
		this.s = s;
	}

	public void run() {

		while (true) {

			if (x % 2 == 0) {
				s.set("cz", 18);
			} else {
				s.set("zs", 22);
			}
			x++;
		}
	}
}
