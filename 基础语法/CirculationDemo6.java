/*
	需求：
	小芳的妈妈每天给她2.5元钱，她都会存起来，但是，
	每当这一天是存钱的第5天或者5的倍数的话，她都会
	花去6元钱，请问，经过多少天，小芳才可以存到100元钱。
	
	分析：
		每天2.5	double daymoney = 2.5;
		存起来	double daysum = 0;
		第一天是	int daycount = 1;
		结果	int dayresult =100;
		如果是存钱的第5天或5的倍数	sum -= 6;
		如果不是	daysum +=daymoney;
*/
class CirculationDemo6{
	public static void main(String[] args){
		double dayMoney = 2.5;
		double daySum = 0;
		int dayCount = 1;
		while(true){
			daySum += dayMoney;
			if(daySum >100){
				System.out.println("共花了" + dayCount +"天存了100块钱");
				break;
			}
			if(dayCount % 5==0){
				daySum -= 6;
				System.out.println("第" + dayCount +"天花了6块钱");
			}
			dayCount++;//少了这个最后的输出会差很多。
		}
	}
}