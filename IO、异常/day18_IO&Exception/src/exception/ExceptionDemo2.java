package exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 	�������쳣��java���������ʾ�����������ᷢ�������޷�ͨ�����롣
 * 	�������쳣:����ʾ�������Ժͱ���ʱ�쳣һ����
 * 
 * 	try�﷢�����⣬jvm������һ���쳣���󣬽���������׳�����catch���ƥ�䡣
 * 	����ö�����ĳ�����͵ģ��ͻ�ִ��catch����Ĵ�����Ϣ��
 * 
 *  �쳣�еļ���������
 * 		public String getMessage():���ش� throwable ����ϸ��Ϣ�ַ����� 
 * 		public String toString()���ش� throwable �ļ��������
 * 			����������ַ����Ĵ������˶������� name  ": "��ð�ź�һ���ո� 
 * 				���ô˶��� getLocalizedMessage() �����Ľ�� 
 * 		public String getLocalizedMessage()������ throwable �ı��ػ�������
 * 		Ĭ��ʵ�ַ����� getMessage() ��ͬ�Ľ������������д���Ͱ�����ġ�
 * 		public void printStackTrace()
 * ��ȡ�쳣�������쳣��Ϣ���Լ��쳣�����ڳ����е�λ�á�����ֵvoid������Ϣ����ڿ���̨��
 * public void printStackTrace(PrintStream s)
 * ���� throwable ����׷�������ָ�����������
 * 
 * 		B	�����쳣 throws
 * ��ʽ��
 * 		throws �쳣����	Ҳ���Ը�����쳣��
 * 		ע�⣺�����ʽ������ڷ��������ź��档
 * 
 * ע�⣺
 * 		������Ҫ��main�������׳��쳣��
 * 		�����ҽ���Ϊ�˷����Ҿ��������ˡ�
 * 
 * С�᣺
 * 		�������쳣�׳������������߱��봦��
 * 		�������쳣�׳����������ÿ��Բ��ô���
 * 			
 */
public class ExceptionDemo2 {
	public static void main(String[] args) {

		System.out.println("���������ܺ�");
		try {
			method();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("���Ǿ��ǲ���������");

		String s = "2201-15-";
		SimpleDateFormat c = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d = c.parse(s);// ����һ��ParseException����Ȼ���׳�����catch����Ľ���ƥ��
			System.out.println(d);
		} catch (ParseException e) {// ParseException e = new ParseException();
			// e.printStackTrace();
			System.out.println("��������");
			// getMessage()
			System.out.println(e.getMessage());// Unparseable date: "2201-15-"

			// toString()
			System.out.println(e.toString());
			// java.text.ParseException: Unparseable date: "2201-15-"
		}
	}

	// �������쳣���׳�
	// �ڷ����������׳�����Ϊ�˸��ߵ����ߣ�ע�⣬�������⡣
	public static void method() throws ParseException {
		String s = "2014-11-20";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(s);
		System.out.println(d);
	}
}
