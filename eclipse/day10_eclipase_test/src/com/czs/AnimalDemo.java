package com.czs;

import com.czs_02.Animal;
import com.czs_02.Cat;
import com.czs_02.Dog;

public class AnimalDemo {
	public static void main(String[] args) {
		//animal
		Animal a = new Cat();
		a.eat();
		System.out.println("-----");
		
		a = new Dog();
		a.eat();
		a.sleep();
		//��ʹ�����߹���
		
		Dog d = (Dog)a;
		d.eat();
		d.sleep();
		d.Jump();
	}
}
