/*
	if���ĸ�ʽ3��
		if(�Ƚϱ��ʽ1) {
			�����1;
		}else if(�Ƚϱ��ʽ2) {
			�����2;
		}else if(�Ƚϱ��ʽ3) {
			�����3;
		}
		...
		else {
			�����n+1;
		}
*/
import java.util.Scanner;
class IfDemo2{
	public static void main(String[] args){
		//���󣺼���¼��һ���ɼ����жϲ�����ɼ��ĵȼ���
		/*
			90-100 ����
			80-90  ��
			70-80  ��
			60-70  ����
			0-60   ������
		*/
		
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ĳɼ�,0-100��֮��");
		//����ɼ�
		int a = sc.nextInt();
		if(a < 0 && a > 100){
			System.out.println("����ɼ�����");
		}else if (a > 90 && a < 100){
			System.out.println("����");
		}else if (a > 80&& a < 90){
			System.out.println("��");
		}else if (a > 70 && a < 80){
			System.out.println("��");
		}else if (a > 60 && a < 70){
			System.out.println("����");
		}else{
			System.out.println("������");
		}
		//���󣺼���¼��x��ֵ�������y�Ĳ������
/*		x>=3	y = 2x + 1;
		-1<=x<3	y = 2x;
		x<=-1	y = 2x �C 1;
		
		������Ҫ¼��,scanner
				����жϣ���if else */
		int x = sc.nextInt();
		int y;
		if (x <= -1){
			 y =2*x + 1;
		}else if(-1 < x && x <3 ){
			 y = 2*x;
		}else{
			 y =2*x + 1;
		}
		System.out.println("y=" + y);
			
		
	}
}