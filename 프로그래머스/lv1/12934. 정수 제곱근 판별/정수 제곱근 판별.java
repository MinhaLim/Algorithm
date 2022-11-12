class Solution {
    public long solution(long n) {
        long answer = 0;
        boolean a = false;
        for(long x = 1; x * x <= n; x++){
            if(x * x == n){
                a = true;
                answer = x;
            }
        }

        if(a){
            answer = (answer + 1) * (answer + 1);
            return answer;
        }else{
            return -1;
        }
    }
}