/*
	switch��䣺
		switch(���ʽ){
			case ֵ1�������1��break;
			case ֵ2�������2��break;
			case ֵ3�������3��break;
			default:	�����n��
			break;
			}
		��ʽ���ͣ�
				switchѡ��ṹ��
				���ʽ ȡֵ������byte ,short ,int ,char��
				JDK1.7�Ժ����ڿ�����ö�ٺ�string��
			break;�жϽ���switch��䡣
			default:Ĭ��ֵ������ֵ����ƥ��ʱ����if����else��
		ע�⣺	case��ֵ���ǳ����������Ǳ�����
				case�����ֵ�������ظ��ġ�
				default����ʡ�ԡ�Ҳ���Գ���������λ�á�
				switch������е�breakλ�ã������ǳ���ĩβ��
				
					
*/
import java.util.Scanner;
//�ж��ܼ�
class SwitchDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������1-7");
		int a = sc.nextInt();
		switch(a){
			case 1:
				System.out.println("����һ");
				break;
			case 2:
				System.out.println("���ڶ�");
				break;
			case 3:
				System.out.println("������");
				break;
			case 4:
				System.out.println("������");
				break;
			case 5:
				System.out.println("������");
				break;
			case 6:
				System.out.println("������");
				break;
			case 7:
				System.out.println("������");
				break;
			default:System.out.println("��������ִ���");
				break;//break����ʡ��
		}
		
	}
}
