/*
	�ӿڳ�Ա�ص�
		��Ա������ֻ���ǳ����������Ǿ�̬�ġ�
				Ĭ�����η���public static final
				�Լ��ֶ�������
		���췽�����ӿ�û�й��췽��������չ���ܵģ���û�о������
		��Ա������ֻ���ǳ��󷽷���
				Ĭ�����η���public abstract
				�Լ��ֶ�������
		
	���е��඼Ĭ�ϼ̳���һ���ࣺObject��
	�� Object �����νṹ�ĸ��ࡣÿ���඼ʹ�� Object ��Ϊ���ࡣ
*/
interface Inter {
	public int num = 10;
	public final int num2 = 20;
	public static final int num3 = 30;
	
	//����: ��Ҫ<��ʶ��>
	//public Inter() {}
	
	//�ӿڷ������ܴ�������
	//public void show() {}

	//abstract void show(); //Ĭ��public
	public void show(); //Ĭ��abstract
}

//�ӿ���+Impl�ǽӿڵ�ʵ�����ʽ
class InterImpl extends Object implements Inter {
	public InterImpl() {
		super();
	}
	
	public void show() {}
}

//������
class ApiDemo2 {
	public static void main(String[] args) {

		Inter i = new InterImpl();
		System.out.println(i.num);
		System.out.println(i.num2);
		//i.num = 100;
		//i.num2 = 200;
		//System.out.println(i.num); //�޷�Ϊ���ձ���num����ֵ
		//System.out.println(i.num2);//�޷�Ϊ���ձ���num2����ֵ
		System.out.println(Inter.num);
		System.out.println(Inter.num2);
		System.out.println("--------------");
	}
}