package jdk5news;

public class InterDemo {
	public static void main(String[] args) {
		
		Inter<String> i = new InterImpl();
		i.show("hello");
		
		Inter<Integer> ii = new InterImpl();
		ii.show(100);
	}
}
