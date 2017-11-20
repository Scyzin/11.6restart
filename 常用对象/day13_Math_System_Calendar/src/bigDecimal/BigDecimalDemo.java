package bigDecimal;

import java.math.BigDecimal;

/*
 * 由于在运算的时候，float类型和double很容易丢失精度，
 * 为了能精确的表示、计算浮点数，Java提供了BigDecimal
 * 
 * BigDecimal 类提供以下操作：算术、标度操作、舍入、比较、
 * 哈希算法和格式转换。toString() 方法提供 BigDecimal 的规范表示形式。
 * 
 * BigDecimal(BigInteger val) 
          将 BigInteger 转换为 BigDecimal。
 *  BigDecimal(double val)     这个有可能出问题   
 *  
 *    public BigDecimal(String val)
 *    
 *  public BigDecimal add(BigDecimal augend)
	public BigDecimal subtract(BigDecimal subtrahend)
	public BigDecimal multiply(BigDecimal multiplicand)
	public BigDecimal divide(BigDecimal divisor)
	public BigDecimal divide(BigDecimal divisor,int scale,
     int roundingMode)	商，几位小数，如何舍取
 */
public class BigDecimalDemo {
	public static void main(String[] args) {
		System.out.println(1.0 - 0.32);//遗失精度
		
		BigDecimal bd1 = new BigDecimal("0.09");
		BigDecimal bd2 = new BigDecimal("0.01");
		System.out.println("add:" + bd1.add(bd2));
		System.out.println("-------------------");

		BigDecimal bd3 = new BigDecimal("1.0");
		BigDecimal bd4 = new BigDecimal("0.32");
		System.out.println("subtract:" + bd3.subtract(bd4));
		System.out.println("-------------------");

		BigDecimal bd5 = new BigDecimal("1.015");
		BigDecimal bd6 = new BigDecimal("100");
		System.out.println("multiply:" + bd5.multiply(bd6));
		System.out.println("-------------------");

		BigDecimal bd7 = new BigDecimal("1.301");
		BigDecimal bd8 = new BigDecimal("100");
		System.out.println("divide:" + bd7.divide(bd8));
		System.out.println("divide:"
				+ bd7.divide(bd8, 3, BigDecimal.ROUND_HALF_UP));
		System.out.println("divide:"
				+ bd7.divide(bd8, 8, BigDecimal.ROUND_HALF_UP));
		
		
		
	}
}
