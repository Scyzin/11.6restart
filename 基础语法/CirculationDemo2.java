/*
	whileѭ���Ļ�����ʽ��
		while(�ж��������) {
			ѭ�������;
		}
		
		��ʼ�����;
	    while(�ж��������) {
			 ѭ�������;
			 �����������;
		}
		whileѭ����forѭ��������?
		ʹ���������������ѭ�������󣬼���ʹ�ÿ����������Ǹ���������whileѭ����
		������forѭ������֪����forѭ����
		          ��Ϊ��������Ĵ��ڴ�����ʧ����������ڴ��ʹ��Ч�ʡ�
				  
			�����һ����Χ�ģ���forѭ���ǳ���ȷ��
			����ǲ���ȷҪ�����ٴΣ���whileѭ����Ϊ���ʡ�
*/
class CirculationDemo2{
	public static void main(String[] args){
		/*int sum = 0;
		int i = 1;
		while(i <=10){
			sum += i;
			i++;
		}
		System.out.println("��Ϊ" + sum);
		
		//forѭ��ʵ��
		for(int x=0; x<10; x++) {
			System.out.println("112");
		}
		//���ﲻ���ڼ���������
		//System.out.println(x);
		
		//whileѭ��ʵ��
		int y = 0;
		while(y<10) {
			System.out.println("112");
			y++;
		}
		//�����ǿ��Լ������ʵ�
		System.out.println(y);*/
		//0.1m��ֽ���۵������߶ȳ���8848m��
		int count =0;
		int i =1;
		while(i <=884800){
			count ++;
			i *= 2;
			System.out.println("��" + count +"�ε��Ӻ��Ϊ" + i);
		}
		System.out.println("�۵���" + count + "�Σ�ֽ�ŵĺ�Ȳ��������������ĸ߶�");
	}
}