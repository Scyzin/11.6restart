package enums;
/*
 * 定义枚举类要用关键字enum
	所有枚举类都是Enum的子类
	枚举类的第一行上必须是枚举项，最后一个枚举项后的分号是可以省略的，
		但是如果枚举类有其他的东西，这个分号就不能省略。建议不要省略
	枚举类可以有构造器，但必须是private的，它默认的也是private的。
		枚举项的用法比较特殊：枚举(“”);
	枚举类也可以有抽象方法，但是枚举项必须重写该方法
	枚举在switch语句中的使用
 * 
 */
public class DirectionDemo {
	public static void main(String[] args) {
		Direction d = Direction.FRONT;
		System.out.println( "d:" + d);
		System.out.println(d.getName());
		d.show();
		
		Direction dd = Direction.FRONT;
		dd = Direction.LEFT;

		switch (dd) {
		case FRONT:
			System.out.println("你选择了前");
			break;
		case BEHIND:
			System.out.println("你选择了后");
			break;
		case LEFT:
			System.out.println("你选择了左");
			break;
		case RIGHT:
			System.out.println("你选择了右");
			break;
		}
	}
}
