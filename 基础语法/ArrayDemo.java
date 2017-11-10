/*
	数组：	
		是存储同一种数据类型多个元素的集合。可以看成是一个容器
		既可以存储基本数据类型，也可以存储引用数据类型。
	数组格式：
		数据类型 [] 数组名；推荐使用
		数据类型 数组名 [];
		
		int [] array;	定义一个int类型的数组a变量
		int array [];	定义一个int类型的a数组变量
	数组初始化：
		要初始化才能使用。
		为数组元素分配内存空间，并为每个数组元素赋值。
		两种方式：
			动态：先指定数组长度，后分配初始值
				数据类型[] 数组名= new数据类型[数组长度]
				int []a = new int[3];
			静态：先指定初始值，系统后决定数组长度。	一般常用
				数据类型[] 数组名 = new 数据类型[]{元素1,元素2,…};
				简化：数据类型[] 数组名 = {1,2,3}；
			动态和静态不能同时使用。	
	获取数组中的元素：
				数组名【索引】，从0开始，最大为长度-1。
			
	数组操作的两个常见小问题：
		数组索引越界异常。
		数组下标最大值为长度-1；	访问了不存在的索引。
		int []arr = {1,2,3};
		System.out.println(arr[3]);
		
		空指针异常：
			数组已经不再指向对应内存。
			arr = null;
			System.out.println(arr[0]);
*/

class ArrayDemo{
	public static void main(String[] args){
		//左边 数据类型int,数组名arr
		//右边 new为数组分配空间，3数组个数
		int [] arr = new int[3];
		System.out.println(a);//[@175078b 地址值
		System.out.println(arr[0]);//0
		System.out.println(arr[1]);//0
		System.out.println(arr[2]);//0
		//数组中每个元素有编号，下标最大为数组长度减1；
		//[]+下标获取指定编号的元素。 这叫索引。 数组名[索引]。
		//动态初始化，然后赋值
		int [] arr =new int(3);
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		//静态初始化
		int [] ar1 = new int {1,2,3};
		System.out.println(arr[0]);
		int [] ar2 = {1,2,3};
			System.out.println(ar1[0]);//1
			System.out.println(ar2[1]);//2
			
	}
}