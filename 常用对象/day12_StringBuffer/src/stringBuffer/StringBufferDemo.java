 package stringBuffer;
/*
 *public StringBuffer() 
 *public StringBuffer(int capacity)
 *public StringBuffer(String str)

 *public int capacity():
 *public int length();
 *
 *public String toString() 返回数据中字符串的表现形式
 *
 */
public class StringBufferDemo {
public static void main(String[] args) {
	//无参构造方法，多用这个，造了一个缓冲区
	StringBuffer sb = new StringBuffer();
	//返回字符串的容量，理论值,默认16
	System.out.println("sb.capacity" + sb.capacity());
	//返回长度（字符数），实际值
	System.out.println("sb.length" + sb.length());
	
	//指定容量的字符串缓冲区
	StringBuffer sb2 = new StringBuffer(50);
	//返回字符串的容量，理论值
	System.out.println("sb2.capacity" + sb2.capacity());
	//返回长度（字符数），实际值
	System.out.println("sb2.length" + sb2.length());
	
	//指定字符串内容的字符串缓冲区
	StringBuffer sb3 = new StringBuffer("hello");
	//返回字符串的容量，理论值
	System.out.println("sb3.capacity" + sb3.capacity());
	//返回长度（字符数），实际值
	System.out.println("sb3.length" + sb3.length());
	
}
}
