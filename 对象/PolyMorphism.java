/*
	��̬��ĳ�������ͬʱ�̱��ֳ���ͬ״̬��
		 ˮ����Һ����
	ǰ�᣺	�м̳й�ϵ
			Ҫ�з������ǣ���Ȼû����!!
			Ҫ�и����������ࣺ	��f = new ��();
	��Ա�����ص㣺
		��Ա������	��������ж�����ߣ�������.
		���췽����	�����������ʱ�����ʸ���Ĺ��췽�����Ը������ݽ��г�ʼ����
		��Ա������	���뿴��� ���࣬���п��ұ�  ����
		��̬���Σ����뿴���࣬���п����ࡣ
		
		��Ա���������ڷ������ǣ����Զ�̬���п����ࡣ
		
	��Ҳ�Ƕ�̬�ı׶ˣ� ����ʹ����������й���	
		
		���ʹ����������й��ܣ�
			1.�������������÷���������̫ռ���ڴ�ռ䣩
			2.�Ѹ��������ǿ��ת��Ϊ��������ã�����ת�ͣ�
		
		������ת�ͣ�
			����ת�ͣ�Fu f = new Zi()
					���ӵ�������������ָ���������

			����ת�ͣ� Zi z = (Zi)f //Ҫ��f�������ܹ�ת��Ϊzi�ġ�
					�Ӹ�����  ��������תΪ�������
				���׳�������ת���쳣��

*/
class Fu{
	public int num = 100;
	
	public void show(){
		System.out.println("show father");
	}
}

class Zi extends Fu{
	public int num = 1000;
	
	public int num2 = 200;
	
	public void show(){
		System.out.println("show zi");
	}
	
	public void method(){
		System.out.println("show method");
	}
}

class PolyMorphism{
	public static void main(String[] args){
		Fu s = new Zi();
		System.out.println(s.num);
		//System.out.println(s.num2);������󣬸�������û��num2
		
		s.show();
		//������󣬸�������û��method
		//s.method();
	}
}