package stringBuffer;
/*
 * 添加功能和删除功能
 * 
 * public StringBuffer append();
 * 可以添加任意类型到字符串缓冲区中，并返回字符串缓冲区本身。
 * 
 * public StringBuffer insert(int offset,String str)
 * 在指定位置添加数据，并返回字符串本身
 * 
 * public StringBuffer deleteCharAt(int index)

 * public StringBuffer delete(int start,int end)
 * 
 */

public class StringBuffer_insert {
	public static void main(String[] args) {

		// 创建字符串缓冲区对象
		StringBuffer sb = new StringBuffer();
		StringBuffer s = new StringBuffer();
		/*
		 * StringBuffer sb2 = sb.append("hello"); System.out.println(sb == sb2);
		 */

		// public StringBuffer append();
		// 可以添加任意类型到字符串缓冲区中，并返回字符串缓冲区本身。
		// 没有重新开空间
		sb.append("hello");

		sb.append("hello").append(true).append(12);
		System.out.println("sb:" + sb);

		// public StringBuffer insert(int offset,String str)
		// 在指定位置后添加数据，并返回字符串本身
		sb.insert(5, "world");
		System.out.println("sb：" + sb);
		
		s.append("helloworld");
		
		//public StringBuffer deleteCharAt(int index)
		//删除指定索引位置的一个字符
		s.deleteCharAt(0);
		System.out.println("s:" +s);
		
		// public StringBuffer delete(int start,int end)
		//移除次序列的子字符串中的字符，不包括结束位置
		s.delete(1, 3);
		System.out.println("s:" + s);
		
		//移除所有的数据
		s.delete(0, s.length());
		System.out.println("s:" + s);

	}
}
