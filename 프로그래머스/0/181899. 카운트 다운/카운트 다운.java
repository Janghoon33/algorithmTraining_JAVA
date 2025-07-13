import java.util.*;

class Solution {
    public int[] solution(int start_num, int end_num) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = end_num; i < start_num+1; i++){
            answer.add(i);
        }
        return answer.stream().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
    }
}