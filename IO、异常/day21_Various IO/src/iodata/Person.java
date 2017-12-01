package iodata;

import java.io.Serializable;

/*
 * NotSerializableException:未序列化异常
 * 类通过实现 java.io.Serializable 接口以启用其序列化功能。未实现此接口的类将无法使其任何状态序列化或反序列化。
 * 该接口没有任何方法，类似于这种没有方法的接口被称为标记接口。
 *Person类实现了序列化接口，那么它本身也应该有一个标记值。
 *
 *序列化数据后，再次修改类文件，读取数据会出问题
 * 		这个标记值假设是100。
 * 		开始的时候：
 * 		Person.class -- id=100
 * 		wirte数据： oos.txt -- id=100
 * 		read数据: oos.txt -- id=100	
 * 
 * 		现在：
 * 		Person.class -- id=200
 * 		wirte数据： oos.txt -- id=100
 * 		read数据: oos.txt -- id=100
 * 
 * 我们在实际开发中，可能还需要使用以前写过的数据，不能重新写入。怎么办呢?
 * 原因是因为它们的id值不匹配。
 * 每次修改java文件的内容的时候,class文件的id值都会发生改变。
 * 而读取文件的时候，会和class文件中的id值进行匹配。所以，就会出问题。
 * 但是呢，如果我有办法，让这个id值在java文件中是一个固定的值，这样，你修改文件的时候，这个id值还会发生改变吗?
 * 不会。现在的关键是我如何能够知道这个id值如何表示的呢?
 * 点黄色警告线
 * 
 * 		看到类实现了序列化接口的时候，要想解决黄色警告线问题，就可以自动产生一个序列化id值。
 * 		而且产生这个值以后，对类进行任何改动，它读取以前的数据是没有问题的。
 * 
 * 	一个类中可能有很多的成员变量，有些我不想进行序列化。
 * 		使用transient关键字声明不需要序列化的成员变量* 
 * 
 */
public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5781886279594095827L;
	
	//private transient int age;   age不被序列化，read时候，age的值就不会被读出，age为0
	private int age;
	private String name;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
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

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

}
