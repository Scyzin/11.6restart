/*
	数据类型：Java是一种强类型的语言，针对每一种数据都定义了明确的数据类型
	
	数据类型分别：
			基本数据类型
			引用数据类型（类，接口，数值）
			
	基本数据类型：4类8种
			整数		占用字节数
				byte 		1
				short 		2	
				int 		4			
				long 		8
			浮点数
				float		4
				double		8
				
			字符
				char		2
			布尔
				boolean		1
			整数默认是int类型，浮点数默认是double类型；
			长整形后缀有l或者L。单精度浮点数据加f标示。
*/	
class DataType{
	public static void main(String[] args){
		//定义变量的格式；
		//数据类型	变量名	= 	初始化值；
		byte b = 10;
		System.out.println(10);
		System.out.println(b);
		
		//定义一个短整形变量
		short s = 100;
		System.out.println(s);
		
		//定义一个整形变量
		int i = 100;
		System.out.println(i);
		
		//定义一个长整形变量
		long j = 100000000L;
		System.out.println(j);
		
		//定义浮点数据变量
		float f = 12.354F;
		System.out.println(f);
		double g = 123.434;
		System.out.println(g);
		
		//定义字符
		char a ='A';
		System.out.println(a);
		
		
	}
}