package jdk5news;
/*
 * 把泛型定义在接口上
 * 	格式:public  interface 接口名<泛型类型1…>
 */
public interface Inter<T> {
	public abstract void show(T t);
}
