/*
	类的组成
		成员变量
		成员方法
		构造方法
		根据返回值：
				void类型
				非void类型
			形式参数：
				空参方法
				非空参方法
		
*/
class Slei{
	private String name;
	private int age;
	public String getString(){
		return "Hello,world";
	}
	public void show(){
		System.out.println("Hello");
	}
	public void method(String name) {
		System.out.println(name);
	}
	public String function(String s1, String s2){
		return s1 + s2;
	}
}
class SleiTest{
	public static void main(String[] args){
		Student s1 = new Slei();
		String result = s1.getString();
		System.out.println(result);
		s1.show();
		s1.method("陈遵胜");
		String result2 = s1.function("Hello","world");
		System.out.println(result2);
	}
}