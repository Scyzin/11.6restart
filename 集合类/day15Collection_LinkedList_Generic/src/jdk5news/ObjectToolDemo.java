package jdk5news;
/*
 * ���͵Ĳ���
 * 
 */
public class ObjectToolDemo {
	public static void main(String[] args) {
		ObjectTool<String> ot = new ObjectTool<String>();
		
		ot.setObj("����ʤ");
		System.out.println("������" +ot.getObj());
		
		ot.setObj("17");
		System.out.println("������" + ot.getObj());
		
		ObjectTool<Integer> ot2 = new ObjectTool<Integer>();
		ot2.setObj(new Integer(10));
		Integer i = ot2.getObj();
		System.out.println("����" + i) ;
		
		//�����ĵ���
		ObjectTool<Boolean> ot1 = new ObjectTool<>();
		ot1.show(true);
		
	}
}
