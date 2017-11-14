/*
	为一开始的类添加个后期培养的功能
	
	接口的特点：
		A：接口用关键字interface表示：
				interface 接口名 {}
		B：为类实现接口 用implements表示
				class 类名 implements 接口名{}
		修饰符 interface 接口名{
			常量声明；
			方法签名；
		}
		C:接口不能实例化
			通过多态来实例化 
		D:接口的子类
			可以是抽象类，意义不大；
			具体类，要重写接口中的所有抽象方法（覆盖） ，
*/
 
interface AnimalTrain{
		public abstract void jump();
}

//抽象类实现接口
abstract class Dog implements AnimalTrain{
	
}

//具体类实现接口
class Cat implements AnimalTrain{
		public void jump(){
			System.out.println("调高");
		}
}

class ApiDemo{
	public static void main(String[] args){
		AnimalTrain at = new Cat();
		at.jump();
	}
}
