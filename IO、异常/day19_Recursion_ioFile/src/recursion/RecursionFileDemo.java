package recursion;

import java.io.File;
/*
 * ����ĳ��Ŀ¼�µ�����java�ļ��� 
 * 
 */
public class RecursionFileDemo {
	public static void main(String[] args) {

		File file = new File("E:\\java ��Ƶ\\11.6 java");

		getAllJavaFilePaths(file);
	}

	public static void getAllJavaFilePaths(File file) {
		File[] a = file.listFiles();
		for (File s : a) {
			// �ж�file�Ƿ�Ϊ�ļ���
			if (s.isDirectory()) {
				getAllJavaFilePaths(s);
			} else {
				// �ж��Ƿ���java��β
				if (s.getName().endsWith(".java")) {
					// ����ļ��еľ���·��
					System.out.println(s.getAbsolutePath());
				}
			}
 		}
	}
}
