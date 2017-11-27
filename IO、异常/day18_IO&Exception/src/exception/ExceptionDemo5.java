package exception;

/* 1:final,finally��finalize������
* final�����յ���˼�����������࣬��Ա��������Ա����
* 		�����࣬�಻�ܱ��̳�
* 		���α����������ǳ���
* 		���η������������ܱ���д
* finally�����쳣�����һ���֣������ͷ���Դ��
* 		һ����˵������϶���ִ�У������������ִ�е�finally֮ǰjvm�˳���
* finalize����Object���һ��������������������
* 
* 2:���catch������return��䣬����finally����Ĵ��뻹��ִ����?
*   
* 	   �ᡣ��returnǰ�� 
* 	 ׼ȷ��˵��Ӧ�������м䡣
* 
* 3:try...catch...finally�ĸ�ʽ����
* 		A:try...catch...finally
* 		B:try...catch 
* 		C:try...catch...catch...
* 		D:try...catch...catch...finally
* 		E:try...finally
* 			����������Ŀǰ��Ϊ���ͷ���Դ��
*/

public class ExceptionDemo5 {
	public static void main(String[] args) {
		System.out.println(getInt());
	}

	public static int getInt() {
		int a = 10;
		try {
			System.out.println(a / 0);
		} catch (ArithmeticException e) {
			a = 30;
			return a;
			// ��return 30��������ص�·���Ѿ��γɡ����Ǻ�����finally
			// Ȼ��a =40,�ٻ�ȥִ��return 30;
		} finally {
			a = 40;
			return a;
		}
		// return a ;
	}
}
