class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int a =x;
        int sum=0;
        for(int i=0;a>0;i++){
            sum+= a%10;
            a/=10;
        }
        
        if(x%sum==0){
            return answer;
        }else{
            answer = false;
            return answer;    
        }
        
    }
}