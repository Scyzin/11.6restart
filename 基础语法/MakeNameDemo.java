/*
	标识符：就是给类、接口、方法、变量起名字
	
	组成规则：
		A：英文字母大小写
		B:数字字符
		C：$和_
		
	注意事项：
		不能以数字开头
		不能是关键字
		
	常见命名规则：见名知意
		class Student{}
		clss S()
		
		包：
			文件夹，用于把相同的类名进行区分。全部小写。
			单级：czs
			多级：cn.its
			
		类和接口：
			首字符必须大写。
			多个单词，每次单词的首字符必须大写。
			
		方法或者变量：
			一个单词：首字母小写	main
			多个单词：第二个单词开始首字符大写
					studentAge
					
		常量：每个字母全部大写
*/
class MakeNameDemo{
	public static void main(String[] args){
		//正确做法
		int x = 100;
		//正确做法
		int y1 = 100;
		//int public = 100;不能是关键字
	}
}