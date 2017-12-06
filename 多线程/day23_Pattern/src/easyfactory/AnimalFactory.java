package easyfactory;

public class AnimalFactory {
	private AnimalFactory() {
		
	}
	public static Dog creatDog() {
		return new Dog();
	}
	public static Cat creatCat() {
		return new Cat();
	}
	
	public static Animal createAnimal(String type) {
		if("dog".equals(type)) {
			return new Dog();
		}else if("cat".equals(type)){
			return new Cat();
		}else {
			return null;
		}
	}
}
