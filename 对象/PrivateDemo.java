/*
	��װ����
		��ָ���ض�������Ժ�ʵ��ϸ�ڣ��������ṩ�������ʷ�ʽ��
	�ô���
		����ʵ��ϸ�ڣ��ṩ�����ķ��ʷ�ʽ
		����˴���ĸ�����
		��߰�ȫ�ԡ�
	��װԭ��
		������Ҫ�����ṩ�����ݶ�����������
		���������أ��ṩ��������������ʡ�
	private�ؼ��֣�
		��һ��Ȩ�����η���
		�������γ�Ա(��Ա�����ͳ�Ա����)
		��private���εĳ�Աֻ�ڱ����в��ܷ��ʡ�
	��װ��private��Ӧ�ã�
		A:�ѳ�Ա������private����
		B:��߶�Ӧ��getXxx()��setXxx()����		����ǧ������Ǽ�()
	���Ա��������򣬷�ֹ�������޸ġ�	
*/
class Demo{
	private String name = "��";
	private int age;
	public String getName() {
		return name;
	}
	
	//��������ֵ
	public void setName(String n) {
		name = n;
	}
	//�����ȡֵ
	public int getAge() {
		return age;
	}
	
	//���丳ֵ
	public void setAge(int a) {
		age = a;
	}
}
//������
class PrivateDemo{
	public static void main(String[] args){
		Demo d = new Demo ();
		System.out.println(d.getName());
		//ͨ�����÷������޸�ֵ�����޸�ԭ��������
		//
		d.setName("���");
		d.setAge(5);
		System.out.println(d.getAge() + d.getName());
	}
}