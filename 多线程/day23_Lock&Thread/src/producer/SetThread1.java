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
						s.wait();// t1���ţ��ͷ�����
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
				// �޸ı��
				s.flag = true;
				// ����t2,���Ѳ������������ִ�У����뻹����cpu��ִ��Ȩ��
				s.notify();
			}
		}
	}
}
