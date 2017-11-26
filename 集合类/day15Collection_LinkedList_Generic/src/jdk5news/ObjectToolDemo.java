package jdk5news;
/*
 * 泛型的测试
 * 
 */
public class ObjectToolDemo {
	public static void main(String[] args) {
		ObjectTool<String> ot = new ObjectTool<String>();
		
		ot.setObj("陈遵胜");
		System.out.println("姓名是" +ot.getObj());
		
		ot.setObj("17");
		System.out.println("年龄是" + ot.getObj());
		
		ObjectTool<Integer> ot2 = new ObjectTool<Integer>();
		ot2.setObj(new Integer(10));
		Integer i = ot2.getObj();
		System.out.println("年龄" + i) ;
		
		//方法的调用
		ObjectTool<Boolean> ot1 = new ObjectTool<>();
		ot1.show(true);
		
	}
}
