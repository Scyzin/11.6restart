package stencil;
/*
 * 模板设计模式：
 * 			用抽象类定义一个算法的骨架，将算法延迟到子类中实现
 * 优点：
 * 		定义算法骨架的同时，能灵活的实现具体的算法，满足用户多变的需求
 * 缺点：
 * 		算法骨架有改变时，则要改变抽象类
 * 
 * 
 */
public abstract class GetTime {
	public long GetTime() {
		long start = System.currentTimeMillis();
		
		code();
		long end = System.currentTimeMillis();
		return end - start;
		
	}
	public abstract void code();
}

