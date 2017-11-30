##day20 FileReader##
### 字符流 ###

	(1)字节流操作中文数据不是特别的方便，所以就出现了转换流。
	   转换流的作用就是把字节流转换字符流来使用。
	(2)转换流其实是一个字符流
		字符流 = 字节流 + 编码表
	(3)编码表
		A:就是由字符和对应的数值组成的一张表
		B:常见的编码表
			ASCII
			GBK
			UTF-8	
		C:字符串中的编码问题
			编码
				String -- byte[]
			解码
				byte[] -- String
	(4)IO流中的编码问题
		A:OutputStreamWriter
			OutputStreamWriter(OutputStream os):默认编码，GBK
			OutputStreamWriter(OutputStream os,String charsetName):指定编码。
		B:InputStreamReader
			InputStreamReader(InputStream is):默认编码，GBK
			InputStreamReader(InputStream is,String charsetName):指定编码
		C:编码问题其实很简单
			编码只要一致即可
	(5)字符流
		Reader
			|--InputStreamReader
				|--FileReader
			|--BufferedReader
		Writer
			|--OutputStreamWriter
				|--FileWriter
			|--BufferedWriter
### io小结 ###
	IO流
		|--字节流
			|--字节输入流
				InputStream
					int read():一次读取一个字节
					int read(byte[] bys):一次读取一个字节数组
				
					|--FileInputStream
					|--BufferedInputStream
			|--字节输出流
				OutputStream
					void write(int by):一次写一个字节
					void write(byte[] bys,int index,int len):一次写一个字节数组的一部分
					
					|--FileOutputStream
					|--BufferedOutputStream
		|--字符流
			|--字符输入流
				Reader
					int read():一次读取一个字符
					int read(char[] chs):一次读取一个字符数组
					
					|--InputStreamReader
						|--FileReader
					|--BufferedReader
						String readLine():一次读取一个字符串
			|--字符输出流
				Writer
					void write(int ch):一次写一个字符
					void write(char[] chs,int index,int len):一次写一个字符数组的一部分
					
					|--OutputStreamWriter
						|--FileWriter
					|--BufferedWriter
						void newLine():写一个换行符
						
						void write(String line):一次写一个字符串
