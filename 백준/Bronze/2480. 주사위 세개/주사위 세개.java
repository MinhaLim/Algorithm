import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c,m;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
       
        if(a == b && a== c && b ==c){
            m = 10000 + a*1000;
            System.out.println(m);
        }else if(a == b){
            m = 1000 + a*100;
            System.out.println(m);
        }else if(a == c){
            m = 1000 + a*100;
            System.out.println(m);
        }else if(b == c){
            m = 1000 + b*100;
            System.out.println(m);
        }else{
            if(a>b){
                if(a>c){
                    m=a*100;  
                    System.out.println(m);
                }else if(a<c){
                    m=c*100;
                    System.out.println(m);
                }
            }else if(a<b){
                if(b>c){
                    m=b*100;  
                    System.out.println(m);
                }else if(b<c){
                    m=c*100;
                    System.out.println(m);
                }else{
                m=c*100;
                System.out.println(m);
                }
            }
        }
	
    }
}