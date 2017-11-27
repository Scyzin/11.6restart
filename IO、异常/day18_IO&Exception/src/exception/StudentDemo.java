package exception;

import java.util.Scanner;

/*
 * 异常注意事项:
 * A:子类重写父类方法时，子类的方法必须抛出相同的异常或父类异常的子类。
 * 		(父亲坏了,儿子不能比父亲更坏)
 * 
 * B:如果父类抛出了多个异常,子类重写父类时,只能抛出相同的异常或者是他的
 * 		子集,子类不能抛出父类没有的异常
 * 
 * C:如果被重写的方法没有异常抛出,那么子类的方法绝对不可以抛出异常,如果
 * 		子类方法内有异常发生,那么子类只能try,不能throws
 * 
 */
public class StudentDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生成绩");
		int t = sc.nextInt();
		try {
			check(t);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void check(int t) throws Exception {
		if (t > 100 || t < 0) {
			throw new MyException("分数出现问题");
		} else {
			System.out.println("分数没有问题");
		}
	}
}
