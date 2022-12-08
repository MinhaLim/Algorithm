import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
		int len=0;
		//commands의 열의 수만큼 돌림
		for(int a=0;a<commands.length;a++) {
			//arr1의 i번째부터 j까지 -> 배열 arr1에 넣기
			len = commands[a][1]-commands[a][0] +1;
			int[] arr1 = new int[len];
			for(int i=0, j=commands[a][0];j<=commands[a][1];i++,j++) {
				arr1[i]=array[j-1];
			}
			//정렬
			Arrays.sort(arr1);
			//k == commands[a][2]-1 찾기
			for(int k=0;k<arr1.length;k++) {
				if(k==(commands[a][2]-1)) {
					answer[a]=arr1[k];
					break;
				}else {
					continue;
				}
			}
			
		}
        return answer;
    }
}