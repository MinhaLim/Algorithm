import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();
		    for (int i=0; i<arr.length; i++){
		      if(i==0){
		           list.add(arr[i]);
		      }else if(arr[i] != arr[i-1]){
		          list.add(arr[i]);
		      }
		    }
		   answer = new int[list.size()];
		   for(int a =0; a<list.size(); a++){
		      answer[a] = list.get(a);
		   }
        return answer;
    }
}