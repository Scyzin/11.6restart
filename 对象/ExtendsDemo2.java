/*
	ʲôʱ���Ǽ̳У�
		˭��ʲô��һ�֣�B��A��һ�ֻ���A��B��һ�֡�
		
	�����ɣ�
			��Ա����
			���췽��
			��Ա����
	�̳��г�Ա�����Ĺ�ϵ�� 
		A:�����еĳ�Ա�����͸����еĳ�Ա�������Ʋ�һ������
		B:�����еĳ�Ա�����͸����еĳ�Ա��������һ����
			�����෽���з���һ�������Ĳ���˳��
				a:�����෽���ľֲ���Χ�ң��о�ʹ��
				b:������ĳ�Ա��Χ�ң��о�ʹ��
				c:�ڸ���ĳ�Ա��Χ�ң��о�ʹ��
				d:������Ҳ������ͱ���
		this �� super������
				this����������ã�
				super������洢�ռ�ı�ʶ��(���Ե��ø���ĳ�Ա���������췽��������)
				Ӧ�ó�����this��ͬ��
				���ó�Ա������super.��Ա����
				���ù��췽����super(���췽��)
				���÷�����super.��Ա������
				
		���������еĹ��췽������Ĭ�Ϸ��ʸ����пղ����Ĺ��췽����
			�����̳и����е����ݣ����ܻ���ʹ�ø�������ݡ�
			���ԣ������ʼ��֮ǰ��һ��Ҫ����ɸ������ݵĳ�ʼ����
			ÿһ�����췽���ĵ�һ�����Ĭ�϶��ǣ�super();
			
		��θ�����û�й��췽��������ô����?		�ᱨ��
			����ͨ��superȥ��ʾ���ø��������Ĵ��εĹ��췽��
			����ͨ��thisȥ���ñ�����������췽��
			������������Ҳ�������ȷ����˸��๹��
		һ��Ҫע�⣺
				super(��)����this(��.)��������ڵ�һ�����ɽ
				���򣬾ͻ��и������ݵĶ�γ�ʼ��	
				
		�̳��г�Ա�����Ĺ�ϵ:
		A:�����еķ����͸����еķ���������һ����
		B:�����еķ����͸����еķ�������һ����
			ͨ�����������÷�����
				a:���������У�����û������������о�ʹ��
				b:�ٿ������У���û������������о�ʹ��
				c:���û�оͱ���			

*/

class Father{
	public int num3 =10;//��������
	public void method(){//�����ҵ��⣬������super
		int num = 20;
		System.out.println("method ����");
	}
	public Father(){
		System.out.println("���Ǹ�����޲ι��췽��");
	}
	public Father(String name){
		System.out.println("���Ǹ���Ĵ��ι��췽��");
	}
}
class Son extends Father{
	public int num2 = 20;//������
	
	public void method(){
	
		System.out.println("method ����");
	}
	public void show() {//������
		int num = 40;
		System.out.println(num);
		System.out.println(this.num2);
		// �Ҳ�������
		System.out.println(super.num3);
	}
	public Son(){
		super();//Ĭ��������
		System.out.println("����������޲ι��췽��");
	}
	public Son(String name){
		System.out.println("��������Ĵ��ι��췽��");
	}
}
class ExtendsDemo2{
	public static void main(String[] args){
		Son s = new Son();
		s.show();
		s.method();
		System.out.println("-----");
		Son s2 = new Son("���");
		
	}
}