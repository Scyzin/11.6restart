/*
	������д���
	
	ͨ���ַ���һ��������ӣ����Ǹ���һ�ű�ASCII���
		ͨ���������ű��Ժ�����Ҫ��ס����ֵ��
			'a'		97
			'A'		65
			'0'		48
*/
class DataTypeDemo8 {
	public static void main(String[] args) {
		//ֱ�����һ���ַ�
		System.out.println('a'); //a
		//���һ���ַ���һ���������ӷ�
		System.out.println('a'+1); //98
	}
}
/*
	������д���
		�ַ������ݺ�����������+��������ַ������͡�
		�����+���Ǽӷ����㣬�����ַ������ӷ���
*/
class DataTypeDemo9 {
	public static void main(String[] args) {
		System.out.println("hello"+'a'+1); //helloa1
		System.out.println('a'+1+"hello"); //98hello
		
		System.out.println("5+5="+5+5); //5+5=55
		System.out.println(5+5+"=5+5"); //10=5+5
	}
}