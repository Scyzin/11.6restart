/*
	�ڲ��ࣺ
		���ඨ������������ڲ�
		
	�����ص㣺
		�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա
		�ⲿ��Ҫ�����ڲ���ĳ�Ա�����봴������
		
	��Ա�ڲ��ࣺ
		���ڳ�Ա������λ����
		���ã��ⲿ��.�ڲ���  ������ = �ⲿ�����.�ڲ������
		
		private ��֤���ݵİ�ȫ��
			static Ϊ�˷����������
			ע�⣺��̬�ڲ�����ʵ��ⲿ�����ݱ����þ�̬���Ρ�
	
	�ⲿ����ڲ���û�м̳й�ϵ��ͨ���ⲿ�����޶�this����
		
		class Body {
			private class Heart {
				public void operator() {
					System.out.println("�������");
				}
			}
			
			public void method() {
				if(����������ҽ��) {
					Heart h = new Heart();
					h.operator();
				}
			}
		}
		
		Body b =  new Body();
		b.method();
		
		�ֲ��ڲ���
		A:����ֱ�ӷ����ⲿ��ĳ�Ա
		B:�ھֲ�λ�ã����Դ����ڲ������ͨ����������ڲ��෽������ʹ�þֲ��ڲ��๦��
	
		�ֲ��ڲ�����ʾֲ�������ע������?
		A:�ֲ��ڲ�����ʾֲ�����������final����
		B:Ϊʲô��?
			�ֲ����������ŷ����ĵ��ö����ã����ŵ�����϶���ʧ��
			�����ڴ�����ݲ�����������ʧ�����ԣ����Ǽ�final���Ρ�
			����final���κ���������ͳ��˳�������Ȼ�ǳ���������ʧ�ˡ�
			�����ڴ��д洢��������20�����ԣ��һ�����������ʹ�á�
*/

class Outer{
	private static int num =2 ;
	
	public static class Inner{
		public void show(){
			System.out.println(num);
		}
		
		public static void show2() {
			//System.out.println(num);
			System.out.println(num);
		}
	}
	
	public void method(){
		//int num2 = 20;
		//final int num2 = 20;
		class Inner {
			public void show() {
				System.out.println(num);
				//���ڲ����з��ʱ��ر���num2; ��Ҫ������Ϊ��������
				System.out.println(num2);//20
			}
		}
		
		//System.out.println(num2);
		Inner i = new Inner();
		i.show();
	}
}
class InnerClassDemo{
	public static void main(String[] args){
		//�޶��¾�̬��
		//Outer.Inner oi = new Outer().new Inner();
		//oi.show;
		
		//��Ա�ڲ��౻��̬���κ�ķ��ʷ�ʽ��:
		//��ʽ���ⲿ����.�ڲ����� ������ = new �ⲿ����.�ڲ�����();
		Outer.Inner oi = new Outer.Inner();
		oi.show();
		oi.show2();
		
		//show2()����һ�ֵ��÷�ʽ
		Outer.Inner.show2();
		
		Outer o = new Outer();
		o.method();
	}
}