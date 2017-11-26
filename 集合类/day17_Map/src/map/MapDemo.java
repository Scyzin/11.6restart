package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * public interface Map<K,V>  K - ��ӳ����ά���ļ������� V - ӳ��ֵ������
 * 
 * ����ӳ�䵽ֵ�Ķ���һ��ӳ�䲻�ܰ����ظ��ļ���ÿ�������ֻ��ӳ�䵽һ��ֵ��
 * ���Դ洢��ֵ�Ե�Ԫ��
 * 
 * ����set��Ψһ�ģ�ֵ��collection��
 * 
 * ����
 * 
 * Map��collection������
 * 		Map����Ԫ�سɶԳ��֣����ϵļ���Ψһ�ģ����ǿ��ظ�������set���ϵģ������	
 *  	Collection ���ϴ洢Ԫ�ص������֣�Set��Ψһ�ģ�List�����ظ���
 *  
 *  Map���ϵ����ݽṹֵ��Լ���Ч����ֵ�޹�
 *  Collection���ϵ����ݽṹ�����Ԫ����Ч
 * 
 * Map���ϵĹ��ܸ�����
 * 1:��ӹ���
 * 		V put(K key,V value):���Ԫ�ء�
 * 			������ǵ�һ�δ洢����ֱ�Ӵ洢Ԫ�أ�����null
 * 			��������ǵ�һ�δ��ڣ�����ֵ����ǰ��ֵ�滻����������ǰ��ֵ
 * 2:ɾ������
 * 		void clear():�Ƴ����еļ�ֵ��Ԫ��
 *  	V remove(Object key)�����ݼ�ɾ����ֵ��Ԫ�أ�����ֵ����
 * 3:�жϹ���
 * 		boolean containsKey(Object key)���жϼ����Ƿ����ָ���ļ�
 * 		boolean containsValue(Object value):�жϼ����Ƿ����ָ����ֵ
 * 		boolean isEmpty()���жϼ����Ƿ�Ϊ��
 * 4:��ȡ����
 * 		Set<Map.Entry<K,V>> entrySet():��ȡ���м�ֵ����ļ���
 *  	V get(Object key):���ݼ���ȡֵ
 * 		Set<K> keySet():��ȡ���������м��ļ���
 * 		Collection<V> values():��ȡ����������ֵ�ļ���
 * 5�����ȹ���
 * 		int size()�����ؼ����еļ�ֵ�ԵĶ���
 */
public class MapDemo {
	public static void main(String[] args) {
		Map<String,String> a = new HashMap<String,String>();
		
		//��Ӽ���
		a.put("5","����ʤ" );
		a.put("10","Ҧ��" );
		a.put("15","����" );
		
		//֮ǰ�Ѿ�����˼�ֵ��Ӧ��ֵ������put���ص���֮ǰ��ֵ
		System.out.println("put" +a.put("15","����" ));
		
		//ɾ�����������ض�Ӧ��ֵ
		System.out.println(a.remove("5"));
		
		//boolean containsKey(Object key)���жϼ����Ƿ����ָ���ļ�
		System.out.println(a.containsKey("5"));
		
		//boolean containsValue(Object value):�жϼ����Ƿ����ָ����ֵ
		System.out.println(a.containsValue("Ҧ��"));
		
		//boolean isEmpty()���жϼ����Ƿ�Ϊ��
		System.out.println(a.isEmpty());
		
		System.out.println(a.size());
		System.out.println("------------");
		
		//V get(Object key):���ݼ���ȡֵ
		System.out.println(a.get("10"));
		
		//Set<K> keySet():��ȡ���������м��ļ���
		Set<String> b = a.keySet();
		for(String s : b) {
			System.out.println(s);
		}
		
		//Collection<V> values():��ȡ����������ֵ�ļ���
		Collection<String> c = a.values();
		for(String s1 :c) {
			System.out.println(s1);
		}
		
		//����Ԫ�ص��ַ����ı�ʾ
		System.out.println("Map:" + a);
	}
}
