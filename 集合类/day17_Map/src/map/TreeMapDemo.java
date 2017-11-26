package map;

import java.util.Set;
import java.util.TreeMap;
/*
 * TreeMap
 * 
 * µ×²ãÊÇºìºÚÊ÷½á¹¹
 * ÎŞ²ÎÄ¬ÈÏ×ÔÈ»ÅÅĞò
 * 
 */
public class TreeMapDemo {
	public static void main(String[] args) {

		TreeMap<String, String> a = new TreeMap<String, String>();

		a.put("it1", "³Â×ñÊ¤");
		a.put("it2", "³Â×ñÊ¤");
		a.put("it3", "³Â×ñ");
		a.put("it4", "³ÂÊ¤");
		a.put("it2", "³Â×ñ2Ê¤");
		

		Set<String> b = a.keySet();
		for (String s : b) {
			System.out.println(s + "----" + a.get(s));
		}
	}
}