## day15 list的子类 generic ##
### list的子类 ###
ArrayList vector LinkedList

三种循环遍历

		for(int x = 0;x <a.size(); x ++) {
			Student s =(Student)a.get(x);
			System.out.println(s.getAge() + s.getName());
		}
		System.out.println("-----");
		
		for(Iterator<Student> it = a.iterator();it.hasNext();) {
			Student s = it.next();
			System.out.println(s.getAge() + s.getName());
		}
		System.out.println("-----");
		
		for(Student s :a) {
			System.out.println(s.getAge() + s.getName());
		}


### 泛型 ###
泛型：
特殊的类型。把类型明确的工作推迟到创建对象或者调用方法的时候采取明确的类型。参数化类型，把类型当做参数一样的传递  
格式：<数据类型>，只能是引用类型。

 * 泛型类：把泛型定义在类上
 * 格式:public class 类名<泛型类型1,…>
 * 泛型方法 :泛型定义在方法上
 * 			可以接受输出任意的类型
 * 格式:public <泛型类型> 返回类型 方法名(泛型类型 .)

 * 把泛型定义在接口上
 * 	格式:public  interface 接口名<泛型类型1…>

    ArrayList<String> arr = new ArrayList<>();

### 增强for ###

	for(元素数据类型 变量 : 数组或者Collection集合的对象) {
	使用变量即可，该变量就是元素
    }
简化集合遍历。增强for循环d目标不能为null。
### 静态导入 ###
格式：import static 包名….类名.方法名;

方法必须是静态的。多个类下有同名方法，还得加类名前缀
### 可变参数掌握 ###
格式 :修饰符 返回值类型 方法名(数据类型…  变量名){}

 * 	上面的变量其实是一个数组
 * 	如果有多个参数，可变参数一定是最后一个
`public static <T> List<T> asList(T... a):把数组转成集合`

集合的长度不会变化。
