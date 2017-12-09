package enums;
/*
 * int compareTo(E o)
	String name()
	int ordinal()
	String toString()
	<T> T valueOf(Class<T> type,String name)
	values() 
 * 
 */
public class EnumMethodDemo {
	public static void main(String[] args) {
		// int compareTo(E o)
		Direction d21 = Direction.FRONT;
		Direction d22 = Direction.BEHIND;
		Direction d23 = Direction.LEFT;
		Direction d24 = Direction.RIGHT;
		System.out.println(d21.compareTo(d21));
		System.out.println(d21.compareTo(d24));
		System.out.println(d24.compareTo(d21));
		System.out.println("---------------");
		// String name()
		System.out.println(d21.name());
		System.out.println(d22.name());
		System.out.println(d23.name());
		System.out.println(d24.name());
		System.out.println("--------------");
		// int ordinal()
		System.out.println(d21.ordinal());
		System.out.println(d22.ordinal());
		System.out.println(d23.ordinal());
		System.out.println(d24.ordinal());
		System.out.println("--------------");
		// String toString()
		System.out.println(d21.toString());
		System.out.println(d22.toString());
		System.out.println(d23.toString());
		System.out.println(d24.toString());
		System.out.println("--------------");
		// <T> T valueOf(Class<T> type,String name)��class�ļ��ж�ȡFRONT
		Direction d = Enum.valueOf(Direction.class, "FRONT");
		System.out.println(d.getName());
		System.out.println("----------------");
		// values()
		// �˷�����Ȼ��JDK�ĵ��в��Ҳ�������ÿ��ö���඼���и÷�����������ö���������ö��ֵ�ǳ�����
		Direction[] dirs = Direction.values();
		for (Direction d2 : dirs) {
			System.out.println(d2);
			System.out.println(d2.getName());
		}
	}
}
