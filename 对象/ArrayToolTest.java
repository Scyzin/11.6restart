/*	
	���дһ�������ĵ���
		дһ��������  
		��һ���ĵ�ע�͡�  
		javadoc�����ĵ�ע��  
		��ʽ��javadoc -d Ŀ¼ -author -version ArrayTool.java
	���ʹ�ð����ĵ���	
		1:�򿪰����ĵ�
		2:�����ʾ���ҵ����������������
		3:֪����Ҫ��˭?��Scanner����
		4:���������������Scanner��Ȼ��س�
		5:����
		java.lang���µ��಻��Ҫ���룬������ȫ����Ҫ���롣
		6:������Ľ��ͺ�˵������������İ汾
		7:����Ľṹ
			��Ա����	�ֶ�ժҪ 	
			���췽��	���췽��ժҪ 
			��Ա���� 	����ժҪ
		8:ѧϰ���췽��	
			A:�й��췽��	�ʹ�������
			B:û�й��췽��	��Ա���ܶ��Ǿ�̬��
		9:����Ա����
			A:���
				�Ƿ�̬�������̬������ͨ����������
				����ֵ���ͣ��˼ҷ���ʲô����ʲô���ա�
			B:�ұ�
				�����������������Ʋ�Ҫд��
				�����б�Ҫʲô����ʲô��Ҫ������������
*/

class ArrayToolTest{
	public static void main(String[] args){
		int [] arr = {24,23,12,2345};
		//�������
		ArrayTool.printArray(arr);
		//��ȡ���ֵ
		int max = ArrayTool.getMax(arr);
		System.out.println("max:" + max);
		//��ȡ����ֵ
		int index = ArrayTool.getIndex(arr,55);
		System.out.println("index:" + index);
	}
}