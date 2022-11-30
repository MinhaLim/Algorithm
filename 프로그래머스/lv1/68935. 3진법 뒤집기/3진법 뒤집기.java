class Solution {
    public long solution(long n) {
        long answer = 0;
        long num =0;
        long rev = 0;
        long cnt=0;
        while(n>0){	//3진법
            num+=((long)Math.pow(10,cnt))*(n%3);
            n/=3;
            cnt++; 
        }
        while(num!=0){
            rev = rev*10 +num%10;
            num/=10;
        }
        for(long i=0;i<cnt;i++){
            answer+=(long)Math.pow(3,i)*(rev%10);
            rev/=10;
        }
        return answer;
    }
}