package iodata;

import java.io.Serializable;

/*
 * NotSerializableException:δ���л��쳣
 * ��ͨ��ʵ�� java.io.Serializable �ӿ������������л����ܡ�δʵ�ִ˽ӿڵ��ཫ�޷�ʹ���κ�״̬���л������л���
 * �ýӿ�û���κη���������������û�з����Ľӿڱ���Ϊ��ǽӿڡ�
 *Person��ʵ�������л��ӿڣ���ô������ҲӦ����һ�����ֵ��
 *
 *���л����ݺ��ٴ��޸����ļ�����ȡ���ݻ������
 * 		������ֵ������100��
 * 		��ʼ��ʱ��
 * 		Person.class -- id=100
 * 		wirte���ݣ� oos.txt -- id=100
 * 		read����: oos.txt -- id=100	
 * 
 * 		���ڣ�
 * 		Person.class -- id=200
 * 		wirte���ݣ� oos.txt -- id=100
 * 		read����: oos.txt -- id=100
 * 
 * ������ʵ�ʿ����У����ܻ���Ҫʹ����ǰд�������ݣ���������д�롣��ô����?
 * ԭ������Ϊ���ǵ�idֵ��ƥ�䡣
 * ÿ���޸�java�ļ������ݵ�ʱ��,class�ļ���idֵ���ᷢ���ı䡣
 * ����ȡ�ļ���ʱ�򣬻��class�ļ��е�idֵ����ƥ�䡣���ԣ��ͻ�����⡣
 * �����أ�������а취�������idֵ��java�ļ�����һ���̶���ֵ�����������޸��ļ���ʱ�����idֵ���ᷢ���ı���?
 * ���ᡣ���ڵĹؼ���������ܹ�֪�����idֵ��α�ʾ����?
 * ���ɫ������
 * 
 * 		������ʵ�������л��ӿڵ�ʱ��Ҫ������ɫ���������⣬�Ϳ����Զ�����һ�����л�idֵ��
 * 		���Ҳ������ֵ�Ժ󣬶�������κθĶ�������ȡ��ǰ��������û������ġ�
 * 
 * 	һ�����п����кܶ�ĳ�Ա��������Щ�Ҳ���������л���
 * 		ʹ��transient�ؼ�����������Ҫ���л��ĳ�Ա����* 
 * 
 */
public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5781886279594095827L;
	
	//private transient int age;   age�������л���readʱ��age��ֵ�Ͳ��ᱻ������ageΪ0
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
