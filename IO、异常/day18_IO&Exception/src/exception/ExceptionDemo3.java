package exception;

/*
 * throw:在功能方法内部出现某种情况，程序不能继续运行，
 * 		需要进行跳转时，就用throw把异常对象抛出。
 * 
 * throws和throw区别：
 * 	throws:
 * 		用在方法声明后面，跟的是异常类名
		可以跟多个异常类名，用逗号隔开
		表示抛出异常，由该方法的调用者来处理
		throws表示出现异常的一种可能性，并不一定会发生这些异常
		如果是运行时期异常，就不用throws
 * 
 * throw:
 * 		用在方法体内，跟的是异常对象名
		只能抛出一个异常对象名
		表示抛出异常，由方法体内的语句处理
		throw则是抛出了异常，执行throw则一定抛出了某种异常
 */

public class ExceptionDemo3 {
	public static void main(String[] args) {
		method();
		
		try {
			method2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//声明了异常，抛出后要处理。
	}
	
	public static void method() {
		int a = 10;
		int b = 0;
		if (b == 0) {
			throw new ArithmeticException(); //抛出一个对象
		} else {
			System.out.println(a / b);
		}
	}
	
	//如果exception是继承自runningTime Exception。就不用抛出异常
	public static void method2() throws Exception {
		int a = 10;
		int b = 0;
		if (b == 0) {
			throw new Exception();
		} else {
			System.out.println(a / b);
		}
	}
}
