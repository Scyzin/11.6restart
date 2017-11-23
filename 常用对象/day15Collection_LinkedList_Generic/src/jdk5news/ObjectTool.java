package jdk5news;
/*
 * 泛型类：把泛型定义在类上
 * 格式:public class 类名<泛型类型1,…>

 * 
 * 泛型方法 :泛型定义在方法上
 * 			可以接受输出任意的类型
 * 格式:public <泛型类型> 返回类型 方法名(泛型类型 .)
 * 
 * 把泛型定义在接口上
 * 	格式:public  interface 接口名<泛型类型1…>
 */
public class ObjectTool <T>{
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	//就是arraylist的 add方法
	public <T> void show(T t) {
		System.out.println(t);
	}
	
	
	 

}
