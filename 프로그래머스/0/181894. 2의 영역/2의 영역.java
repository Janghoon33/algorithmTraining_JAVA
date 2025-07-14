import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int count = 0;
        List<Integer> indexList = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                count++;
                indexList.add(i);
            }
        }
        if(count > 1) {
            answer = Arrays.copyOfRange(arr, indexList.get(0), indexList.get(indexList.size()-1)+1);
        } else if (count > 0) {
            answer = new int[]{2};
        } else {
            answer = new int[]{-1};
        }
        return answer;
    }
}