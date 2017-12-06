package solo;

public class Teacher {
	private Teacher() {
		
	}
	private static Teacher t = null;
	
	//可能出现线程安全问题，加锁。
	public	synchronized  static Teacher getTeacher() {
		//就第一次进来的时候创建对象
		if(t ==null) {
			t= new Teacher();
		}
			return t ;
	}
}
