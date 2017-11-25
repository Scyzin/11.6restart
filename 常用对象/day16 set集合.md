## day16 set集合 ##
### set ###
无序、唯一
### hashSet ###
1. 底层数据结构是哈希表
2. 底层依赖两个方法：hashCode()和equals()
3. 如何保证元素唯一性的呢?	由hashCode()和equals()保证的
4. 开发的时候，代码非常的简单，自动生成即可  

### TreeSet ###
1. 底层数据结构是红黑树(是一个自平衡的二叉树)
2. 保证元素的排序方式

			a:自然排序(元素具备比较性)
				让元素所属的类实现Comparable接口
			b:比较器排序(集合具备比较性)
				让集合构造方法接收Comparator的实现类对象

### collection总结 ###
1. list

			有序,可重复
			|--ArrayList
				底层数据结构是数组，查询快，增删慢。
				线程不安全，效率高
			|--Vector
				底层数据结构是数组，查询快，增删慢。
				线程安全，效率低
			|--LinkedList
				底层数据结构是链表，查询慢，增删快。
				线程不安全，效率高
2. Set

			无序,唯一
			|--HashSet
				底层数据结构是哈希表。
				如何保证元素唯一性的呢?
					依赖两个方法：hashCode()和equals()
					开发中自动生成这两个方法即可
			|--LinkedHashSet
					底层数据结构是链表和哈希表
					由链表保证元素有序
					由哈希表保证元素唯一
			|--TreeSet
				底层数据结构是红黑树。
				如何保证元素排序的呢?
					自然排序
					比较器排序
				如何保证元素唯一性的呢?
					根据比较的返回值是否是0来决定
### Collection集合怎么使用? ###

		唯一吗?
		是：Set
			排序吗?
				是：TreeSet
				否：HashSet
		如果你知道是Set，但是不知道是哪个Set，就用HashSet。
			
		否：List
			要安全吗?
				是：Vector
				否：ArrayList或者LinkedList
					查询多：ArrayList
					增删多：LinkedList
		如果你知道是List，但是不知道是哪个List，就用ArrayList。
		如果你知道是Collection集合，但是不知道使用谁，就用ArrayList。
		如果你知道用集合，就用ArrayList。

