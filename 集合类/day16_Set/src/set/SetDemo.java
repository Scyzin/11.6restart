package set;

import java.util.HashSet;
import java.util.Set;

/*
 * set�ص㣺�洢˳����ȡ��˳��һ�£�Ψһ��
 * 		set���Լ��Ĵ洢˳��
 * 		
 * hashset:����ʵ�� Set �ӿڣ��ɹ�ϣ��ʵ������һ�� HashMap ʵ����֧�֡�
 * 			������֤ set �ĵ���˳���ر���������֤��˳���ò��䡣��������
 * 			ʹ�� null Ԫ��
 */
public class SetDemo {
	public static void main(String[] args) {
		
		Set<String> set= new HashSet<String>();
		
		set.add("���");
		set.add("����ʤ");
		set.add("��");
		
		for(String s :set) {
			System.out.println(s);
		}
	}
}
