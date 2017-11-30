package test需要多看;

import java.io.IOException;
import java.io.Reader;
/*
 * 也可以用继承去做
 * 
 */
public class MyLineNumberReader {
	private Reader r;
	private int lineNumber =0;
	public MyLineNumberReader(Reader r) {
		this.r = r;
	}
	
	public String readLine()throws IOException {
		lineNumber ++;
		StringBuilder a = new StringBuilder();
		//用字节流去拼
		int ch = 0;
		while((ch = r.read())!= -1) {
			if(ch =='\r') {
				continue;
			}
			if(ch=='\n') {
				return a.toString();
			}else {
				a.append((char)ch);
			}
		}
			if(a.length()>0) {
				return a.toString();
			}
			return null;
	}
	
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public int getLineNumber() {
	
		return lineNumber;
	}
	
	
	public void close() throws IOException {
		this.close();
	}

}
