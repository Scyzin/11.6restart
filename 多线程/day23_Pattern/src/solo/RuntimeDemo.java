package solo;

import java.io.IOException;

/*
 * Runtime:每个 Java 应用程序都有一个 Runtime 类实例，使应用程序能够与其运行的环境相连接。
 * 			exec(String command)   dos命令
 */
public class RuntimeDemo {
	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
		// r.exec("notepad");
		// r.exec("calc");
		//定时注销
		//r.exec("shutdown -s -t 10000");
		r.exec("shutdown -a");
	}
}

/*
 * class Runtime {
 * 		private Runtime() {}
 * 		private static Runtime currentRuntime = new Runtime();
 * 		public static Runtime getRuntime() {
 *       	return currentRuntime;
 *   	}
 * }
 */