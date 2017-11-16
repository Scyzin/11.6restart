## day12 Scanner String##
### Scanner ###

    	Scanner sc = new Scanner(System.in)  
    	has nextxxx  
    	nextxxx  
    	public int nextInt()  
    	public String nextLine()

### String ###
字符串  
**构造方法**：  

		A:public String()
		B:public String(byte[] bytes)
		C:public String(byte[] bytes,int offset,int length)
		D:public String(char[] value)
		E:public String(char[] value,int offset,int count)
		F:public String(String original)
一但被赋值，就不能改变。  
**判断功能**  

			boolean equals(Object obj)
			boolean equalsIgnoreCase(String str)
			boolean contains(String str)
			boolean startsWith(String str)
			boolean endsWith(String str)
			boolean isEmpty()
**获取功能**  

			int length()
			char charAt(int index)
			int indexOf(int ch)
			int indexOf(String str)
			int indexOf(int ch,int fromIndex)
			int indexOf(String str,int fromIndex)
			String substring(int start)
			String substring(int start,int end)  
**转换功能**  
 
			byte[] getBytes()
			char[] toCharArray()
			static String valueOf(char[] chs)
			static String valueOf(int i)
			String toLowerCase()
			String toUpperCase()
			String concat(String str)

**其他功能**  

			a:替换功能 
				String replace(char old,char new)
				String replace(String old,String new)
			b:去空格功能
				String trim()
			c:按字典比较功能
				int compareTo(String str)
				int compareToIgnoreCase(String str) 