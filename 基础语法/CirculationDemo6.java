/*
	����
	С��������ÿ�����2.5ԪǮ������������������ǣ�
	ÿ����һ���Ǵ�Ǯ�ĵ�5�����5�ı����Ļ���������
	��ȥ6ԪǮ�����ʣ����������죬С���ſ��Դ浽100ԪǮ��
	
	������
		ÿ��2.5	double daymoney = 2.5;
		������	double daysum = 0;
		��һ����	int daycount = 1;
		���	int dayresult =100;
		����Ǵ�Ǯ�ĵ�5���5�ı���	sum -= 6;
		�������	daysum +=daymoney;
*/
class CirculationDemo6{
	public static void main(String[] args){
		double dayMoney = 2.5;
		double daySum = 0;
		int dayCount = 1;
		while(true){
			daySum += dayMoney;
			if(daySum >100){
				System.out.println("������" + dayCount +"�����100��Ǯ");
				break;
			}
			if(dayCount % 5==0){
				daySum -= 6;
				System.out.println("��" + dayCount +"�컨��6��Ǯ");
			}
			dayCount++;//�����������������ܶࡣ
		}
	}
}