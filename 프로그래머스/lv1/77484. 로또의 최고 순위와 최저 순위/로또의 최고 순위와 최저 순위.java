class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        int[] answer = new int[2];

        int min_count = 0;
        for(int i = 0; i < win_nums.length; i++) {
            for(int num : lottos) {
                if(num == win_nums[i]) {
                    min_count += 1;
                    break;
                }
            }
        }

        int zero_count = 0;
        for(int i = 0; i < lottos.length; i++) {
            if(lottos[i] == 0) {
                zero_count += 1;
            }
        }

        int max_count = zero_count + min_count;

        answer[0] = rank[max_count];
        answer[1] = rank[min_count];

        return answer;
    }
}