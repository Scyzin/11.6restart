/*	
	��������û�����ֵĶ���
	Ӧ�ã�
		����ֻ����һ�Σ����ʺϵ��ö�Ρ�
		�����꣬�ͱ������������ա�Ч�ʸ��ߡ�
		���Ե���ʵ�ʲ���ʹ�á�
	
*/
class Student{
	public void shouw(){
		System.out.println("��ϲ����");
	}
}
class AnonymityDemo{
	public static void main(String[] args){
		Student s = new Student();
		s.show;
		s.show;
		//����������÷���
		new Student().show();
		new Student().show();
	}
}