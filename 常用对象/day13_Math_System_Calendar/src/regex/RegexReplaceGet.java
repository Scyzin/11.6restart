package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * public String replaceAll(String regex,String replacement)
 * 使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串
 * 
 * 获取功能 pattern、matcher
 * 	基本 使用顺序在下面。
 * 
 * 获取由三个字符组成的单词
 *	da jia ting wo shuo , jin tian yao xia yu, bu shang wan zi	zixi,xing bu?
 */
public class RegexReplaceGet {
	public static void main(String[] args) {
		
		String s ="hello123124worda868483****world";
		//定义规则
		String regex = "\\d+";
		String s2 = "*";
		String s1 = s.replaceAll(regex, s2);
		System.out.println(s1);
		
		//模式和匹配其的典型调用顺序
		//将正则表达式编译成模式对象
		Pattern p = Pattern.compile("a*b");
		//通过模式对象得到匹配器对象，
		Matcher m = p.matcher("aaaaab");
		//调用匹配其对象的功能,matches\loogingat\find
		boolean b = m.matches();
		
		String s3 ="da jia ting wo shuo , jin tian yao xia yu, bu shang wan zi	zixi,xing bu?";
		String regex2 = "\\b\\w(3)\\b";
		Pattern p2 =Pattern.compile(regex);
		Matcher m2 = p2.matcher(s3);
		//要find后才能group
		while(m2.find()) {
			System.out.println(m.group());
		}
		
	}
}
