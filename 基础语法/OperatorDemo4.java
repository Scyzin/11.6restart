/*
	�Ƚ��������
			==,!=,>,>=,<,<=
		���������boolean���͡�true false
		
		== ����д�� =
		
	�߼��������
			&&	||	&	^	!	|
			�������Ӳ����ͱ��ʽ����ֵ��
			a == b
	���ۣ�
		&�߼���:��false��false��
		|�߼���:��true��true��
		^�߼����:��ͬΪfalse����ͬΪtrue��
			���������¹�ϵ������,��Ů,Ů��,ŮŮ
		!�߼���:��false��true����true��false��
			�ص㣺ż�������ı䱾��
		
		&&��&������? ͬ��||��|������?
		���ս��һ����
		&&���ж�·Ч���������false���ұ߲�ִ�С�
		|| �����true���ұ߲�ִ�С�
		
		�����г��õ��߼��������
		&&,||,!	
		
*/
class OperatorDemo4{
	public static void main(String[] args){
		int x = 3;
		int y = 4;
		int z = 3;
		
		System.out.println(x==y);//false
		System.out.println(x!=y);//true
		System.out.println(x>=y);//false
		
		boolean flag = (x == y);
		System.out.println(flag);//false
		//������� boolean flag = (x = y);
		
		//&�߼���
		System.out.println((a > b) & (a > c)); //false & false = false
		System.out.println((a > b) & (a < c)); //false & true = false
		System.out.println((a < b) & (a > c)); //true & false = false
		System.out.println((a < b) & (a < c)); //true & true = true
		System.out.println("---------------");
		
		//|�߼���
		System.out.println((a > b) | (a > c)); //false | false = false
		System.out.println((a > b) | (a < c)); //false | true = true
		System.out.println((a < b) | (a > c)); //true | false = true
		System.out.println((a < b) | (a < c)); //true | true = true
		System.out.println("---------------");
		
		//^�߼����
		System.out.println((a > b) ^ (a > c)); //false ^ false = false
		System.out.println((a > b) ^ (a < c)); //false ^ true = true
		System.out.println((a < b) ^ (a > c)); //true ^ false = true
		System.out.println((a < b) ^ (a < c)); //true ^ true = false
		System.out.println("---------------");
		
		//!�߼���
		System.out.println(!(a > b)); //!false = true
		System.out.println(!(a < b)); //!true = false
		System.out.println(!!(a > b)); //!!false = false
		System.out.println(!!!(a > b)); //!!false = true
		
		//&&˫��
		System.out.println((a > b) && (a > c)); //false && false = false
		System.out.println((a > b) && (a < c)); //false && true = false
		System.out.println((a < b) && (a > c)); //true && false = false
		System.out.println((a < b) && (a < c)); //true && true = true
		System.out.println("----------------");
		
		int x = 3;
		int y = 4;
		
		//boolean b1 = ((x++ == 3) & (y++ == 4));
		//boolean b1 = ((x++ == 3) && (y++ == 4));
		//boolean b1 = ((++x == 3) & (y++ == 4));
		boolean b1 = ((++x == 3) && (y++ == 4));
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println(b1);
	}
}