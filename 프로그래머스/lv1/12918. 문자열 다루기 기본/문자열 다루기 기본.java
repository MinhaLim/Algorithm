class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int[] num = new int[s.length()];
        for(int i=0;i<s.length();i++){
            num[i]=s.charAt(i);
            
        }
        if(s.length()==4 || s.length()==6){
        	for(int i=0;i<s.length();i++) {
        		if((num[i]-'0')>=0 && (num[i]-'0')<=9) {
        			answer = true;
        		}else {
        			answer = false;
        			break;
        		}
        	}
        }else{
            answer = false;
        }
        return answer;
    }
}