package jdk5news;
/*
 * �����ࣺ�ѷ��Ͷ���������
 * ��ʽ:public class ����<��������1,��>

 * 
 * ���ͷ��� :���Ͷ����ڷ�����
 * 			���Խ���������������
 * ��ʽ:public <��������> �������� ������(�������� .)
 * 
 * �ѷ��Ͷ����ڽӿ���
 * 	��ʽ:public  interface �ӿ���<��������1��>
 */
public class ObjectTool <T>{
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	//����arraylist�� add����
	public <T> void show(T t) {
		System.out.println(t);
	}
	
	
	 

}
