/*
	代码块：{}
		局部代码块 ：局部位置，用于限定变量的生命周期。
		静态代码块：在类成员位置，在构造代码块前加static，对类进行初始化，只执行一次。
		构造代码块：调用一次构造方法，就调用一次构造代码块。对对象初始化。
	静态代码块 >构造代码块 >构造方法。	
	主方法先于类的构造方法输出。
		
*/
 class Code{
	 static{
		 System.out.println("静态代码块");
	 }
	 {
		 System.out.println("构造代码块");
	 }
	 public Code(){
		 System.out.println("构造方法");
	 }
 }
 class CodeDemo{
	 static{
		 System.out.println("我很开心");
	 }
	 public static void main(String[] args){
		 System.out.println("main方法");
		 
		 Code s1 = new Code();
		 Code s2 = new Code();
	 }
 }	