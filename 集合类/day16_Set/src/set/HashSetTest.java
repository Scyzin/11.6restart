package set;
/*
 * ��дһ�����򣬻�ȡ10��1��20���������Ҫ������������ظ���
 * 
 */
import java.util.HashSet;
import java.util.Random;

public class HashSetTest {
	public static void main(String[] args) {
		//�������������
		Random a = new Random();
		//����set����
		HashSet<Integer> ts = new HashSet<Integer>();
		//�жϼ��ϳ����Ƿ�Ϊ10
		while (ts.size() < 10) {
			int num = a.nextInt(20) + 1;
			//hashset �����ظ���������
			ts.add(num);
		}
		//����
		for (Integer b : ts) {
			System.out.println(b);
		}

	}
}
