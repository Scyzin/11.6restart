package decorate;

public class IPhone implements Phone {

	@Override
	public void call() {
		System.out.println("手机可以打电话了");
	}

}
