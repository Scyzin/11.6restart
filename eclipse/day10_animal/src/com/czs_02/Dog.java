package com.czs_02;

import com.czs_01.Jump;

/**
 * ���Ǿ���Ĺ���
 * @author Administrator
 *
 */
public class Dog extends Animal implements Jump {

	@Override
	public void Jump() {
		// TODO Auto-generated method stub
		System.out.println("�����ߵĹ�u");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("����è��");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("��ſ��˯��");
	}

}
