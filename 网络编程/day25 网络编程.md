## day25 网络编程 ##
### 网络模型 ###
1. OSI7层模型  
		
2. TCP/IP参考模型  

网络编程三要素：
1.IP地址
2.端口
3.协议

网络编程：用Java语言实现计算机间数据的信息传递和资源共享

网络编程的三要素

		A:IP地址
			a:点分十进制
			b:IP地址的组成
			c:IP地址的分类
			d:dos命令
			e:InetAddress
		B:端口
			是应用程序的标识。范围：0-65535。其中0-1024不建议使用。
		C:协议
			UDP:数据打包,有限制,不连接,效率高,不可靠
			TCP:建立数据通道,无限制,效率低,可靠

**Socket机制**

		A:通信两端都应该有Socket对象
		B:所有的通信都是通过Socket间的IO进行操作的
**UDP协议发送和接收数据**

		发送：
			创建UDP发送端的Socket对象
			创建数据并把数据打包
			发送数据
			释放资源
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while ((line = br.readLine()) != null) {
			if ("886".equals(line)) {
				break;
			}
			byte[] bys = line.getBytes();
			// ip地址对象
			InetAddress address = InetAddress.getByName("DELLWWW-1JBIBES");
			// 端口
			int port = 10086;

			DatagramPacket dp = new DatagramPacket(bys, bys.length, 
					address, port);
			// 调用Socket对象的发送方法发送数据包
			ds.send(dp);
		}
		// 释放资源
		ds.close();
			
		接收：
			创建UDP接收端的Socket对象
			创建数据包用于接收数据
			接收数据
			解析数据包
			释放资源

		DatagramSocket ds = new DatagramSocket(10086);
		while (true) {
			byte[] bys = new byte[1024];
			DatagramPacket dp = new DatagramPacket(bys, bys.length);

			// 调用Socket对象的接收方法接收数据
			ds.receive(dp);// 阻塞式

			// 解析数据包，并显示在控制台
			// 获取对方的ip
			String ip = dp.getAddress().getHostAddress();

			String s = new String(dp.getData(), 0, dp.getLength());
			System.out.println(ip + "传递的数据是:" + s);

			// ds.close(); 接受端不应该关掉。
**TCP协议发送和接收数据**

		发送：
			创建TCP客户端的Socket对象
			获取输出流，写数据
			释放资源
			
		Socket s = new Socket("49.123.70.11", 6566);
		
		//包装定义的流，键盘录入数据
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//发是通道类的outputstream流，把通道内的流包装一下
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

		String line = null;
		while ((line = br.readLine()) != null) {
			if ("886".equals(line)) {//键盘录入要自定义结束标记
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		s.close();

		接收：
			创建TCP服务器端的Socket对象
			监听客户端连接
			获取输入流，读取数据
			释放资源

		ServerSocket ss = new ServerSocket(6566);
		//监听客户端，返回socket
		Socket s = ss.accept();//这个是阻塞式的。
		
		//包装通道内的流
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String line = null;
			while((line = br.readLine())!=null) {
					System.out.println(line);
				}
		
		//获取输入流，读数据
		
		/*
		 InputStream is = s.getInputStream();
		byte[]bys = new byte[1024];
		String str = new String(bys,0,is.read(bys));堵塞式
		
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip + "-----" + str);*/
		
		s.close();

