class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String lowStr = s.toLowerCase();
        int pcnt=0;
        int ycnt=0;
        
        for(int i=0;i<lowStr.length();i++){
            if(lowStr.charAt(i)=='p'){
                pcnt++;
            }else if(lowStr.charAt(i)=='y'){
                ycnt++;
            }else{
                continue;
            }
        }
        
        if(pcnt==ycnt){
            return answer;
        }else{
            answer=false;
            return answer;
        }
        
        
    }
}