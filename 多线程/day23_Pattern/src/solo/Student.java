package solo;

public class Student {
	private Student() {
		
	}
	//��̬����ֻ�ܷ��ʾ�̬��Ա����
	private static Student s = new Student();
	
	public static Student getStudent() {
		return s ;
	}
	
}
