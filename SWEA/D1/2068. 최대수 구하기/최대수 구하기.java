import java.util.Scanner;
import java.io.FileInputStream;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int[] num = new int[10];
            int temp;
            for(int i=0;i<10;i++){
            	num[i] = sc.nextInt();
            }for(int a=0;a<10;a++){
            	for(int b=0;b<10;b++){
                	if(num[a]>num[b]){
                    	temp = num[a];
                        num[a] = num[b];
                        num[b]= temp;
                    }
                }
            }System.out.println("#"+test_case+" "+num[0]);
            
		}
	}
}