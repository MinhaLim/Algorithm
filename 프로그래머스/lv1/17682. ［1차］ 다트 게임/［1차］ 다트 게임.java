class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] arr = new int[4];
        char[] c = dartResult.toCharArray();
        int idx = 0;
        int i=0;
        if(c[0]-'0'==1&&c[1]-'0'==0){
            arr[idx]=10;
            i++;
        }
        else arr[idx]=c[0]-'0';
        for(i=1;i<c.length;i++){
            if(c[i]=='S'){
                arr[idx]=(int)Math.pow(arr[idx],1);
            }
            if(c[i]=='D'){
                arr[idx]=(int)Math.pow(arr[idx],2);
            }
            if(c[i]=='T'){
                 arr[idx]=(int)Math.pow(arr[idx],3);
            }
            if(c[i]=='*'){
                if(idx==0) arr[idx]*=2;
                else {
                    arr[idx-1]*=2;
                    arr[idx]*=2;
                }
            }
            if(c[i]=='#'){
                arr[idx]*=-1;
            }
            if(c[i]>='0'&&c[i]<='9'){
                if(c[i+1]=='0') {
                    arr[++idx] = 10;
                    i++;
                }
                else arr[++idx] = c[i]-'0';
            }

        }
        for(int j:arr)
        answer+=j;
        return answer;
    }
}