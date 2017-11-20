package system;

/*
 * System 类包含一些有用的类字段和方法。它不能被实例化。 
 * 
 * static void gc() 
          运行垃圾回收器。 
          调用Object类的finalize()方法,并重写
          大量执行对象的释放时，才调用垃圾回收才是最好的。     
    static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
          从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。       
 */
public class SystemGcDemo {
	public static void main(String[] args) {
		Person p = new Person("赵雅芝", 60);
		System.out.println(p);

		p = null;
		System.gc();

	}
}
