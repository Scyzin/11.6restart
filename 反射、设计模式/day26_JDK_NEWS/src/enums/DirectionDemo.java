package enums;
/*
 * ����ö����Ҫ�ùؼ���enum
	����ö���඼��Enum������
	ö����ĵ�һ���ϱ�����ö������һ��ö�����ķֺ��ǿ���ʡ�Եģ�
		�������ö�����������Ķ���������ֺžͲ���ʡ�ԡ����鲻Ҫʡ��
	ö��������й���������������private�ģ���Ĭ�ϵ�Ҳ��private�ġ�
		ö������÷��Ƚ����⣺ö��(����);
	ö����Ҳ�����г��󷽷�������ö���������д�÷���
	ö����switch����е�ʹ��
 * 
 */
public class DirectionDemo {
	public static void main(String[] args) {
		Direction d = Direction.FRONT;
		System.out.println( "d:" + d);
		System.out.println(d.getName());
		d.show();
		
		Direction dd = Direction.FRONT;
		dd = Direction.LEFT;

		switch (dd) {
		case FRONT:
			System.out.println("��ѡ����ǰ");
			break;
		case BEHIND:
			System.out.println("��ѡ���˺�");
			break;
		case LEFT:
			System.out.println("��ѡ������");
			break;
		case RIGHT:
			System.out.println("��ѡ������");
			break;
		}
	}
}
