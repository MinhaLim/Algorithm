import java.util.Arrays;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxw=0;//가로
		int maxh=0;//세로	
		
		for(int i=0;i<sizes.length;i++) {
			Arrays.sort(sizes[i]);
		}
		for(int i=0;i<sizes.length;i++) {
			for(int j=0;j<sizes[i].length;j++) {
				if(sizes[i][0]>maxw) {
					maxw=sizes[i][0];
				}
				if(sizes[i][1]>maxh) {
					maxh=sizes[i][1];
				}
			}
		}
		answer= maxw*maxh;
        return answer;
    }
}