package bigInteger;

import java.math.BigInteger;

/*
 * 
 * BigInteger �����ó���Integer��Χ�ڵ����ݽ�������
 *	public BigInteger(String val)��  string ����
 *  �� BigInteger ��ʮ�����ַ�����ʾ��ʽת��Ϊ BigInteger
 *  
 *  public BigInteger add(BigInteger val)
 *public BigInteger subtract(BigInteger val)
 *public BigInteger multiply(BigInteger val)
 *public BigInteger divide(BigInteger val)
 *public BigInteger[] divideAndRemainder(BigInteger val) �����̺�����������
 *  
 *  
 */
public class BigIntegerDemo {
	public static void main(String[] args) {
		BigInteger bi1 = new BigInteger("100");
		BigInteger bi2 = new BigInteger("50");

		System.out.println("add" + bi1.add(bi2));
		System.out.println("sub" + bi1.subtract(bi2));
		System.out.println("mul" + bi1.multiply(bi2));
		System.out.println("divide" + bi1.divide(bi2));

		BigInteger[] bis = bi1.divideAndRemainder(bi2);
		System.out.println("�̺�����" + bis[0] + "," + bis[1]);
	}
}
