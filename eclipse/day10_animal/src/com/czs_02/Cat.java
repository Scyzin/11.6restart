package com.czs_02;

/**
 * 这是具体的猫类
 * 
 * @author Administrator
 *
 */
public class Cat extends Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("猫吃猫粮");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("猫趴着睡觉");
	}

}
