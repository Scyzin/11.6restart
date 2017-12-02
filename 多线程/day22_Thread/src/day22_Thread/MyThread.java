package day22_Thread;

public class MyThread extends Thread {
	
	public MyThread() {
		
	}
	
	public MyThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		//ÖØĞ´´úÂë
		for(int x = 0;x<100	;x++){
			System.out.println(getName() +":"+x);
		}
	}

}
