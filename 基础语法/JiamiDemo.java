/*
	ĳ����˾���ù��õ绰����������Ϣ��������С��8λ��������Ϊ��ȷ����ȫ��
	�ڴ��ݹ�������Ҫ���ܣ����ܹ������£�
		���Ƚ����ݵ���Ȼ��ÿλ���ֶ�����5�����úͳ���10��������������֣�
		��󽫵�һλ�����һλ���ֽ����� ���������һ��С��8λ��������
		Ȼ�󣬰Ѽ��ܺ�Ľ���ڿ���̨��ӡ������ 
		
	�������������˴�������ת��ʱ����Щ�����ǿյģ�����Ĭ��ֵ��0;	
*/
import java.util.Scanner;
class JiamiDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ���ܵĵ绰��");
		int a = sc.nextInt();
		if(a >= 100000000 || a < 0){
			System.out.println("����ĵ绰�����д�");
		}
		int arr[] = TransformArray(a);
		Jiami(arr);
		printArray(arr);
	}
	//��ת��Ϊ����,���ҵ�����
	public static int[] TransformArray(int a){
 		int arr[] = new int [8];
		int index = 0;
		while(a > 0){
			arr[index] = a % 10;
			index++;
			a /= 10;
		}
		return arr;
	}
	//�����㷨	
	public static void Jiami(int []arr){
		for(int i = 0; i < arr.length;i ++){
			arr[i] += 5;
			arr[i] %= 10;
		}
		int temp = arr[0];
		arr[0] = arr[arr.length-1];
		arr[arr.length-1] = temp; 	
	}
	//�������
	public static void printArray(int [] arr){
		System.out.println("��Ҫ���ܵĺ���Ϊ:");
		for(int i = 0;i < arr.length;i ++){
			System.out.println(arr[i]);
		}
	}
	/*��ȷ����
	//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//������һ������
		System.out.println("������һ������(С��8λ)��");
		int number = sc.nextInt();
		
		//д����ʵ�ְ�number���м���
		//����
		String result = jiaMi(number);
		System.out.println("���ܺ�Ľ���ǣ�"+result);
	}
	
	
		����дһ�����ܣ�������numberʵ�ּ��ܡ�
		������ȷ��
			����ֵ���ͣ�String ��һ���ַ�����ƴ�ӡ�
			�����б�int number
	
	public static String jiaMi(int number) {
		//��������
		int[] arr = new int[8];
		
		//��������
		int index = 0;
		
		//��number�е�������취�ŵ�������
		while(number > 0) {
			arr[index] = number%10;
			index++;
			number /= 10;
		}
		
		//��ÿ�����ݼ�5��Ȼ���10ȡ������
		for(int x=0; x<index; x++) {
			arr[x] += 5;
			arr[x] %= 10;
		}
		
		//�ѵ�һλ�����һλ����
		int temp = arr[0];
		arr[0] = arr[index-1];
		arr[index-1] = temp;
		
		//�������Ԫ��ƴ�ӳ�һ���ַ�������
		//����һ���������ַ���
		String s = "";
		
		for(int x=0; x<index; x++) {
			s += arr[x];
		}
		
		return s;
		*/
}
