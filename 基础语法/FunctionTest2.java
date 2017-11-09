/*
	比较两个数据是否相等。参数类型分别为
		两个byte类型，两个short类型，两个int类型，两个long类型，
	并在main方法中进行测试
	
	只有两个short类型的相等。
*/
class FunctionTest2 {
	public static void main(String[] args) {
		byte b1 = 3;
		byte b2 = 4;
		System.out.println("byte:"+compare(b1,b2));
		
		short s1 = 5;
		short s2 = 5;
		System.out.println("short:"+compare(s1,s2));
		
		int a1 = 3;
		int a2 = 4;
		System.out.println("int:"+compare(a1,a2));
		long c1 =3L;
		long c2 =4L;
		System.out.println("long:"+compare(c1,c2));
	}
	
	//byte类型
	public static boolean compare(byte a,byte b) {
		System.out.println("byte");
		return a == b;
	}
	
	//short类型
	public static boolean compare(short a,short b) {
		System.out.println("short");
		return a == b;
	}
	
	//int类型
	public static boolean compare(int a,int b) {
		System.out.println("int");
		return a == b;
	}
	
	//long类型
	public static boolean compare(long a,long b) {
		System.out.println("long");
		return a == b;
	}
}