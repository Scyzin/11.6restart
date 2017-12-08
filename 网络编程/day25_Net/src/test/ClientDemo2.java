package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientDemo2 {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("49.123.70.11", 45678);

		BufferedReader br = new BufferedReader(new FileReader("ServerDemo.java"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();

		}
		s.close();

	}
}
