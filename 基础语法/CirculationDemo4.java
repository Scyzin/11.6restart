/*
	��������������е�����ͼ��
	����ÿ�������������ͬ������
		��ѭ����������
		��ѭ����������
		�ӿ���̨���һ��99�˷���
		'\x' x��ʾ���⣬����������ת���ַ���
		
		'\t'	tab����λ��
		'\r'	�س�
		'\n'	����
*/

class CirculationDemo4{
	public static void main(String[] args){
		/*for(int i = 1; i <= 5; i++){
			for(int j =1;j <=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}*/
		for(int i =1; i <=9;i++){
			for(int j =1; j <= i;j++){
				System.out.print("\t" + i*j);
			}System.out.println();
		}
	}
}