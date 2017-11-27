package exception;
/*
 * �쳣������Java���������й����г��ֵĴ���
 * 
 * Throwable:
 * 		error��ϵͳ����jvm������׳��ġ������ڴ治��ȡ�  ��̲�����
 * 		Exception:�������ڵı�����д���
 * 				runtime exception:�������ڴ��󣬴��벻�Ͻ�����Ҫ��������
 * 
 * jvmĬ�ϴ����쳣�����쳣�����ơ�ԭ�򼰳�������ĵط�����ڿ���̨�ϡ�����ֹͣ���С�
 * 
 * ��δ����쳣?
 * 		A: try ... catch ... finally
 * 		try{
 * 			���ܳ�������Ĵ��룻		����Խ��Խ��
 * 		}catch(�쳣������){
 * 			�������Ĵ���			����Ҫ����ʾ����
 * 		}finally{
 * 			�ͷŴ���;
 * 		}
 * 
 * 		ע�⣺ƽ����ϵ���쳣˭ǰ˭������ν��
 * 			     ����������Ӹ���ϵ������������ǰ�档
 * 			  exception ֻ�ܷ�����catch��
 * 
 *  JDK7���ֵ�������
 * 		try{
 * 			
 * 		}catch(�쳣1 |�쳣��2| �쳣��3  ������){
 * 		
 * 		}
 * 		
 * 		ȱ�㣺
 * 			a ��������ķ�ʽһֱ��
 * 			b �쳣������ƽ����
 * 			
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		
		//����쳣����ʽ1 : һ����try��catch
		int a = 10;
		int b = 0;
		try {
			System.out.println(a/b + "over");
		}catch(ArithmeticException ae) {
			System.out.println("Exception : an Integer cannot be divided by zero");
		}
		System.out.println("����Ŀ��Լ�������");
		
		int [] arr = {1,2,3,4};
		try {
			System.out.println(arr[4]);
		}catch(ArrayIndexOutOfBoundsException e ){
			System.out.println("����Խ��");
		}
		
		/*2��  try{
				.....
			}catch(�쳣������){
				��ʾ����;
			}catch(�쳣������){
				��ʾ����;
			}...
	һ��try����������⣬�ͻ�������׳���ƽ����������Ѱ�ң�ִ��catch����Ĵ���
	Ȼ��try��������ͻ�ֹͣ�ˡ�
			
			*/
		//2
		try {
			System.out.println(a/b + "over");
			System.out.println(arr[4]);
		}catch(ArithmeticException ae) {
			System.out.println("Exception : an Integer cannot be divided by zero");
		}catch(ArrayIndexOutOfBoundsException e ){
			System.out.println("����Խ��");
		}catch (Exception e) {
			System.out.println("��������");
		}
		//3
		try {
			System.out.println(a / b + "over");
			System.out.println("����Ĳ�����Լ�������");
			System.out.println(arr[4]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("��������");
		}
		System.out.println("game over");
		
	}

}
