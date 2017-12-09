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
		// <T> T valueOf(Class<T> type,String name)从class文件中读取FRONT
		Direction d = Enum.valueOf(Direction.class, "FRONT");
		System.out.println(d.getName());
		System.out.println("----------------");
		// values()
		// 此方法虽然在JDK文档中查找不到，但每个枚举类都具有该方法，它遍历枚举类的所有枚举值非常方便
		Direction[] dirs = Direction.values();
		for (Direction d2 : dirs) {
			System.out.println(d2);
			System.out.println(d2.getName());
		}
	}
}
