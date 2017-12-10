package stencil;

public class ForDemo extends GetTime {

	@Override
	public void code() {
		for(int x =0; x < 10000; x ++) {
			System.out.println(x);
		}
	}
	
}
