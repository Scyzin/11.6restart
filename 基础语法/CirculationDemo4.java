/*
	需求：输出四行五列的星星图案
	需求：每行输出与行数相同的星星
		外循环控制行数
		内循环控制列数
		从控制台输出一个99乘法表
		'\x' x表示任意，这种做法叫转移字符。
		
		'\t'	tab键的位置
		'\r'	回车
		'\n'	换行
*/

class CirculationDemo4{
	public static void main(String[] args){
		/*for(int i = 1; i <= 5; i++){
			for(int j =1;j <=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}*/
		for(int i =1; i <=9;i++){
			for(int j =1; j <= i;j++){
				System.out.print("\t" + i*j);
			}System.out.println();
		}
	}
}