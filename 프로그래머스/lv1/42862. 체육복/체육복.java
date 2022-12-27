import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        //교집합 제거를 위한 교집합 생성
		Set<Integer> realReserve, realLost, retainSet;

	    realReserve = Arrays.stream(reserve).boxed().collect(Collectors.toSet());
		realLost = Arrays.stream(lost).boxed().collect(Collectors.toSet());

		retainSet = new HashSet<>(realReserve);
		retainSet.retainAll(realLost);


		realReserve.removeAll(retainSet);
		realLost.removeAll(retainSet);

		for (int r : realReserve)
		    if (realLost.contains(r - 1))
		        realLost.remove(r - 1);
		    else if (realLost.contains(r + 1))
		        realLost.remove(r + 1);

		return n - realLost.size();
    }
}