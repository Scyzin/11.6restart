package executor;

import java.util.concurrent.Callable;
/*
 * callable：带泛型的接口
 *	泛型上call()方法的返回值类型 
 */
public class MyCallable implements Callable{
	private int number;
	
	public MyCallable(int number) {
		this.number = number;
	}
	/*public Object call()throws Exception {
		for(int x =0;x<100;x++) {
			System.out.println(Thread.currentThread().getName() + " ");
		}
		return null;
	}*/
	public Integer call() {
		int sum = 0;
		for(int x =1;x<=number;x++) {
			sum +=x;
		}
		return sum;
	}
	
}
