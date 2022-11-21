class Solution {
    public String solution(String s) {
        String answer = "";
	    char[] str =new char[s.length()];
	        for(int i=0;i<str.length;i++){
	            str[i]=s.charAt(i);
	        }
	        int temp=0;
	        for(int i=0;i<str.length;i++){
	            for(int j=0;j<str.length;j++){
	                if(str[i]>str[j]){
	                    temp = str[i];
	                    str[i]=str[j];
	                    str[j]=(char)temp;
	                }
	            }  
	        }
        for(int i=0;i<str.length;i++){
            answer+=str[i];
        }
	       
        return answer;
    }
}