package com.czs_01;

public class Student implements Cloneable{
	private String name;
	private int age;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	/*@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//使用学生类的特有成员，要向下转型
		Student s = (Student) obj;
		if (this.name.equals(s.name) && this.age == s.age) {
			return true;
		} else {
			return false;
		}
		//提高效率
		if(this == obj) {
			return true;
		}
		//提高程序的健壮性
		//对象名 instanceof 类名  表示该对象是否是该类名的一个对象
		if(!(obj instanceof Student)) {
			return false;
		}
		Student s =(Student) obj;
		return this.name.equals(s.name) && this.age ==s.age;
	}
*/}
