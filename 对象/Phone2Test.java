/*
	把手机类写成一个标准类，然后创建对象测试功能。
	
	String 类是要大写的
*/
class Phone2{
	private String brand;
	private int price;
	private String color;
	public Phone2{
		
	}
	
	public String getBrand(){
		return brand;
	}
	
	public int getPrice(){
		return price;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setBrand(String brand){
		this.brand = brand;
	}
	
	public void setPrice(int price){
		this.price = price;
	}
	
	public void setColor(String color){
		this.color = color;
	}	
}
class Phone2Test{
	public static void main(String[] args){
		Phone2 p = new Phone2();
		System.out.println(p.getBrand()+"---"+p.getPrice()+"---"+p.getColor());
		
		p.setBrand("华为");
		p.setPrice(2999);
		p.setColor("black");
		
		System.out.println("手机品牌: " + p.getBrand());
		System.out.println("手机价格: " + p.getPrice());
		System.out.println("手机颜色: " + p.getColor());
	}
	
}