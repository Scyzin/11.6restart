/*
	final,���յ���˼�����������ࡢ����������
	
	final�಻�ܱ��̳У�
	final�������ܱ����ǣ�
	final�����ǳ������������ܱ����¸�ֵ
	
	final�������ξֲ�������
		�����ڲ��У��ñ��������Ա��ı䣻
		���������ϣ� 
			�������ͣ�ֵ���ܷ����ı�
			�������ͣ������͵ĵ�ֵַ���ܸı䣬���Ǹ��ڴ洢���ֵ���Ըı�ġ�
	final���α���ʱ��:
		��final���εı���ֻ�ܸ�ֵһ��
		�ڶ����췽�����ǰ
*/
class Student{
	int age = 10; 
	final int num;
	{
		num =3;
	}
	public Student{
		//num = 4;����������ȸ�ֵ��
	}
}
class FinalDemo{
	public static void main(String[] args){
		//��������
		int x = 10;
		x = 100;
		System.out.println(x);//100
		
		final int y = 10;
		//y = 10; y�ǳ����޷�Ϊy��ֵ��
		System.out.println(y);//10
		System.out.println("------");
		
		//�ֲ���������������
		Student s = new Student();
		System.out.println(s.age);//10
		s.age = 100;
		System.out.println(s.age);//100
		
		final Student ss = new Student();
		System.out.println(ss.age);//10
		ss.age = 100;
		System.out.println(ss.age);//100
		
		//�޷�Ϊss�ٴ����ռ�
		//Student ss = new Student();
	}
}


