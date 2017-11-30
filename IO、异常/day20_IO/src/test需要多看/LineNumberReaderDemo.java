package test需要多看;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
/*
 * public int getLineNumber()
 * 
 * public void setLineNumber(int lineNumber)
 * 
 */
public class LineNumberReaderDemo {
	public static void main(String[] args) throws IOException {
		LineNumberReader a = new LineNumberReader(new FileReader("a.txt"));
		
		a.setLineNumber(10);
		
		String line = null;
		while ((line = a.readLine()) != null) {
			System.out.println(a.getLineNumber() +" " +line);
		}
		a.close();
	}
}
