/*
	包：其实就是文件夹。
		把相同的类名放到不同的包中
		对类进行分类管理
	
	分包两种：  
			按功能分
			按模块分
			
	包的定义：
		package  b包名;
		多级包用.分开
	注意事项：
		package语句须是程序的第一条可执行代码
		package语句在一个java文件中只能有一个
		没有package，默认表示无包名
		
	手动式：
		编译，建立包对应的文件夹，将编译后的文件放入对应文件中，通过java命令带包执行
	自动式：
		javac编译的时候带上-d，通过java命令执行
		
	不同包下类之间的访问：
		test里面的访问demo的东西，得加上包名，
		也编译Demo，再编译test，最后运行test。
		每次运行都得加包名 太麻烦了。
		
	导包：
		import 包名；
	package > import > class
	package 只能有一个	import 可以有多个	class 可以有多个，建议是一个
*/
