/*
	Ϊһ��ʼ������Ӹ����������Ĺ���
	
	�ӿڵ��ص㣺
		A���ӿ��ùؼ���interface��ʾ��
				interface �ӿ��� {}
		B��Ϊ��ʵ�ֽӿ� ��implements��ʾ
				class ���� implements �ӿ���{}
		���η� interface �ӿ���{
			����������
			����ǩ����
		}
		C:�ӿڲ���ʵ����
			ͨ����̬��ʵ���� 
		D:�ӿڵ�����
			�����ǳ����࣬���岻��
			�����࣬Ҫ��д�ӿ��е����г��󷽷������ǣ� ��
*/
 
interface AnimalTrain{
		public abstract void jump();
}

//������ʵ�ֽӿ�
abstract class Dog implements AnimalTrain{
	
}

//������ʵ�ֽӿ�
class Cat implements AnimalTrain{
		public void jump(){
			System.out.println("����");
		}
}

class ApiDemo{
	public static void main(String[] args){
		AnimalTrain at = new Cat();
		at.jump();
	}
}
