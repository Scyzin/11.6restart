package enums;

public enum Direction {
//	FRONT,BEHIND,LEFT,RIGHT; 常用的枚举方法
	FRONT("前"){
		@Override
		public void show() {
			System.out.println("前");
		}
	},
	BEHIND("后"){
		@Override
		public void show() {
			System.out.println("后");
		}
	},
	LEFT("左"){
		@Override
		public void show() {
			System.out.println("左");
		}
	},RIGHT("右"){
		@Override
		public void show() {
			System.out.println("右");
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
