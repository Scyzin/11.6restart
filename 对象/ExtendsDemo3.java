/*
	�������ǣ���д����
		�����г��ֺ͸����з�������һ���ķ�����
		ԭ�� 
		���������÷�����ʱ��
		�������౾�����Ҹ��ࡣ
	
	ע�⣺A:������˽�з������ܱ���д
			��Ϊ����˽�з�������������޷��̳�
		  B:������д���෽��ʱ������Ȩ�޲��ܸ���	public private
			��þ�һ��
	      C:���ྲ̬����������Ҳ����ͨ����̬����������д
			��ʵ����㲻�Ϸ�����д��
			
		������д���෽����ʱ���������һģһ����
	
	�������أ�
			�����г��ֵķ������������Ͳ�ͬ���뷵��ֵ�޹ء�
		��̬����Ҳ�ܱ��̳С� 	�����ܱ����ǡ�
		
	��������override��
	�������У����ֺ͸�����һģһ���ķ�������������
	
	��������overload��
		ͬһ�����У����ֵķ�������ͬ�������б�ͬ������

		���������ܸı䷵��ֵ���ͣ���Ϊ���ͷ���ֵ�����޹ء�
*/
class Phone{
	public void call(String name){
		System.out.println("��" + name +"��绰");
	}
}
class NewPhone extends Phone{
	public void call(String name){
		super.call(name);
		System.out.println("����������");
	}
}
class ExtendsDemo3{
	public static void main(String[] args){
		 NewPhone p = new NewPhone();
		 p.call("��");
		 
	}
}
