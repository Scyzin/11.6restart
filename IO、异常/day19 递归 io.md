## day19 递归 IO ##
### 递归 ###
方法定义中调用方法本身的现象  

注意事项

		A:要有出口，否则就是死递归
		B:次数不能过多，否则内存溢出
		C:构造方法不能递归使用=
递归一定要写方法：
参数类型：       返回值类型

### IO ###
IO用于在设备间进行数据传输的操作

分类

		A:流向
			输入流	读取数据
			输出流	写出数据
		B:数据类型
			字节流	
					字节输入流
					字节输出流
			字符流
					字符输入流
					字符输出流

FileOutputStream、FileInputStream  
除非用windows自带的记事本可以打开文件，采用字符流。否则，用字节流。

**操作步骤**：
	
			a:创建字节输出流对象.
				系统创建文件，创建对象，将对象指向这个文件
			b:调用write()read()方法
			c:释放资源
FileInputStream fis = new FileInputStream("fos.txt");

实现数据换行：
 			windows \r\n    mac \r	linux \n

追加写入。
  		FileOutputStream(File file, boolean append) 


**两种方式写**：

			
			//方式1
			int by = 0;
			while((by=fis.read())!=-1) {
				System.out.print((char)by);
			}
			
			//方式2
			byte[] bys = new byte[1024];
			int len = 0;
			while((len=fis.read(bys))!=-1) {
				System.out.print(new String(bys,0,len));
			}
			
			fis.close();

**高效字节流**（字节缓冲输入流）：

	BufferedOutputStream a = new BufferedOutputStream(
				new FileOutputStream("c.txt"));
		其它的写和读，与上面的操作类似。

按照字节数组存储的速度快很多。多用字节数组存储的。