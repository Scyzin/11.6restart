/*	
	�����������ͬ���Ժ���Ϊʱ������Щ���ݳ�ȡ������һ�����У�
	��ô�����������ظ����壬ֻҪ�̳м��ɡ�
	 
	�̳У������ظ��Ķ��塣��ߴ���ĸ����ԡ�
		  ����������Լ����ĳ�Ա��
		
		public class ���� extends ����{}
	�ô���
		��ߴ��븴���ԣ���ߴ����ά���ԣ�
		��������֮�������ϵ���Ƕ�̬��ǰ�ᡣ
	
	������ԭ�򣺵���ϣ����ھ�
		���:������Ĺ�ϵ
		�ھۣ��Լ����ĳ���µ�����
	java��֧�ֶ�̳�
		public class ���� extends ����{} ����{}//����
		����֧�ֶ��̳�
		public class ����1 extends ����{}
		public class ����2 extends ����1{}
		ע�����
				ֻ�ܼ̳з�˽�еĳ�Ա��
				����ֻ��ͨ��superȥ���ʸ���Ĺ��췽��
				��ҪΪ�˲��ֹ���ȥʹ�ü̳С�
*/
class Student{
	public void eat(){
		System.out.println("eat");
	}
	public void sleep(){
		System.out.println("sleep");
	}
}
class Teacher extends Student{
	public void drink(){
		System.out.println("drink");
	}
}
class ExtendsDemo{
	public static void main(String[] args){
		Student s =new Student();
		s.eat();
		s.sleep();
		
		Teacher c = new Teacher();
		c.eat();
		c.sleep();
		c.drink();
	}
}