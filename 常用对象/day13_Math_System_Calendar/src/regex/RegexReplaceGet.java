package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * public String replaceAll(String regex,String replacement)
 * ʹ�ø����� replacement �滻���ַ�������ƥ�������������ʽ�����ַ���
 * 
 * ��ȡ���� pattern��matcher
 * 	���� ʹ��˳�������档
 * 
 * ��ȡ�������ַ���ɵĵ���
 *	da jia ting wo shuo , jin tian yao xia yu, bu shang wan zi	zixi,xing bu?
 */
public class RegexReplaceGet {
	public static void main(String[] args) {
		
		String s ="hello123124worda868483****world";
		//�������
		String regex = "\\d+";
		String s2 = "*";
		String s1 = s.replaceAll(regex, s2);
		System.out.println(s1);
		
		//ģʽ��ƥ����ĵ��͵���˳��
		//��������ʽ�����ģʽ����
		Pattern p = Pattern.compile("a*b");
		//ͨ��ģʽ����õ�ƥ��������
		Matcher m = p.matcher("aaaaab");
		//����ƥ�������Ĺ���,matches\loogingat\find
		boolean b = m.matches();
		
		String s3 ="da jia ting wo shuo , jin tian yao xia yu, bu shang wan zi	zixi,xing bu?";
		String regex2 = "\\b\\w(3)\\b";
		Pattern p2 =Pattern.compile(regex);
		Matcher m2 = p2.matcher(s3);
		//Ҫfind�����group
		while(m2.find()) {
			System.out.println(m.group());
		}
		
	}
}
