package stencil;

public class GetTimeDemo {
	public static void main(String[] args) {
		//多态的调用
		GetTime gt = new ForDemo();
		System.out.println(gt.GetTime());
		
		gt= new IODemo();
		System.out.println(gt.GetTime());
	}
}
