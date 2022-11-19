class Solution {
    public int solution(int num) {
        long n = (long)num;
        int answer = 0;
        while(answer<=500){
            if(n==1 && answer==0){
                answer =0;
                break;
            }else if(answer==500){
                answer=-1;
                break;
            }else if(n==1 && answer!=0){
                break;
            }else if(n%2==0){
                n/=2;
                answer++;
            }else if(n%2!=0){
                n=n*3+1;
                answer++;
            }else if(answer==500){
                answer=-1;
                break;
            }
        }
        System.out.println(answer);
        return answer;
    }
}