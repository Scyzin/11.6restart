/*
	������ת��䣺
		break:�ж�	��ѡ������к�ѭ�������
				��������ѭ����Ҫ�����ѭ����Ҫ����ǩ:  ��ǩ��: ���
		continue:����
				����һ��ѭ��������ִ���´�ѭ����
		return:����		���������ġ�


*/
class CirculationDemo5{
	public static void main(String[] args){
		/*//break��ʹ�ã���������ѭ��
		for(int i =0; i<10;i++){
			if(i==3){
				break;
			}System.out.print("*");
		}
		//����ָ���Ķ��ѭ��
		wc:for(int i =0; i <10;i++){
			nc :for(int j = 0;j < 10;j++){
				if(j == 2){
					break wc;
				}
				System.out.print("*");
			}
			System.out.println();
		}*/
		//continue��ʹ�ã�����һ��ѭ��
		for(int i =1;i < 10;i++){
			if(i==2){
				continue;
			}
			System.out.println(i);
		}
		//�Ƚ�break,continue,return������
		for(int x=0; x<10; x++) {
			if(x == 2) {
				System.out.println("�˳�");
				//break;
				//continue;
				return;//ֱ�Ӿͽ��������ˡ� 0 1 �˳�
			}
			
			System.out.println(x);
		}	
		System.out.println("over");
	}
}