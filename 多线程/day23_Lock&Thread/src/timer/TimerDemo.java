package timer;

import java.util.Timer;
import java.util.TimerTask;

/*
 * ��ʱ����������������ָ����ʱ����ĳ�����飬�������ظ�����ĳ�����顣
 * 
 * ����Timer��TimerTask�������ࣺ
 * 
 * Timer:��ʱ
 * 		public Timer()
 * 		public void schedule(TimerTask task,long delay)
 * 		public void schedule(TimerTask task,long delay,long period)
 * 		public void cancel()
 * 
 * TimerTask:����
 */

public class TimerDemo {
	public static void main(String[] args) {
		Timer t = new Timer();
		//3���ִ������
		//t.schedule(new MyTask(t), 3000);
		//3��󣬼���ִ�����񣬼��ʱ��2�롣
		t.schedule(new MyTask(t), 3000,2000);
	}
	
}

class MyTask extends TimerTask{
	private Timer t ;
	
	public MyTask() {}
	
	public MyTask(Timer t ) {
		this.t = t;
	}
	
	public void run() {
		System.out.println("beng,��ը��");
		//t.cancel();
	}
	
}
