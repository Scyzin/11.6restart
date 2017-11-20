package system;

/*
 * static void exit(int status) 
          终止当前正在运行的 Java 虚拟机。 后面的程序不运行了
   
 * static long currentTimeMillis() 
          返回以毫秒为单位的当前时间。       
 * 
 */
public class SystemExitDemo {
	public static void main(String[] args) {
		System.out.println("我们喜欢");
		//System.exit(0);
		System.out.println("我们也喜欢");

		// 用来统计程序的运行时间
		long start = System.currentTimeMillis();
		for (int x = 0; x < 10000; x++) {
			System.out.println("hello" + x);
		}
		long end = System.currentTimeMillis();
		System.out.println("运行了时间" + (end - start) + "毫秒");
	}
}
