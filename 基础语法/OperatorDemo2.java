/*
	++,--�������ʹ��
		���ã����ǶԱ��������������Լ���
			���������á�
		����ʹ�ã���ǰ����涼һ��
		��������ʹ�ã�
			���ڲ���ǰ�棬�����������Լ���Ȼ���ٲ������㣻
			���ڲ������棬�Ȳ������㣬���������Լ�
	+�����㣺
		�ӷ�
		����
		�ַ������ӷ�
*/
class OperatorDemo2{
	public static void main(String[] args){
		int x = 3;
		int y = 4;
		
		//�ַ�����ƴ��
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		//�Ӽ��ں�ֵ���䣬�����ֵ꣬+1��
		x++;
		y--;
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		
		//��������ʹ��
		int a = 3;
		int b = 4;
		
		int c = a++;
		int d = b--;
		//int c = ++a;
		//int d = --b;
		System.out.println("a:" + a);	//4	4
		System.out.println("b:" + b);	//3	3	
		System.out.println("c:" + c);	//3	4
		System.out.println("d:" + d);	//4	3
		
		System.out.println(3 + 4);//�ӷ�
		System.out.println(+4);//����
		System.out.println('a' + 1);//�ӷ���98
		System.out.println("Helo" + 'a' + 1);//�ַ������ӷ�	Heloa1
		System.out.println('a' + 1 + "Helo" );		//98Helo
	}
}
// a = 10; b = 11; c = 10;
// a = 9; b = 11; c = 9;
// a = 10; b =10; c = 9;
// a = 9; b = 10; c= 8;

// x = 6;y = 70