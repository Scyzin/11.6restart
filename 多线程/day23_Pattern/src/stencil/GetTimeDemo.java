package stencil;

public class GetTimeDemo {
	public static void main(String[] args) {
		//��̬�ĵ���
		GetTime gt = new ForDemo();
		System.out.println(gt.GetTime());
		
		gt= new IODemo();
		System.out.println(gt.GetTime());
	}
}
