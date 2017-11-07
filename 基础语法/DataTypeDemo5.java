/*
	
		double d = 12.345;
		float f = d;	错误，大到小要进行强制转换。
		
		f1其实是通过一个double类型转换过来的。
		而f2本身就是一个float类型。
*/


class DataTypeDemo5 {
	public static void main(String[] args) {
		//把double赋值给float，加了强制类型转换
		double d = 12.345;
		float f = (float)d;
		
		float f1 = (float)12.345;
		float f2 = 12.345F;
	}
}