package decorate;

public class RingPhoneDecorate extends PhoneDecorate {

	public RingPhoneDecorate(Phone p) {
		super(p);
	}

	@Override
	public void call() {
		System.out.println("�ֻ�����������");
		super.call();
	}
}
