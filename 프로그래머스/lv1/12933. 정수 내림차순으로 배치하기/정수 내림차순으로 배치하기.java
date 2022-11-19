class Solution {
    public long solution(long n) {
        long answer = 0;
        char[] num = String.valueOf(n).toCharArray();
        int temp=0;
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]<num[j]){
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=(char)temp;
                }
            }
        }
        answer=Long.parseLong(String.valueOf(num));
        return answer;
    }
}