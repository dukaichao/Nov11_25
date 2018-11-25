package cn.dkc.Nov_25;
/*给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

示例 1:

输入: 123
输出: 321


注意:

假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。
[-2147483648,2147483647]
请根据这个假设，如果反转后整数溢出那么就返回 0。
*/
import java.util.Scanner;

public class reserveNum {
	public int reverse(int x) {
		int t = x;
        int y = Math.abs(x);
        String s = (String) (y+"");
        int len = s.length();
        int sum = 0;
        for(int i = 0;i<len;i++){
            sum += y%10*Math.pow(10,len-i-1);
            y /= 10;
        }
      
        if(-sum<Integer.MIN_VALUE||sum>Integer.MAX_VALUE-1)
        	return 0;
        if(t>=0)
        	return sum;
        else
        	return -sum;
        
    }
    
	public static void main(String[] args) {
		System.out.println("请输入:>");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		System.out.println(new reserveNum().reverse(x));
		
		
		
	}
}
