/*
	��ά���飺
		һ��Ԫ��Ϊһά��������顣
	��ʽ1��
		��������[][] ������= new ��������[m][n];
			int [][]arr = new int [3][2];
			����һά����arr[]��һά�����ŵ��ǵ�ַ��ÿ������������2��Ԫ�أ�
			int []x,y[]? x��һά���飬y�Ƕ�ά����
	
	��ʽ2��
		��������[][]������= new ��������[m][];	m�ظ���Ȼ�Ҳ�������ռ��ַ��
		һά�����Ԫ�ض�̬������
		arr[] ������;	arr[][] Ϊ�������Ԫ�أ�
	��ʽ3����������[][]������=new ��������[][]{Ԫ��}{Ԫ��}�� ��̬��ʼ����
			int [][]arr = {{1,2}{3,4}{5,6,7}};
*/
class Array2Demo{
	public static void main(String[] args){
		/*
		int [][]arr = new int [3][2];
		System.out.println(arr);	//��ά�����ֵַ[[I@175078b
		System.out.println(arr[0]);	//һά�����ֵַ[I@42552c
		System.out.println(arr[1]);	//��ֵַ
		System.out.println(arr[1][1]);//0
		System.out.println(arr[2][1]);//0
		*/
		int [][]arr = new int[3][];
		//��̬Ϊһά�������ռ䣻
		/*
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[1];
		System.out.println(arr[0]); //[I@42552c
		System.out.println(arr[1]); //[I@e5bbd6
		System.out.println(arr[2]); //[I@8ee016
		arr[1][2] =0; 
		*/
		int [][]arr = {{1,2}{3,4}{5,6,7}};
		System.out.println(arr[0][1]);
		System.out.println(arr[1][2]);//Խ��
		
	}
}
