import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int t = 60*a + b +c;
        a = t/60;
        b = t%60;
        
        if(a>=24){
            a=a-24;
        }
        System.out.println(a + " " + b);
        
    }
}