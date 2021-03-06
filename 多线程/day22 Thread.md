## day22 Thread ##
线程依赖于进行而存在的

**进程**：  

就是正在运行的程序。  
进程是系统进行资源分配和调用的独立单位。每一个进程都有它自己的内存空间和系统资源  

**多进程**  

单进程只能做一件事。现在的计算机都是支持多进程的，可以在一个时间段内执行多个任务。并且呢，可以提高CPU的使用率。  
CPU在做着程序间的高效切换让我们觉得是同时进行的。  

**线程**  

在同一个进程内又可以执行多个任务，而这每一个任务我就可以看出是一个线程。

线程：是程序的执行单元，执行路径。是程序使用CPU的最基本单位。

单线程：如果程序只有一条执行路径。

多线程：如果程序有多条执行路径。  

**多线程有什么意义呢**

多线程的存在，不是提高程序的执行速度。其实是为了提高应用程序的使用率。

程序的执行其实都是在抢CPU的资源，CPU的执行权。

多个进程是在抢这个资源，而其中的某一个进程如果执行路径比较多，就会有更高的几率抢到CPU的执行权。线程的执行有随机性。  

**并行**是逻辑上同时发生，指在某一个时间内同时运行多个程序。  
**并发**是物理上同时发生，指在某一个时间点同时运行多个程序。

**jvm虚拟机的启动**  
jvm启动相当于启动了一个进程，该进程创建了一个主线程调用main方法垃圾回收期也会启动，否则会内存溢出。
jvm的启动是多线程的，至少是两个线程。

**多线程的实现方案**

1. 继承Thread类  

		创建自定义类继承Thread类
		重写run方法
		创建对象
		启动线程  
2. 实现runnable接口  **多用这个**

		创建runnable接口
		重写run方法
		创建runnable类的对象
		创建thread的对象，并将上面的接口对象作为构造参数传递

**线程控制**  
线程休眠  

		public static void sleep(long millis)  
线程加入

		public final void join()  
线程礼让

		public static void yield()
后台线程

		public final void setDaemon(boolean on)
中断线程

		public final void stop()
		public void interrupt()
**线程的生命周期**  

		A:新建
		B:就绪
		C:运行
		D:阻塞
		E:死亡  
**多线程的安全问题**  
如何判断？  

		A:是否有多线程环境
		B:是否有共享数据
		C:是否有多条语句操作共享数据
如何解决？

		A:同步代码块
			synchronized(对象) {
				需要被同步的代码;
			}
			这里的锁对象可以是任意对象。
			
		B:同步方法
			把同步加在方法上。
			这里的锁对象是this
			
		C:静态同步方法
			把同步加在方法上。
			这里的锁对象是当前类的字节码文件对象