package solo;

public class Teacher {
	private Teacher() {
		
	}
	private static Teacher t = null;
	
	//���ܳ����̰߳�ȫ���⣬������
	public	synchronized  static Teacher getTeacher() {
		//�͵�һ�ν�����ʱ�򴴽�����
		if(t ==null) {
			t= new Teacher();
		}
			return t ;
	}
}
