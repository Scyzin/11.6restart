package exception;

/*
 * throw:�ڹ��ܷ����ڲ�����ĳ������������ܼ������У�
 * 		��Ҫ������תʱ������throw���쳣�����׳���
 * 
 * throws��throw����
 * 	throws:
 * 		���ڷ����������棬�������쳣����
		���Ը�����쳣�������ö��Ÿ���
		��ʾ�׳��쳣���ɸ÷����ĵ�����������
		throws��ʾ�����쳣��һ�ֿ����ԣ�����һ���ᷢ����Щ�쳣
		���������ʱ���쳣���Ͳ���throws
 * 
 * throw:
 * 		���ڷ������ڣ��������쳣������
		ֻ���׳�һ���쳣������
		��ʾ�׳��쳣���ɷ������ڵ���䴦��
		throw�����׳����쳣��ִ��throw��һ���׳���ĳ���쳣
 */

public class ExceptionDemo3 {
	public static void main(String[] args) {
		method();
		
		try {
			method2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//�������쳣���׳���Ҫ����
	}
	
	public static void method() {
		int a = 10;
		int b = 0;
		if (b == 0) {
			throw new ArithmeticException(); //�׳�һ������
		} else {
			System.out.println(a / b);
		}
	}
	
	//���exception�Ǽ̳���runningTime Exception���Ͳ����׳��쳣
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
