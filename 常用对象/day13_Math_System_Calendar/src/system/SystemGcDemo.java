package system;

/*
 * System �����һЩ���õ����ֶκͷ����������ܱ�ʵ������ 
 * 
 * static void gc() 
          ���������������� 
          ����Object���finalize()����,����д
          ����ִ�ж�����ͷ�ʱ���ŵ����������ղ�����õġ�     
    static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
          ��ָ��Դ�����и���һ�����飬���ƴ�ָ����λ�ÿ�ʼ����Ŀ�������ָ��λ�ý�����       
 */
public class SystemGcDemo {
	public static void main(String[] args) {
		Person p = new Person("����֥", 60);
		System.out.println(p);

		p = null;
		System.gc();

	}
}
