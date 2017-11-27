package exception;
/*
 * 异常：就是Java程序在运行过程中出现的错误。
 * 
 * Throwable:
 * 		error：系统错误，jvm虚拟机抛出的。例如内存不足等。  编程不处理
 * 		Exception:编译期内的必须进行处理。
 * 				runtime exception:运行期内错误，代码不严谨，需要修正代码
 * 
 * jvm默认处理异常，把异常的名称、原因及出现问题的地方输出在控制台上。程序停止运行。
 * 
 * 如何处理异常?
 * 		A: try ... catch ... finally
 * 		try{
 * 			可能出现问题的代码；		代码越少越好
 * 		}catch(异常名变量){
 * 			针对问题的处理；			必须要有提示内容
 * 		}finally{
 * 			释放处理;
 * 		}
 * 
 * 		注意：平级关系的异常谁前谁后无所谓，
 * 			     如果出现了子父关系，父级必须在前面。
 * 			  exception 只能放最后的catch上
 * 
 *  JDK7出现的新特性
 * 		try{
 * 			
 * 		}catch(异常1 |异常名2| 异常名3  变量名){
 * 		
 * 		}
 * 		
 * 		缺点：
 * 			a 处理问题的方式一直。
 * 			b 异常必须是平级的
 * 			
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		
		//多个异常处理方式1 : 一个个try和catch
		int a = 10;
		int b = 0;
		try {
			System.out.println(a/b + "over");
		}catch(ArithmeticException ae) {
			System.out.println("Exception : an Integer cannot be divided by zero");
		}
		System.out.println("后面的可以继续运行");
		
		int [] arr = {1,2,3,4};
		try {
			System.out.println(arr[4]);
		}catch(ArrayIndexOutOfBoundsException e ){
			System.out.println("索引越界");
		}
		
		/*2：  try{
				.....
			}catch(异常变量名){
				提示内容;
			}catch(异常变量名){
				提示内容;
			}...
	一旦try里面出了问题，就会把问题抛出，平级问题里面寻找，执行catch后面的处理。
	然后try后面的语句就会停止了。
			
			*/
		//2
		try {
			System.out.println(a/b + "over");
			System.out.println(arr[4]);
		}catch(ArithmeticException ae) {
			System.out.println("Exception : an Integer cannot be divided by zero");
		}catch(ArrayIndexOutOfBoundsException e ){
			System.out.println("索引越界");
		}catch (Exception e) {
			System.out.println("出问题了");
		}
		//3
		try {
			System.out.println(a / b + "over");
			System.out.println("后面的不会可以继续运行");
			System.out.println(arr[4]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("出问题了");
		}
		System.out.println("game over");
		
	}

}
