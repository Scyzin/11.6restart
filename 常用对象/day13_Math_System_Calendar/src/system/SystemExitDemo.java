package system;

/*
 * static void exit(int status) 
          ��ֹ��ǰ�������е� Java ������� ����ĳ���������
   
 * static long currentTimeMillis() 
          �����Ժ���Ϊ��λ�ĵ�ǰʱ�䡣       
 * 
 */
public class SystemExitDemo {
	public static void main(String[] args) {
		System.out.println("����ϲ��");
		//System.exit(0);
		System.out.println("����Ҳϲ��");

		// ����ͳ�Ƴ��������ʱ��
		long start = System.currentTimeMillis();
		for (int x = 0; x < 10000; x++) {
			System.out.println("hello" + x);
		}
		long end = System.currentTimeMillis();
		System.out.println("������ʱ��" + (end - start) + "����");
	}
}
