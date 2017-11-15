package com.czs;

public class Teacher {
	private int age;
	private String name;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Teacher(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public void eat() {}
	
	  
}
