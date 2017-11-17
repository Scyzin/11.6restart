## String buffer ##
**线程安全的可变字符串**  
每次string都会创建新对象，耗时，耗空间，StringBuffer可以解决这个问题。  
线程安全：线程同步  医院、银行网站  
不安全：不同步-效率高些	互联网网站、论坛  

toString():任何类型都可以通过这个方法，转换为字符串类型  

**构造方法**  

    public StringBuffer(int capacity)  
    public StringBuffer() 
    public StringBuffer(String str)
**添加功能**

    public StringBuffer append()
    public StringBuffer insert(int offset,String str)
**删除功能**

    public StringBuffer deleteCharAt(int index)
    public StringBuffer delete(int start,int end)
**替换功能**

    public StringBuffer replace(int start,int end,String str)
**反转功能**

    public StringBuffer reverse()

**截取功能**

    public StringBuffer substring(int start)
    public StringBuffer substring(int start,int end) 
## Arrays工具类 ##

**排序**  
冒泡排序；快速排序；选择排序

    public static void sort(数组):
    Arrays.sort()
**查找**  
基本查找；针对数组无序的情况  
二分查找；针对数组有序的情况

    public static int binarySearch(数组,key):
    Arrays.binarySearch();
**转换成字符串**

    public static String toString():
    Arrays.toString(arr1)

## Integer ##

1. 为了让基本类型的数据进行更多的操作，Java就为每种基本类型提供了对应的包装类类型。
2. Integer的构造方法

    Integer i = new Integer(int a);  
    Integer i = new Integer(string str);
1. String和int的相互转换  
 
		A:String -- int
			Integer.parseInt("100");
		B:int -- String
			String.valueOf(100);

1. JDK5的新特性  

		自动装箱	基本类型--引用类型
		自动拆箱	引用类型--基本类型 

Character

构造方法  

    Character ch = new Character('a');
方法
	
	public static boolean isUpperCase(char ch)
	public static boolean isLowerCase(char ch)
	public static boolean isDigit(char ch)
	public static char toUpperCase(char ch)
	public static char toLowerCase(char ch)


