package bigInteger;

import java.math.BigInteger;

/*
 * 
 * BigInteger 可以让超过Integer范围内的数据进行运算
 *	public BigInteger(String val)：  string 类型
 *  将 BigInteger 的十进制字符串表示形式转换为 BigInteger
 *  
 *  public BigInteger add(BigInteger val)
 *public BigInteger subtract(BigInteger val)
 *public BigInteger multiply(BigInteger val)
 *public BigInteger divide(BigInteger val)
 *public BigInteger[] divideAndRemainder(BigInteger val) 返回商和余数的数组
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
		System.out.println("商和余数" + bis[0] + "," + bis[1]);
	}
}
