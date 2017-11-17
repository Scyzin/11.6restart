package stringBuffer;
/*
 * 替换功能和反转功能
 *
 * public StringBuffer replace(int start,int end,String str)
 * public StringBuffer reverse()
 * 
 * 截取功能(返回值类型为string)
 * public String substring(int start)
 * public String substring(int start,int end)
 * 
 */
public class StringBuffer_Replace_reverse {
public static void main(String[] args) {
	
	//创建字符串缓冲区对象
	StringBuffer s = new StringBuffer();
	
	s.append("helloworld");
	
	//public StringBuffer replace(int start,int end,String str)
	//用字符串替换指定位置。
	s.replace(5, 10, "陈遵胜");
	System.out.println("s:" + s);
	
	//public StringBuffer reverse()
	//反转字符串
	s.reverse();
	System.out.println("s: " + s);
	
	//public String substring(int start)
	//返回值是string，从指定位置开始截取
	String s1 = s.substring(1);
	System.out.println("s1: " + s1);	
	
	//public String substring(int start,int end)
	//截取指定的
	String s2 = s.substring(0, 3);
	System.out.println("s2: " + s2);
}
}
