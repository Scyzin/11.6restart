/*
	�����ࣺ�̳У����ܶ�̳У����Զ��̳�
	����ӿ�:ʵ�ֹ�ϵ�����Ա߼̳б�ͬʱʵ�ֶ���ӿ�
	�ӿ���ӿڣ��̳й�ϵ�����Ե��̳У�Ҳ���Զ�̳�
	
	������ͽӿڵ�����
	A:��Ա����
		�����ࣺ
			��Ա���������Ա�����Ҳ���Գ���
			���췽������
			��Ա���������Գ���Ҳ���Էǳ���
		�ӿڣ�
			��Ա������ֻ���Գ���
			��Ա������ֻ���Գ���
*/
interface Father{
	public abstract void show();
}

interface Mother{
	public abstract void show2();
}

interface Sister extends Father,Mother{
	
}

class Son extends Object implements Father,Mother{
	public void show(){
		System.out.println("show son");
	}
	
	public void show2(){
		System.out.println("show2 son");
	}
}

class ApiDemo3{
	public static void main(String[] args){
		Father f = new Son();
		f.show();
		
		Mother m = new Son();
		m.show2();
	}
}