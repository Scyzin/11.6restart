package day22_Thread;
/*
 * �����ӳٺ󣬲���������
 * 		1.��ͬƱ�����     		����ԭ����
 * 		2.���ָ���Ʊ			����Ժ��ӳٵ��µ�
 * 
 * Ϊʲô�������⣿
 * 		�Ƿ��Ƕ��̻߳���
 * 		�Ƿ��й�������
 * 		�Ƿ��ж�����������������
 * 
 * ��ν����ȫ���⣿
 * 		ֻ���޸ĵ��������Ѷ���������������ݵĴ��������������κ�ʱ��ֻ��
 * 		��һ���߳�ִ�С�
 * 
 * ���õ�ͬ�����ơ�
 * 		synchronized(����){��Ҫͬ���Ĵ���}
 * 		ͬ�����Խ����ȫ����ĸ���ԭ������ڸö�����ͬ���Ĺ��ܡ�
 * 
 * ͬ�����ص㣺
 * 		���߳�
 * 		����߳�ʹ�õ���ͬһ������
 * �ô���
 * 		ͬ���ĳ��ֽ���˶��̵߳İ�ȫ��
 * �׶ˣ�
 * 		�̶߳�ʱ��ÿ���̶߳���ȥ�ж�ͬ���ϵ���������Ч�ʡ�
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		SellTicket st = new SellTicket();
		
		Thread t1 = new Thread(st,"����1");
		Thread t2 = new Thread(st,"����2");
		Thread t3 = new Thread(st,"����3");
		
		t1.start();
		t2.start();
		t3.start();
		
		/*
		 * // �̰߳�ȫ���� StringBuffer sb = new StringBuffer(); 
		 * Vector<String> v = new Vector<String>(); 
		 * Hashtable<String, String> h = new Hashtable<String, String>();
		 * // Vector���̰߳�ȫ��ʱ���ȥ����ʹ��Ҳ������
		 *  // ��ô������˭��? // public static <T>
		 * List<T> synchronizedList(List<T> list) List<String> list1 = new
		 * ArrayList<String>();// �̲߳���ȫ
		 *  List<String> list2 = Collections
		 * .synchronizedList(new ArrayList<String>()); // �̰߳�ȫ
		 */	
		}
}
