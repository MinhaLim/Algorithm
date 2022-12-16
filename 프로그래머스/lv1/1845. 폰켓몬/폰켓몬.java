import java.util.Arrays;
import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
//        int answer = nums.length/2;
        //여기까지는 생각했는데 흠.. 해쉬도 모르고 아래 코드도..
        //자바 공부 다시 해야할듯..
//        int[] distArr = Arrays.stream(nums).distinct().toArray();
//        if(distArr.length < nums.length/2)
//            answer = distArr.length;
		int answer = 0;
		int maximum = nums.length / 2;
		HashSet<Integer> kinds = new HashSet<>();
		for (int i : nums ) {
		    kinds.add(i);
		}
		if(kinds.size() >= maximum)  answer = maximum;
		else answer = kinds.size() ;
        return answer;
    }
}