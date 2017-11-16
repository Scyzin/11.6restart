/*

*/


interface Inter{
	public abstract void show();
}

class Outer{
	public static Inter method(){
		return new Inter(){
			public void show(){
				System.out.println("Hello,world");
			}
		};
	}
	
}
class InnerClassDemo3{
	public static void main(String[] args){
		Outer.method().show();
	}
}

//ÒªÊä³ö"Hello,world"