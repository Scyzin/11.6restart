package map;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMapǶ��HashMap
 * 
 */
public class Test2 {
	public static void main(String[] args) {
		HashMap<String, HashMap<String, Integer>> clas = new HashMap<String, HashMap<String, Integer>>();

		HashMap<String, Integer> a = new HashMap<String, Integer>();
		a.put("����ʤ", 19);
		a.put("��ʤ", 20);

		HashMap<String, Integer> b = new HashMap<String, Integer>();
		b.put("����", 21);
		b.put("����", 23);

		clas.put("js", a);
		clas.put("jc", b);

		Set<String> cset = clas.keySet();
		for (String dkey : cset) {
			HashMap<String, Integer> clasValue = clas.get(dkey);
			Set<String> cset2 = clas.get(dkey).keySet();
			for (String dkey2 : cset2) {
				System.out.println(dkey2 + clasValue.get(dkey2));
			}

		}

	}

}
