import java.util.Scanner;
import java.io.FileInputStream;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;
        num = sc.nextInt();
        while(num>0){
        	sum += num%10;
            num/=10;
        }System.out.println(sum);
	}
}