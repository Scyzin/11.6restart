package test��Ҫ�࿴;

import java.io.IOException;
import java.io.Reader;
/*
 * Ҳ�����ü̳�ȥ��
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
		//���ֽ���ȥƴ
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
