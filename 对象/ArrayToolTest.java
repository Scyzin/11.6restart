/*	
	如何写一个帮助文档？
		写一个工具类  
		加一个文档注释。  
		javadoc解析文档注释  
		格式：javadoc -d 目录 -author -version ArrayTool.java
	如何使用帮助文档？	
		1:打开帮助文档
		2:点击显示，找到索引，看到输入框
		3:知道你要找谁?以Scanner举例
		4:在输入框里面输入Scanner，然后回车
		5:看包
		java.lang包下的类不需要导入，其他的全部需要导入。
		6:看看类的解释和说明，看看该类的版本
		7:看类的结构
			成员变量	字段摘要 	
			构造方法	构造方法摘要 
			成员方法 	方法摘要
		8:学习构造方法	
			A:有构造方法	就创建对象
			B:没有构造方法	成员可能都是静态的
		9:看成员方法
			A:左边
				是否静态：如果静态，可以通过类名调用
				返回值类型：人家返回什么，用什么接收。
			B:右边
				看方法名：方法名称不要写错
				参数列表：要什么，给什么；要几个，给几个
*/

class ArrayToolTest{
	public static void main(String[] args){
		int [] arr = {24,23,12,2345};
		//数组遍历
		ArrayTool.printArray(arr);
		//获取最大值
		int max = ArrayTool.getMax(arr);
		System.out.println("max:" + max);
		//获取索引值
		int index = ArrayTool.getIndex(arr,55);
		System.out.println("index:" + index);
	}
}