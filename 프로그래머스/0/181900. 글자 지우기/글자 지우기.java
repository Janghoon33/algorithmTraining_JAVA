import java.util.*;

class Solution {
    public StringBuilder solution(String str, int[] indices) {
        StringBuilder answer = new StringBuilder(str);
        int removed = 0;
        Arrays.sort(indices);
        for(int i = 0; i < indices.length; i++){
            int actualIndex = indices[i] - removed;
            if(actualIndex >= 0 && actualIndex < answer.length()) {
                answer.deleteCharAt(actualIndex);
                removed++; 
            }
        }
        return answer;
    }
}