/*
	����֪�⣺������n��a ��֪��ʲô��˼��
	�ؼ���this��ָ���÷����Ķ���
		���Ŷ���Ĵ���������
		��ǰ��Ķ������ã��򵥾ʹ���ǰ���һ������
		ע�⣺�������ĸ�������ã�this�ʹ����ĸ�����
	Ӧ�ã�	
		����ֲ��������س�Ա������
*/
class Demo{
	private String name = "��";
	private int age;
	
	public String getName() {
		return name;//������this
	}
	
	public void setName(String name) {
		//name = name;//�ͽ�ԭ�򣬰��Լ������Լ���
		//�������ֻ��ͨ����������
		//java���ṩ��һ���ؼ���:this
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
class ThisDemo{
	public static void main(String[] args){
		Demo d = new Demo();
		
		d.setAge(10); 
		d.setName("��"); 
		System.out.println(d.getAge() + d.getName());
	}
}