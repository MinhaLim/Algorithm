import java.util.Arrays;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        StringBuffer[] tmp=new StringBuffer[strings.length];

        for(int i=0;i<tmp.length;i++){
            StringBuffer a=new StringBuffer();
            a.append(strings[i]);
            a.insert(0,strings[i].charAt(n));
            tmp[i]=a;
        }
        
        Arrays.sort(tmp);

        for(int i=0;i<tmp.length;i++){
            tmp[i].delete(0,1);
            answer[i]=tmp[i].toString();
        }
        return answer;
    }
}