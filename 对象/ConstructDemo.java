/*
	���췽����
			����������ݽ��г�ʼ������������������
			
			Student s = new Student();
	
	��ʽ��
		��������������ͬ��
		����û�з���ֵ���ͣ�ûvoid��
		û�о���return��
		
	ע�⣺
		û�������췽����ϵͳ���Զ��ṩһ���޲ι��췽��
		�����˹��췽����ϵͳ�������ṩĬ�ϵ��޲ι��췽��
		����Լ������޲ι��췽��
	
	����Ա������ֵ�����ַ�ʽ��
		setXxx()
		���췽��	
*/
class Student{
	private String name;
	private int age;
}
	public Student(){
		System.out.println("�����޲ι��췽��");
	}
	
	public Student(String name){
		System.out.println("���Ǵ�һ��String���͵Ĺ��췽��");
		this.name = name;
	}
	
	public Student(String name,int age) {
		System.out.println("����һ������������Ĺ��췽��");
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println(name+"---"+age);
	}
	
class ConstructDemo{
	public static void main(String[] args){
		Student s = new Student();
		s.show();
		System.out.println("------");
		
		Student s2 = new Student("����ϼ");
		s2.show();
		System.out.println("-------------");
		
		Student s3 = new Student(27);
		s3.show();
		System.out.println("-------------");
	}
}