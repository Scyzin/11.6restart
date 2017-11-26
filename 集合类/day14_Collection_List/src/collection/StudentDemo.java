package collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 
 * 注意：自己的类名不要和学习的要使用的API中的类名相同
 * 		复制代码的时候，容易把那个类所在的包一起过来。小心
 * 		
 * 		可以用for循环的用for循环好。
 * 		
 * 		(Student)a.next().getAge*(;多次用next方法，容易犯错。每次使用
 * 		都是访问一个对象。
 * 
 */
public class StudentDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		Student s = new Student("陈遵胜",22);
		Student s2 = new Student("陈遵胜",23);
		Student s3 = new Student("陈遵胜",24);
		Student s4 = new Student("陈遵胜",24);
		Student s5 = new Student("陈遵胜",25);
		
		
		c.add(s);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		System.out.println("c:" + c);//返回的是地址值
		
		java.util.Iterator a = c.iterator();
		while(a.hasNext()){
			Student sr =(Student)a.next();
			System.out.println(sr.getAge() + sr.getName());
		}
		
		
		/*Object[]obj=c.toArray();
		for(int x = 0; x < obj.length; x ++) {
		sr是向上转型
		Student sr = (Student)obj[x];
		System.out.println(s.getAge()+s.getName());
			} */

	}
}
