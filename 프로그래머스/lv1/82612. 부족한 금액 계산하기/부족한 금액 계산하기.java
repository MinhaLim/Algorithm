class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum=money;
        for(int i=1;i<=count;i++) {
			sum-=price*i;
		}
		answer = (sum>=0) ? 0 : sum*-1;
        return answer;
    }
}