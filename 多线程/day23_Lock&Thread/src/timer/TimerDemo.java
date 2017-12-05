package timer;

import java.util.Timer;
import java.util.TimerTask;

/*
 * 定时器：可以让我们在指定的时间做某件事情，还可以重复的做某件事情。
 * 
 * 依赖Timer和TimerTask这两个类：
 * 
 * Timer:定时
 * 		public Timer()
 * 		public void schedule(TimerTask task,long delay)
 * 		public void schedule(TimerTask task,long delay,long period)
 * 		public void cancel()
 * 
 * TimerTask:任务
 */

public class TimerDemo {
	public static void main(String[] args) {
		Timer t = new Timer();
		//3秒后执行任务
		//t.schedule(new MyTask(t), 3000);
		//3秒后，继续执行任务，间隔时间2秒。
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
		System.out.println("beng,爆炸了");
		//t.cancel();
	}
	
}
