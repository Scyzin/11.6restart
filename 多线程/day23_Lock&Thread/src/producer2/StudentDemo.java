package producer2;

/*
 *优化后的
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();

		SetThread1 s1 = new SetThread1(s);
		GetThread1 g1 = new GetThread1(s);

		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(g1);

		t1.start();
		t2.start();

	}
}
