package test需要多看;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class ArrayListRandom {
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new FileReader("c.txt"));
		ArrayList< String> ar = new ArrayList<String>();
		String line = null;
		while((line = br.readLine()) !=null) {
			ar.add(line);
		}
		
		Random r = new Random();
		int index = r.nextInt(ar.size());
		
		String name = ar.get(index);
		System.out.println("随机:" + name);
		
	}
}
