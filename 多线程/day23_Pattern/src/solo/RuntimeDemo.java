package solo;

import java.io.IOException;

/*
 * Runtime:ÿ�� Java Ӧ�ó�����һ�� Runtime ��ʵ����ʹӦ�ó����ܹ��������еĻ��������ӡ�
 * 			exec(String command)   dos����
 */
public class RuntimeDemo {
	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
		// r.exec("notepad");
		// r.exec("calc");
		//��ʱע��
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