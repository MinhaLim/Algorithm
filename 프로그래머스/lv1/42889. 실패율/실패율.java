class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer= new int[N];
		int[] pass = new int[N];	//스테이지 통과
		int[] user = new int[N];	//스테이지에 도달한 플레이어 수
		//실패율 : 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
		double[][] loss = new double[N][2];	//해당스테이지, 실패율
		
		for(int i=0;i<stages.length;i++) {
			for(int j=1;j<N+1;j++) {
				if(stages[i]>j) {
					pass[j-1]+=1;	//각 스테이지를 클리어한 사람 수
				}
				if(stages[i]>=j) {
					user[j-1]+=1;	//각 스테이즈에 머무르거나 이미 통과한 사람 수
				}
			}
		}
		
		for(int a = 0; a < N ; a++){
            loss[a][0] = a+1;
            loss[a][1] = ((user[a]-pass[a])/(double)user[a]);
        }//실패율 구하기

        for (int i = 0; i < loss.length;i++){
            for(int j = i+1; j < loss.length;j++){
                double[] temp = {};
                if (loss[i][1] < loss[j][1]) {
                    temp = loss[i];
                    loss[i] = loss[j];
                    loss[j] = temp;
                    //실패율에 따라 리스트의 위치를 바꿈
                }
                if (loss[i][1] == loss[j][1] && loss[i][0] > loss[j][0]){
                    temp = loss[i];
                    loss[i] = loss[j];
                    loss[j] = temp;
                    //실패율이 동일할 경우의 스테이지를 오름차순으로 정렬
                }
            }
        }

        for (int i = 0; i < loss.length;i++){
            answer[i] = (int) loss[i][0];
        }
        return answer;
    }
}