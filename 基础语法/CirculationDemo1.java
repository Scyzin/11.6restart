/*
	ѭ����䣺forѭ��,whileѭ��,do...whileѭ����
	
	forѭ����ʽ��
		for(��ʼ�����;�ж��������;�����������) {
			ѭ�������;
		}
		ִ�����̣�
			ִ�г�ʼ�����
			ִ���ж��������,���䷵��ֵ��true����false
				�����true���ͼ���ִ��
				�����false���ͽ���ѭ��
			ִ��ѭ�������;
			ִ�п����������
			�ص�B������
			
	ע�����
		�ж�����������ۼ򵥻��Ǹ��ӽ����boolean���͡�
		ѭ������������һ����䣬�����ſ���ʡ�ԣ�����Ƕ�����䣬�����Ų���ʡ�ԡ�������Զ��Ҫʡ�ԡ�
		һ����˵����������ž�û�зֺţ��зֺž�û���������
		
	ˮ�ɻ���
	��ν��ˮ�ɻ�����ָһ����λ�������λ���ֵ������͵��ڸ�������
	������153����һ��ˮ�ɻ�����
	153 = 1*1*1 + 5*5*5 + 3*3*3

*/
class CirculationDemo1{
	public static void main(String[] args){
		/*int sum = 0 ;
		for(int i = 1;i <= 10; i++){
			sum += i; 
			}
			System.out.println("sum = " + sum);*/
			
			//���1-100֮��ż����
			/*int sum = 0 ;
			for(int i = 1;i <= 10; i++){
				if(i % 2==0){
				sum += i; }
			}
			System.out.println("1-100֮��ż����sum = " + sum);
			//5�Ľ׳�
			int sum = 1 ;
			for (int i = 1; i <=5; i++){
				sum *= i;
			}
			System.out.println("5�Ľ׳�" +sum);	*/
		/*���ˮ�ɻ���������ͳ�Ƹ���	
			int n =0;
		for(int x = 100; x < 1000; x++){
			int ge = x %10;
			int shi= x/10%10;
			int bai= x/100%10;
			
			if(x ==(ge*ge*ge + shi*shi*shi + bai*bai*bai)){
				System.out.println(x);
				n++;
			}
		}
			System.out.println("ˮ�ɻ���Ϊ" + n);
		/*	������	
		for(int x=10000; x<100000; x++) {
			
			int ge = x%10;
			int shi = x/10%10;
			int bai  = x/10/10%10;
			int qian = x/10/10/10%10;
			int wan = x/10/10/10/10%10;
			
			if((ge==wan) && (shi==qian) && (ge+shi+qian+wan==bai)) {
				System.out.println(x);
			}
		}*/
		/*ͳ��1-1000֮���������������������ж��ٸ�:
			��3������2
			��5������3
			��7������2*/
			int count = 0;
			for (int x = 0; x <=1000; x++){
				if((x%3==2) && (x % 5 ==3) && (x % 7 ==2)){
					System.out.println("������������:" + x);
					count ++;
				}
			}
			System.out.println(count);

		
	}
}

