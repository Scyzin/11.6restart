/*
	����ʲôʱ����Ϊ��Ա������
		��������������������Ϣ��ʱ��
		
	�������׶���������ã�
		�����ķ�Χ��ԽСԽ�ã��ܼ�ʱ�ı����ա�
	import ����������е�classǰ��
*/
import java.util.Scanner;
class Demo{
	/*private int a;
	private int b;
	public int getNumber(){
		return a + b;
	}
	public int setNumber(int a ,int b){
		this.a = a;
		this.b = b;
	}
	*/
	public int sum(int a,int b){
		return a + b;
	}
}
//�������ݺ�
/*
class Test{
	public static void main(String[] args){
		Demo s = new Demo();
		int a =10;
		int b = 20;
		System.out.println("�������ݵĺ�Ϊ: " + s.sum(a,b));
	}
}
*/
//��������࣬�����ܳ�������ķ���
class Demo2{
	private int a;
	private int b;
	public void setLength(int a){
		this.a = a;
	}
	public void setWidth(int b){
		this.b = b;
	}
	public int Zhouc(int a,int b){
		return (a + b)*2;
	}
	public int Area(int a,int b){
		return a * b;
	}
}

class Test2{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("��������εĳ�:");
	int a =sc.nextInt();
	System.out.println("��������εĿ�:");
	int b =sc.nextInt();
	Demo2 s =new Demo2();
	s.setLength(a);
	s.setWidth(b);
	System.out.println("���ε����:" +s.Area(a,b));
	System.out.println("���ε��ܳ�:" +s.Zhouc(a,b));
	}
}