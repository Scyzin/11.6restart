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
						s.wait();//t2�͵ȴ��ˣ������ͷ����������������ѹ����ġ�
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			System.out.println(s.name + "----" + s.age);
			//�޸ı��
			s.flag = false;
			//�����߳�
			s.notify();
		}
	}}
}
