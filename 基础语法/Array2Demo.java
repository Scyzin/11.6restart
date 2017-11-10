/*
	二维数组：
		一个元素为一维数组的数组。
	格式1：
		数据类型[][] 变量名= new 数据类型[m][n];
			int [][]arr = new int [3][2];
			三个一维数组arr[]，一维数组存放的是地址，每个数组里面有2个元素；
			int []x,y[]? x是一维数组，y是二维数组
	
	格式2：
		数据类型[][]变量名= new 数据类型[m][];	m必给不然找不到分配空间地址。
		一维数组的元素动态给出。
		arr[] 数组名;	arr[][] 为数组里的元素；
	格式3：数据类型[][]变量名=new 数据类型[][]{元素}{元素}； 静态初始化；
			int [][]arr = {{1,2}{3,4}{5,6,7}};
*/
class Array2Demo{
	public static void main(String[] args){
		/*
		int [][]arr = new int [3][2];
		System.out.println(arr);	//二维数组地址值[[I@175078b
		System.out.println(arr[0]);	//一维数组地址值[I@42552c
		System.out.println(arr[1]);	//地址值
		System.out.println(arr[1][1]);//0
		System.out.println(arr[2][1]);//0
		*/
		int [][]arr = new int[3][];
		//动态为一维数组分配空间；
		/*
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[1];
		System.out.println(arr[0]); //[I@42552c
		System.out.println(arr[1]); //[I@e5bbd6
		System.out.println(arr[2]); //[I@8ee016
		arr[1][2] =0; 
		*/
		int [][]arr = {{1,2}{3,4}{5,6,7}};
		System.out.println(arr[0][1]);
		System.out.println(arr[1][2]);//越界
		
	}
}
