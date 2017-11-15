package com.czs_02;

import com.czs_01.Jump;

/**
 * 这是具体的狗类
 * @author Administrator
 *
 */
public class Dog extends Animal implements Jump {

	@Override
	public void Jump() {
		// TODO Auto-generated method stub
		System.out.println("会跳高的狗u");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("狗吃猫粮");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("狗趴着睡觉");
	}

}
