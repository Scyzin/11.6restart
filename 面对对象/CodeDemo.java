/*
	����飺{}
		�ֲ������ ���ֲ�λ�ã������޶��������������ڡ�
		��̬����飺�����Աλ�ã��ڹ�������ǰ��static��������г�ʼ����ִֻ��һ�Ρ�
		�������飺����һ�ι��췽�����͵���һ�ι������顣�Զ����ʼ����
	��̬����� >�������� >���췽����	
	������������Ĺ��췽�������
		
*/
 class Code{
	 static{
		 System.out.println("��̬�����");
	 }
	 {
		 System.out.println("��������");
	 }
	 public Code(){
		 System.out.println("���췽��");
	 }
 }
 class CodeDemo{
	 static{
		 System.out.println("�Һܿ���");
	 }
	 public static void main(String[] args){
		 System.out.println("main����");
		 
		 Code s1 = new Code();
		 Code s2 = new Code();
	 }
 }	