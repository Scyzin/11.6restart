package exception;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
 * try .. catch... finally
 * 
 * finally���Ƶ����һ����ִ�С�
 * ����֮ǰ��return Ҳ��ִ��
 * 
 * ���ִ�е�finallyǰjvm�˳��ˣ��Ͳ���ִ���ˡ�
 * 
 * ���ã������ͷ��ʷ�����IO�����ݿ��м���
 */

public class ExceptionDemo4 { 
	public static void main(String[] args) {
		String s = "2201-15-";
		SimpleDateFormat c = new SimpleDateFormat("yyyy-MM-dd");
		
		Date d = null;
		try {
			d =c.parse(s);
		}catch(ParseException e){
		 e.printStackTrace();
		}finally {
			System.out.println("����������");
		}
		System.out.println(d);
	}
}
