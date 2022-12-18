//import java.util.Arrays;
class Solution {
    public int solution(int[] nums) {
        int answer=0;
		int len=nums.length;
		
		//Arrays.sort(nums);
		for(int i=0;i<len-2;i++) {
			for(int j=i+1;j<len-1;j++) {
				for(int k=j+1;k<len;k++) {
					int num = nums[i]+nums[j]+nums[k];
					for(int a=2;a<=num;a++) {
						if(num==a) {
							answer++;
						}else if(num%a==0) {
							break;
						}
					}
				}
			}
		}
        return answer;
    }
}