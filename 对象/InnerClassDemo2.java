/*
	�����ڲ��ࣺ
		�����ڲ���ļ�д��
		
	
	new ������ӿ���{
		��д������
	}			������ʾ��Ǽ̳�������Ǹýӿڵ�������������
	
*/

interface Inter{
	public abstract void show();
}

class Outer{
	public void method(){
		
		Inter i = new Inter(){		//��̬   �� f = new �� ()
			public void show(){
				System.out.println("show");
			}
		};
		i.show(); 
	}
}
/*�����ڲ����ڿ����е�ʹ��
class InnerClassDemo2{
	public static void main(String[] args){
		Outer o = new Outer();
		o.method();
	}
}

interface Person{
	public abstract void study();
}

class PersonDemo{
	public void method(Person p){
		p.study();
	}
}

class Student implements Person{
	public void study(){
		System.out.println("�ú�ѧϰ����������")��
	}
}

class InnerClassDemo3{
	PersonDemo pd = new PersonDemo();//��������
	Person p = new Student();//��̬
	pd.method(p);
	System.out.println("------");
	
	PersonDemo ps = new PersonDemo();
	pd.method(new Person {
		public void study(){
			System.out.println("�ú�ѧϰ����������");
		}
	})
}
*/
