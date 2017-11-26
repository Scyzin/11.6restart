package objectarray;

public class ObjectArrayDemo {
	public static void main(String[] args) {
		Student [] students = new Student[5];
		Student s1 = new Student("林青霞",28);
		Student s2 = new Student("林青霞",28);
		Student s3 = new Student("林青霞",28);
		Student s4 = new Student("林青霞",28);
		Student s5 = new Student("林青霞",28);
		
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		students[4] = s5;
		
		for(int x= 0 ;x <students.length;x++) {
			//千万别用string ,否则会出类型转换异常
			//自己注意点
			Student s = students[x];
			System.out.println(s.getAge()+s.getName());
		}
		
	}
}
