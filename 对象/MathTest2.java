/*
	�Ķ��ĵ���ѧϰmath��
	�������������
*/
import java.util.Scanner;
public class MathTest2{
	public static void main(String[] args){
	
	//1~100֮����������
	//double a = Math.random()*100 ;
	int b = (int)(Math.random()*100) +1;
	while(true){
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��1~100֮�����");
		int a = sc.nextInt();
	if(a < b){
		System.out.println("��µ���" + a + "С��");
	}else if(a > b){
	System.out.println("��µ���" + a + "����");
	}else{
		System.out.println("��ϲ��¶���");
		break;
	}
	}
	System.out.println(b);
	}
}