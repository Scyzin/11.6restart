/*
	�������أ�
		����Ϊ����ͬ�������Ĺ�����ͬ�������б�ͬ�����
		���Ƿ����ĵ�������Ҫ��������֪�⡣
		java������������ͬ�����֡�
		����Ƿ������ء���
		
		��ͬһ�����У��������һ�����ϵ�ͬ��������ֻ
		Ҫ���ǵĲ����������߲������Ͳ�ͬ���ɡ�
	�ص㣺
		�뷵��ֵ�����޹أ�ֻ���������Ͳ����б�
		�ڵ���ʱ�������ͨ�������б�Ĳ�ͬ������ͬ��������
		Ҳ���ǲ������ͺͲ����������ֱ𷽷���

*/
class FunctionDemo2 {
	public static void main(String[] args) {
		//jvm����ݲ�ͬ�Ĳ���ȥ���ò�ͬ�Ĺ���
		System.out.println(sum(10,20));
		System.out.println(sum(10,20,30));
		System.out.println(sum(10,20,30,40));
		
		System.out.println(sum(10.5f,20f));
	}
	
	public static int sum(int a,int b) {
		System.out.println("int");
		return a + b;
	}
	
	public static int sum(int a,int b,int c) {
		return a + b + c;
	}
	
	public static int sum(int a,int b,int c,int d) {
		return a + b + c + d;
	}
	
	public static float sum(float a,float b) {
		System.out.println("float");
		return a + b;
	}
}