class Solution {
    static int[] days = {0,31,29,31,30,31,30,31,31,30,31,30,31};
    static String[] weeks = {"FRI","SAT","SUN","MON","TUE","WED","THU"};

    public String solution(int a, int b) {
        String answer = "";
        int day=b;
        if(a==1){
            day = day%7-1;
            if(day==-1)day=6;
            //System.out.println(day);
            answer = weeks[day];
        }else{
            for(int i=1; i<a; i++){
               day += days[i]; 
            }
             day = day%7-1;
             if(day==-1)day=6;
            answer = weeks[day];
        }
        return answer;
    }
}