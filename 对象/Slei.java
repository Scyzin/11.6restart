/*
	������
		��Ա����
		��Ա����
		���췽��
		���ݷ���ֵ��
				void����
				��void����
			��ʽ������
				�ղη���
				�ǿղη���
		
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
		s1.method("����ʤ");
		String result2 = s1.function("Hello","world");
		System.out.println(result2);
	}
}