import java.util.Arrays;
class Solution {
    public int solution(int[] nums) {
        Arrays.sort(nums);
        int cnt=1;
        int num=nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=num){
                cnt++;
                num=nums[i];
            }
        }
        return cnt<nums.length/2? cnt:nums.length/2;
        
//        방법1
//        int answer = nums.length/2;
//        int[] distArr = Arrays.stream(nums).distinct().toArray();
//        if(distArr.length < nums.length/2)
//            answer = distArr.length;
        
        //방법2
		//int answer = 0;
		//int maximum = nums.length / 2;
		//HashSet<Integer> kinds = new HashSet<>();
		//for (int i : nums ) {
		//    kinds.add(i);
		//}
		//if(kinds.size() >= maximum)  answer = maximum;
		//else answer = kinds.size() ;
        //return answer;
        
        
    }
}