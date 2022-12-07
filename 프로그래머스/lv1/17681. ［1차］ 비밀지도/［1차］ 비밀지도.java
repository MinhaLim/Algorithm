class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];       
        for(int i = 0; i < n; i++) {
            String bitNum = Integer.toBinaryString(arr1[i] | arr2[i]);
            bitNum = "0".repeat(n - bitNum.length()) + bitNum;
            answer[i] = bitNum.replaceAll("1", "#").replaceAll("0", " ");
        }
        return answer;
    }
}