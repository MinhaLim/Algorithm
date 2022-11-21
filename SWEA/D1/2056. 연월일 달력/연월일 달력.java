import java.util.Scanner;
import java.io.FileInputStream;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		for(int test_case = 1; test_case <= T; test_case++)
		{
            int num = sc.nextInt();
            int year = num/10000;
            int month = (num/100)%100;
            int day = num%100;

            if((month<1 || month >12) || (day<1 || day>days[month-1])){
                System.out.println("#"+test_case+" "+"-1");
            }
            else{
                String year2 = String.format("%04d",year);
                String month2 = String.format("%02d",month);
                String day2 = String.format("%02d",day);
            	System.out.println("#"+test_case+" "+year2+"/"+month2+"/"+day2);
            }
        }
	}
}