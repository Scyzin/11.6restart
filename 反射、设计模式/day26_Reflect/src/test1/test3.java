package test1;
/*
 * 通过一个类
 * 
 */
public class test3 {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Person p = new Person();
		Tool t = new Tool();
		t.setProperty(p, "name","陈遵胜");
		t.setProperty(p, "age", 17);
		System.out.println(p);
		
		
		Dog d = new Dog();
		t.setProperty(d, "sex", '男');
		t.setProperty(d, "price", 654f);
		System.out.println(d);
	}
}
class Person{
	private String name;
	public int age;
	
	@Override
	public String toString() {
		return name +"---" + age;
	}
}

class Dog{
	char sex;
	float price;
	
	@Override
	public String toString() {
		return sex + "---" +price;
	}
}