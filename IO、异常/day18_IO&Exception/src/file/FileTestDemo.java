package file;

import java.io.File;import java.io.FileFilter;
import java.io.FilenameFilter;

/*
 * �ж��ļ������Ƿ��к�׺��Ϊ.bmp���ļ��������
 * 
 * 1.
 * 2.
 * 
 * public String[] list(FilenameFilter filter)	�ļ����ƹ�����
   public File[] listFiles(FilenameFilter filter)
 *
 */
public class FileTestDemo {
	public static void main(String[] args) {
		// ��װe�ж�Ŀ¼
		File file = new File("E:\\java ��Ƶ\\11.6 java");

		// ��ȡ��Ŀ¼�������ļ������ļ��е�file����
		File[] fi = file.listFiles();

		// ����file���飬�õ�ÿһ��File����Ȼ���ж�
		for (File s : fi) {
			if (s.isFile()) {

				// �ж��Ƿ���.bmp��β
				if (s.getName().endsWith(".bmp")) {
					System.out.println(s.getName());
				}
			}
		}
		System.out.println("-----");
		
		String[] f2 = file.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {

				return new File(dir, name).isFile() && name.endsWith(".bmp");
			}
		});
		//����
		for (String s1 : f2) {
			System.out.println(s1);
		}
		
	
		
	}
}
