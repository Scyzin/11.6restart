/*
	�ࣺһ��ģ�塣
		��Ա�������������������������
				  �ͱ����Ķ���ʱһ���ĸ�ʽ�����������෽���⡣
		��Ա�������������Ϊ
				  �ͷ����Ķ���һ����ȥ��static��
		
	���������һ��ʵ����
		Ҫ�ȴ������󣬲��ܵ��÷�����
	��δ�������ʹ�ã�
				��ʽ������ �������ñ��� = new ����();	
				�������ñ����Ͷ����ǲ�һ���ġ��������������ֲ����ǿ��Ժ���
	ʹ�ó�Ա��������	
				������.������
	ʹ�ó�Ա��������
				������.����(����������������);
*/
//����һ����
/*
class Class{
	//�������
	String name;
	int age;
	String address;
    //���巽��
	public void study{
		System.out.println("study");
	}
	public void eat{
		System.out.println("eat");
	}
}
*/
//����һ����
class Phone{
	String brand;
	int price;
	String color;
	public void call(String name){
		System.out.println("��"+name+"��绰");
	}
	public void send(){
		System.out.println("Ⱥ������");
	}
	public void play(){
		System.out.println("����Ϸ");
	}
}
//������
class PhoneTest{
	public static void main(String[] args){
	//��������
	Phone p = new Phone();
	//�����Ա����
	System.out.println(p.brand + "-----" + p.price +"----" +p.color);
	//��Ա������ֵ
	p.brand = "��Ϊ";
	p.price = 2500;
	p.color = "yellow";
	System.out.println(p.brand + "-----" + p.price +"----" +p.color);
	//���÷���  ������.����
	p.call("����");
	p.send();
	p.play();
	}
}
