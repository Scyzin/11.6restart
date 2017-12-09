package enums;

public enum Direction {
//	FRONT,BEHIND,LEFT,RIGHT; ���õ�ö�ٷ���
	FRONT("ǰ"){
		@Override
		public void show() {
			System.out.println("ǰ");
		}
	},
	BEHIND("��"){
		@Override
		public void show() {
			System.out.println("��");
		}
	},
	LEFT("��"){
		@Override
		public void show() {
			System.out.println("��");
		}
	},RIGHT("��"){
		@Override
		public void show() {
			System.out.println("��");
		}
	};
	
	private String name;
	
	private Direction(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	

	
	public abstract void show();
}
